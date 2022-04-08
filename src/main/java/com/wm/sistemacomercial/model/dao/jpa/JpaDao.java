package model.dao.jpa;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import exception.CustomException;

public abstract class JpaDao<E> implements Dao<E> {

	private Class<E> entityClass;

	private static EntityManagerFactory emf = null;
	private static EntityManager em = null;


	public JpaDao() {
		this.entityClass = (Class<E>) ((ParameterizedType) this.getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
	}

	public static EntityManager createConnectionDB() throws CustomException {
		if (((emf == null) || (!emf.isOpen())) || ((em == null) || (!em.isOpen()))) {
			try {
				emf = Persistence.createEntityManagerFactory("SistemaComercial-jpa");
				return em = emf.createEntityManager();
			} catch (Exception e) {
				throw new CustomException("Error: Conexão com o banco de dados.", e);
			}
		} else {
			return em;
		}

	}

	public EntityManager getEntityManager() throws CustomException {
		if ((em == null) || (!em.isOpen())) {
			return createConnectionDB();
		} else {
			return em;
		}
	}

	@Override
	public void save(E entity) throws CustomException {

		try {

			EntityTransaction tx = getEntityManager().getTransaction();
			tx.begin();
			getEntityManager().persist(entity);
			tx.commit();
		} catch (Exception e) {
			throw new CustomException("Error: Erro ao inserir o dado."+ entity.toString(), e);
		} 
//		finally
//		{
//			em.close();
//		}
	}

	@Override
	public void saveOrUpdate(E entity) throws CustomException {
		try {
			
			EntityTransaction tx = getEntityManager().getTransaction();
			tx.begin();
			getEntityManager().merge(entity);
			tx.commit();			
		} catch (CustomException e) {
			throw new CustomException("Error: Erro ao atualizar os dados."+ entity.toString(), e);

		}
//		finally
//		{
//			em.close();
//		}

	}

	@Override
	public void delete(E entity) throws CustomException {
		try {
		
			EntityTransaction tx = getEntityManager().getTransaction();
			tx.begin();
			getEntityManager().remove(entity);
			tx.commit();		
		} catch (CustomException e) {
			throw new CustomException("Error: Erro ao deletar o registro."+ entity.toString(), e);

		}
//		finally
//		{
//			em.close();
//		}

	}

	@Override
	public E findById(Serializable id) throws CustomException {
		try {
			return getEntityManager().find(entityClass, id);
		} catch (CustomException e) {
			throw new CustomException("Error: Erro ao buscar o registro."+ id.toString(), e);

		}
//		finally
//		{
//			em.close();
//		}
	}

	@Override
	public List<E> findAll() throws CustomException {

		try {
			CriteriaBuilder builder = getEntityManager().getCriteriaBuilder();
			CriteriaQuery<E> query = builder.createQuery(entityClass);
			TypedQuery<E> typedQuery = getEntityManager().createQuery(query.select(query.from(entityClass)));

			List<E> results = typedQuery.getResultList();
			return results;
		} catch (CustomException e) {
			throw new CustomException("Error: Erro ao buscar todos os dados.", e);

		}
//		finally
//		{
//			em.close();
//		}
	}

}

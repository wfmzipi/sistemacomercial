package model.dao.entities;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.JpaDao;
import model.entities.Fornecedor;

public class FornecedorDaoImp extends JpaDao<Fornecedor> implements FornecedorDao {

	@Override
	public List<Fornecedor> findAll() throws CustomException {
		// TypedQuery<Fornecedor> query = getEntityManager().createQuery("SELECT e FROM EstFornecedorado e", Fornecedor.class);

		return (List<Fornecedor>) getEntityManager().createQuery("SELECT e FROM Fornecedor e").getResultList();
	}

}
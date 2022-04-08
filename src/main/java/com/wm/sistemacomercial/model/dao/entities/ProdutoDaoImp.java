package model.dao.entities;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.JpaDao;
import model.entities.Produto;

public class ProdutoDaoImp  extends JpaDao<Produto> implements ProdutoDao {

	@Override
	public List<Produto> findAll() throws CustomException {
		// TypedQuery<Produto> query = getEntityManager().createQuery("SELECT e FROM Produto e", Produto.class);

		return (List<Produto>) getEntityManager().createQuery("SELECT e FROM Produto e").getResultList();
	}

}

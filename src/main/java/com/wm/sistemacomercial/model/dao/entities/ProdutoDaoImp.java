package model.dao.entities;

import java.util.List;

import com.wm.sistemacomercial.model.dao.jpa.JpaDao;
import com.wm.sistemacomercial.model.entities.Produto;
import com.wm.sistemacomercial.view.exception.CustomException;

public class ProdutoDaoImp  extends JpaDao<Produto> implements ProdutoDao {

	@Override
	public List<Produto> findAll() throws CustomException {
		// TypedQuery<Produto> query = getEntityManager().createQuery("SELECT e FROM Produto e", Produto.class);

		return (List<Produto>) getEntityManager().createQuery("SELECT e FROM Produto e").getResultList();
	}

}

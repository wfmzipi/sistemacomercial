package model.dao.servico;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.JpaDao;
import model.entities.ItemOrdemCompra;

public class ItemOrdemCompraDaoImp  extends JpaDao<ItemOrdemCompra> implements ItemOrdemCompraDao {

	@Override
	public List<ItemOrdemCompra> findAll() throws CustomException {
		// TypedQuery<ItemOrdemCompra> query = getEntityManager().createQuery("SELECT e FROM ItemOrdemCompra e", ItemOrdemCompra.class);

		return (List<ItemOrdemCompra>) getEntityManager().createQuery("SELECT e FROM ItemOrdemCompra e").getResultList();
	}

}

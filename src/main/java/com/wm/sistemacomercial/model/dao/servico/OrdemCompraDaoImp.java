package model.dao.servico;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.JpaDao;
import model.entities.OrdemCompra;

public class OrdemCompraDaoImp extends JpaDao<OrdemCompra> implements OrdemCompraDao {

	@Override
	public List<OrdemCompra> findAll() throws CustomException {
		// TypedQuery<OrdemCompra> query = getEntityManager().createQuery("SELECT e FROM OrdemCompra e", OrdemCompra.class);

		return (List<OrdemCompra>) getEntityManager().createQuery("SELECT e FROM OrdemCompra e").getResultList();
	}

}
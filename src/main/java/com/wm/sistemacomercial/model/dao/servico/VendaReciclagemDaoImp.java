package model.dao.servico;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.JpaDao;
import model.entities.VendaReciclagem;

public class VendaReciclagemDaoImp extends JpaDao<VendaReciclagem> implements VendaReciclagemDao {

	@Override
	public List<VendaReciclagem> findAll() throws CustomException {
		// TypedQuery<VendaReciclagem> query = getEntityManager().createQuery("SELECT e FROM VendaReciclagem e", VendaReciclagem.class);

		return (List<VendaReciclagem>) getEntityManager().createQuery("SELECT e FROM VendaReciclagem e").getResultList();
	}

}
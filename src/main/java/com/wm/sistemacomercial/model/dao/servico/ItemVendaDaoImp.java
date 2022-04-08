package model.dao.servico;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.JpaDao;
import model.entities.ItemVenda;

public class ItemVendaDaoImp extends JpaDao<ItemVenda> implements ItemVendaDao {

	@Override
	public List<ItemVenda> findAll() throws CustomException {
		// TypedQuery<ItemVenda> query = getEntityManager().createQuery("SELECT e FROM ItemVenda e", ItemVenda.class);

		return (List<ItemVenda>) getEntityManager().createQuery("SELECT e FROM ItemVenda e").getResultList();
	}

}
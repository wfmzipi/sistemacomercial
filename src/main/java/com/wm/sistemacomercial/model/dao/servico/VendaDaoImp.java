package model.dao.servico;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.JpaDao;
import model.entities.Venda;

public class VendaDaoImp extends JpaDao<Venda> implements VendaDao {

	@Override
	public List<Venda> findAll() throws CustomException {
		// TypedQuery<Venda> query = getEntityManager().createQuery("SELECT e FROM Venda e", Venda.class);

		return (List<Venda>) getEntityManager().createQuery("SELECT e FROM Venda e").getResultList();
	}

}
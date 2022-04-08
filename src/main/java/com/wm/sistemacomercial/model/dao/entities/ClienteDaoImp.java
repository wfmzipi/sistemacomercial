package model.dao.entities;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.JpaDao;
import model.entities.Cliente;

public class ClienteDaoImp extends JpaDao<Cliente> implements ClienteDao{

	@Override
	public List<Cliente> findAll() throws CustomException {
		// TypedQuery<Estado> query = getEntityManager().createQuery("SELECT e FROM Cliente e", Cliente.class);

		return (List<Cliente>) getEntityManager().createQuery("SELECT e FROM Cliente e").getResultList();
	}
	
}

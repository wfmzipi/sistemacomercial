package model.dao.entities;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.JpaDao;
import model.entities.Cliente;
import model.entities.CodigoPostal;

public class CodigoPostalDaoImp extends JpaDao<CodigoPostal> implements CodigoPostalDao{

	@Override
	public List<CodigoPostal> findAll() throws CustomException {
		// TypedQuery<Estado> query = getEntityManager().createQuery("SELECT e FROM CodigoPostal e", Cliente.class);

		return (List<CodigoPostal>) getEntityManager().createQuery("SELECT e FROM CodigoPostal e").getResultList();
	}
	
}

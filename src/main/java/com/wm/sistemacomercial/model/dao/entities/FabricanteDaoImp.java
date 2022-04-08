package model.dao.entities;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.JpaDao;
import model.entities.Fabricante;

public class FabricanteDaoImp extends JpaDao<Fabricante> implements FabricanteDao {

	@Override
	public List<Fabricante> findAll() throws CustomException {
		// TypedQuery<Fabricante> query = getEntityManager().createQuery("SELECT e FROM Fabricante e", Estado.class);

		return (List<Fabricante>) getEntityManager().createQuery("SELECT e FROM Fabricante e").getResultList();
	}
}

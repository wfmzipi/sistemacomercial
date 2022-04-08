package model.dao.entities;

import java.util.List;

import com.wm.sistemacomercial.model.dao.jpa.JpaDao;
import com.wm.sistemacomercial.model.entities.CodigoPostal;
import com.wm.sistemacomercial.view.exception.CustomException;

public class CodigoPostalDaoImp extends JpaDao<CodigoPostal> implements CodigoPostalDao{

	@Override
	public List<CodigoPostal> findAll() throws CustomException {
		// TypedQuery<Estado> query = getEntityManager().createQuery("SELECT e FROM CodigoPostal e", Cliente.class);

		return (List<CodigoPostal>) getEntityManager().createQuery("SELECT e FROM CodigoPostal e").getResultList();
	}
	
}

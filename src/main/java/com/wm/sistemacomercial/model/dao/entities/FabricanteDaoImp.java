package model.dao.entities;

import java.util.List;

import com.wm.sistemacomercial.model.dao.jpa.JpaDao;
import com.wm.sistemacomercial.model.entities.Fabricante;
import com.wm.sistemacomercial.view.exception.CustomException;

public class FabricanteDaoImp extends JpaDao<Fabricante> implements FabricanteDao {

	@Override
	public List<Fabricante> findAll() throws CustomException {
		// TypedQuery<Fabricante> query = getEntityManager().createQuery("SELECT e FROM Fabricante e", Estado.class);

		return (List<Fabricante>) getEntityManager().createQuery("SELECT e FROM Fabricante e").getResultList();
	}
}

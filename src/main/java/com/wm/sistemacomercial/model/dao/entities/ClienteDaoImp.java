package model.dao.entities;

import java.util.List;

import com.wm.sistemacomercial.model.dao.jpa.JpaDao;
import com.wm.sistemacomercial.model.entities.Cliente;
import com.wm.sistemacomercial.view.exception.CustomException;

public class ClienteDaoImp extends JpaDao<Cliente> implements ClienteDao{

	@Override
	public List<Cliente> findAll() throws CustomException {
		// TypedQuery<Estado> query = getEntityManager().createQuery("SELECT e FROM Cliente e", Cliente.class);

		return (List<Cliente>) getEntityManager().createQuery("SELECT e FROM Cliente e").getResultList();
	}
	
}

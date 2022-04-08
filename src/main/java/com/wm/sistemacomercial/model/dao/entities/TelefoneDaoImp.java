package model.dao.entities;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.JpaDao;
import model.entities.Telefone;

public class TelefoneDaoImp  extends JpaDao<Telefone> implements TelefoneDao {

	@Override
	public List<Telefone> findAll() throws CustomException {
		// TypedQuery<TelefoneCliente> query = getEntityManager().createQuery("SELECT e FROM TelefoneCliente e", TelefoneCliente.class);

		return (List<Telefone>) getEntityManager().createQuery("SELECT e FROM Telefone e").getResultList();
	}

}

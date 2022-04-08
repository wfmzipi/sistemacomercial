package model.dao.servico;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.JpaDao;
import model.entities.Servico;

public class ServicoDaoImp  extends JpaDao<Servico> implements ServicoDao {

	@Override
	public List<Servico> findAll() throws CustomException {
		// TypedQuery<Servico> query = getEntityManager().createQuery("SELECT e FROM Servico e", Servico.class);

		return (List<Servico>) getEntityManager().createQuery("SELECT e FROM Servico e").getResultList();
	}

}


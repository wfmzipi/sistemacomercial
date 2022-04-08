package model.dao.servico;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.JpaDao;
import model.entities.OrdemServico;

public class OrdemServicoDaoImp extends JpaDao<OrdemServico> implements OrdemServicoDao {

	@Override
	public List<OrdemServico> findAll() throws CustomException {
		// TypedQuery<OrdemServico> query = getEntityManager().createQuery("SELECT e FROM OrdemServico e", OrdemServico.class);

		return (List<OrdemServico>) getEntityManager().createQuery("SELECT e FROM OrdemServico e").getResultList();
	}

}

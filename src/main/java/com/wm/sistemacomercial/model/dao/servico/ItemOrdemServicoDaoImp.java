package model.dao.servico;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.JpaDao;
import model.entities.ItemOrdemServico;

public class ItemOrdemServicoDaoImp  extends JpaDao<ItemOrdemServico> implements ItemOrdemServicoDao {

	@Override
	public List<ItemOrdemServico> findAll() throws CustomException {
		// TypedQuery<ItemOrdemServico> query = getEntityManager().createQuery("SELECT e FROM ItemOrdemServico e", ItemOrdemServico.class);

		return (List<ItemOrdemServico>) getEntityManager().createQuery("SELECT e FROM ItemOrdemServico e").getResultList();
	}

}

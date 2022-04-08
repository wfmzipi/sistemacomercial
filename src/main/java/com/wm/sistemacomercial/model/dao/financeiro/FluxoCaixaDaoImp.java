package model.dao.financeiro;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.JpaDao;
import model.entities.FluxoCaixa;

public class FluxoCaixaDaoImp extends JpaDao<FluxoCaixa> implements FluxoCaixaDao {

	@Override
	public List<FluxoCaixa> findAll() throws CustomException {
		// TypedQuery<FluxoCaixa> query = getEntityManager().createQuery("SELECT e FROM FluxoCaixa e", FluxoCaixa.class);

		return (List<FluxoCaixa>) getEntityManager().createQuery("SELECT e FROM FluxoCaixa e").getResultList();
	}

}
package model.dao.entities;

import java.util.List;

import com.wm.sistemacomercial.model.dao.jpa.JpaDao;
import com.wm.sistemacomercial.model.entities.Fornecedor;
import com.wm.sistemacomercial.view.exception.CustomException;

public class FornecedorDaoImp extends JpaDao<Fornecedor> implements FornecedorDao {

	@Override
	public List<Fornecedor> findAll() throws CustomException {
		// TypedQuery<Fornecedor> query = getEntityManager().createQuery("SELECT e FROM EstFornecedorado e", Fornecedor.class);

		return (List<Fornecedor>) getEntityManager().createQuery("SELECT e FROM Fornecedor e").getResultList();
	}

}
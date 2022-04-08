package model.dao.entities;
import java.util.List;

import com.wm.sistemacomercial.model.dao.jpa.JpaDao;
import com.wm.sistemacomercial.model.entities.Endereco;
import com.wm.sistemacomercial.view.exception.CustomException;

public class EnderecoDaoImp  extends JpaDao<Endereco> implements EnderecoDao {

	@Override
	public List<Endereco> findAll() throws CustomException {
		// TypedQuery<EnderecoCliente> query = getEntityManager().createQuery("SELECT e FROM EnderecoCliente e", EnderecoCliente.class);

		return (List<Endereco>) getEntityManager().createQuery("SELECT e FROM Endereco e").getResultList();
	}

}

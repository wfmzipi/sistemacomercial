package model.dao.entities;
import java.util.List;

import exception.CustomException;
import model.dao.jpa.JpaDao;
import model.entities.Endereco;

public class EnderecoDaoImp  extends JpaDao<Endereco> implements EnderecoDao {

	@Override
	public List<Endereco> findAll() throws CustomException {
		// TypedQuery<EnderecoCliente> query = getEntityManager().createQuery("SELECT e FROM EnderecoCliente e", EnderecoCliente.class);

		return (List<Endereco>) getEntityManager().createQuery("SELECT e FROM Endereco e").getResultList();
	}

}

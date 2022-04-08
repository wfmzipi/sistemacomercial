package model.dao.entities;

import java.util.List;

import com.wm.sistemacomercial.model.dao.jpa.Dao;
import com.wm.sistemacomercial.model.entities.Cliente;
import com.wm.sistemacomercial.view.exception.CustomException;

public interface ClienteDao extends Dao<Cliente>{
	
	public List<Cliente> findAll() throws CustomException;

}

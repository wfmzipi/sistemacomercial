package model.dao.entities;

import java.util.List;

import com.wm.sistemacomercial.model.dao.jpa.Dao;
import com.wm.sistemacomercial.model.entities.Telefone;
import com.wm.sistemacomercial.view.exception.CustomException;

public interface TelefoneDao extends Dao<Telefone> {
	
	public List<Telefone> findAll() throws CustomException;
 
}

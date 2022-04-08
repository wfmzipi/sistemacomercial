package model.dao.entities;

import java.util.List;

import com.wm.sistemacomercial.model.dao.jpa.Dao;
import com.wm.sistemacomercial.model.entities.CodigoPostal;
import com.wm.sistemacomercial.view.exception.CustomException;

public interface CodigoPostalDao extends Dao<CodigoPostal>{
	
	public List<CodigoPostal> findAll() throws CustomException;

}

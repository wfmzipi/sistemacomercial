package model.dao.entities;

import java.util.List;

import com.wm.sistemacomercial.model.dao.jpa.Dao;
import com.wm.sistemacomercial.model.entities.Fabricante;
import com.wm.sistemacomercial.view.exception.CustomException;

public interface FabricanteDao extends Dao<Fabricante>{
	public List<Fabricante> findAll() throws CustomException;

}

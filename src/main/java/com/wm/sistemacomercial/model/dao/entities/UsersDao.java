package model.dao.entities;

import java.util.List;

import com.wm.sistemacomercial.model.dao.jpa.Dao;
import com.wm.sistemacomercial.model.entities.Users;
import com.wm.sistemacomercial.view.exception.CustomException;

public interface UsersDao extends Dao<Users>{
	
	public List<Users> findAll() throws CustomException;

}

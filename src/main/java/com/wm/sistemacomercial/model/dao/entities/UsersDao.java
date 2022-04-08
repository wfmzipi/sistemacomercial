package model.dao.entities;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.Dao;
import model.entities.Users;

public interface UsersDao extends Dao<Users>{
	
	public List<Users> findAll() throws CustomException;

}

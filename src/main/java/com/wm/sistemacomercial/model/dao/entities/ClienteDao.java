package model.dao.entities;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.Dao;
import model.entities.Cliente;

public interface ClienteDao extends Dao<Cliente>{
	
	public List<Cliente> findAll() throws CustomException;

}

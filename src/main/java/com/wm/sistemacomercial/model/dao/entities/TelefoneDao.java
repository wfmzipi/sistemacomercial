package model.dao.entities;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.Dao;
import model.entities.Telefone;

public interface TelefoneDao extends Dao<Telefone> {
	
	public List<Telefone> findAll() throws CustomException;
 
}

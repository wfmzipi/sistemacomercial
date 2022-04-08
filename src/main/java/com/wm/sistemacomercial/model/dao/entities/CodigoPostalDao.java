package model.dao.entities;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.Dao;
import model.entities.CodigoPostal;

public interface CodigoPostalDao extends Dao<CodigoPostal>{
	
	public List<CodigoPostal> findAll() throws CustomException;

}

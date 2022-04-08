package model.dao.entities;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.Dao;
import model.entities.Fabricante;

public interface FabricanteDao extends Dao<Fabricante>{
	public List<Fabricante> findAll() throws CustomException;

}

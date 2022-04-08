package model.dao.entities;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.Dao;
import model.entities.Fornecedor;

public interface FornecedorDao extends Dao<Fornecedor>{
	public List<Fornecedor> findAll() throws CustomException;

}

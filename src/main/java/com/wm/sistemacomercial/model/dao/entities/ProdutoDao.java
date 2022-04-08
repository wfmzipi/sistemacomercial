package model.dao.entities;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.Dao;
import model.entities.Produto;

public interface ProdutoDao  extends Dao<Produto> {
	
	public List<Produto> findAll() throws CustomException;
 
	
}
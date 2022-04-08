package model.dao.servico;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.Dao;
import model.entities.OrdemCompra;

public interface OrdemCompraDao extends Dao<OrdemCompra> {
	
	public List<OrdemCompra> findAll() throws CustomException;
 
}

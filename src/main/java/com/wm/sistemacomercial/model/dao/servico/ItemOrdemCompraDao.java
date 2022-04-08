package model.dao.servico;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.Dao;
import model.entities.ItemOrdemCompra;

public interface ItemOrdemCompraDao extends Dao<ItemOrdemCompra> {
	
	public List<ItemOrdemCompra> findAll() throws CustomException;
 
}

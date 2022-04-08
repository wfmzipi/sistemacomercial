package model.dao.servico;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.Dao;
import model.entities.ItemVenda;

public interface ItemVendaDao extends Dao<ItemVenda> {
	
	public List<ItemVenda> findAll() throws CustomException;
 
}

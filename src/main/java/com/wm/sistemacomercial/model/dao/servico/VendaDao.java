package model.dao.servico;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.Dao;
import model.entities.Venda;

public interface VendaDao extends Dao<Venda> {
	
	public List<Venda> findAll() throws CustomException;
 
}

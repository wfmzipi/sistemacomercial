package model.dao.servico;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.Dao;
import model.entities.VendaReciclagem;

public interface VendaReciclagemDao extends Dao<VendaReciclagem> {
	
	public List<VendaReciclagem> findAll() throws CustomException;
 
}

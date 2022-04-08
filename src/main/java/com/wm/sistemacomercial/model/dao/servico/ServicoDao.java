package model.dao.servico;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.Dao;
import model.entities.Servico;

public interface ServicoDao extends Dao<Servico> {
	
	public List<Servico> findAll() throws CustomException;
 
}

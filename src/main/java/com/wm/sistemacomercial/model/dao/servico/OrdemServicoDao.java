package model.dao.servico;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.Dao;
import model.entities.OrdemServico;

public interface OrdemServicoDao extends Dao<OrdemServico> {
	
	public List<OrdemServico> findAll() throws CustomException;
 
}

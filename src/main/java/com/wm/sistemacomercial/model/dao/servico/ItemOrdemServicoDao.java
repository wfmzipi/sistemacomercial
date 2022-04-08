package model.dao.servico;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.Dao;
import model.entities.ItemOrdemServico;

public interface ItemOrdemServicoDao extends Dao<ItemOrdemServico> {
	
	public List<ItemOrdemServico> findAll() throws CustomException;
 
}

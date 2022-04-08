package model.dao.financeiro;

import java.util.List;

import exception.CustomException;
import model.dao.jpa.Dao;
import model.entities.FluxoCaixa;

public interface FluxoCaixaDao extends Dao<FluxoCaixa> {
	
	public List<FluxoCaixa> findAll() throws CustomException;
}

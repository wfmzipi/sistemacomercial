package model.dao.entities;

import java.util.List;

import com.wm.sistemacomercial.model.dao.jpa.Dao;
import com.wm.sistemacomercial.model.entities.Fornecedor;
import com.wm.sistemacomercial.view.exception.CustomException;

public interface FornecedorDao extends Dao<Fornecedor>{
	public List<Fornecedor> findAll() throws CustomException;

}

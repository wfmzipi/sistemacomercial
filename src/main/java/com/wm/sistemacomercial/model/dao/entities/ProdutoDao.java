package model.dao.entities;

import java.util.List;

import com.wm.sistemacomercial.model.dao.jpa.Dao;
import com.wm.sistemacomercial.model.entities.Produto;
import com.wm.sistemacomercial.view.exception.CustomException;

public interface ProdutoDao  extends Dao<Produto> {
	
	public List<Produto> findAll() throws CustomException;
 
	
}
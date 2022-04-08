package model.dao.jpa;

import java.io.Serializable;
import java.util.List;

import exception.CustomException;

public interface Dao<E> {

	public void save(E entity) throws CustomException;
	public void saveOrUpdate(E entity) throws CustomException;
	public void delete( E entity ) throws CustomException;
	public List<E> findAll() throws CustomException;
	public E findById( Serializable id ) throws CustomException;
	
}

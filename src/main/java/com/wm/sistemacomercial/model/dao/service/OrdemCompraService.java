package com.wm.sistemacomercial.model.dao.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.wm.sistemacomercial.model.dao.repository.OrdemCompraRepository;
import com.wm.sistemacomercial.model.dao.service.exception.ResourceNotFoundExcepetion;
import com.wm.sistemacomercial.model.entities.OrdemCompra;

@Service
public class OrdemCompraService {

	@Autowired
	private OrdemCompraRepository repository;

	public List<OrdemCompra> findAll() {
		return repository.findAll();
	}

	public OrdemCompra findById(long id) {
		Optional<OrdemCompra> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundExcepetion(id));
	}

	public List<OrdemCompra> findByDataCompra(String data) {
		List<OrdemCompra> obj = repository.findByDataCompra(data);	
		return  obj;
	}	
		
	public List<OrdemCompra> findByDataPagamento(Date data){
		List<OrdemCompra> obj = repository.findByDataPagamento(data);	
		return  obj;
	}		
	
	public List<OrdemCompra> findByStatus(@Param("status") String status){
		List<OrdemCompra> obj = repository.findByStatus(status);	
		return  obj;
	}
	
	public List<OrdemCompra> findByDataCompraBetween( Date DataInicial, Date DataFim){
		List<OrdemCompra> obj = repository.findByDataCompraBetween(DataInicial,DataFim);	
		return  obj;
	}	
	
//	public List<OrdemCompra> findByData_PagamentoBetween( Date DataInicial, Date DataFim){
//		List<OrdemCompra> obj = repository.findByData_PagamentoBetween(DataInicial,DataFim);	
//		return  obj;
//	}	
//	public List<OrdemCompra> findByData_CompraBetweenAndStatus( Date DataInicial,Date DataFim, String Status){	
//		List<OrdemCompra> obj = repository.findByData_CompraBetweenAndStatus(DataInicial,DataFim,Status);	
//		return  obj;
//	}	
		
}

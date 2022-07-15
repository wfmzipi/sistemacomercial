package com.wm.sistemacomercial.model.dao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wm.sistemacomercial.model.dao.repository.OrdemVendaRepository;
import com.wm.sistemacomercial.model.dao.service.exception.ResourceNotFoundExcepetion;
import com.wm.sistemacomercial.model.entities.OrdemVenda;

@Service
public class OrdemVendaService {
	
	@Autowired 
	private OrdemVendaRepository repository;
	
	public List<OrdemVenda> findAll(){		
		return repository.findAll();
	}
	
	public OrdemVenda findById(long id) {
		Optional<OrdemVenda> obj = repository.findById(id);		
		return obj.orElseThrow(() -> new ResourceNotFoundExcepetion(id));
	}
	
	public List<OrdemVenda> findByDataCompra(String data) {
		List<OrdemVenda> obj = repository.findByDataVenda(data);	
		return  obj;
	}
	
	
}

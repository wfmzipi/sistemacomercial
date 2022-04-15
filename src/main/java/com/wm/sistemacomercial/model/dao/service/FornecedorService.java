package com.wm.sistemacomercial.model.dao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wm.sistemacomercial.model.dao.repository.FornecedorRepository;
import com.wm.sistemacomercial.model.dao.service.exception.ResourceNotFoundExcepetion;
import com.wm.sistemacomercial.model.entities.Fornecedor;

@Service
public class FornecedorService {
	
	@Autowired
	private FornecedorRepository repository;
	
	public List<Fornecedor> findAll(){		
		return repository.findAll();
	}
	
	public Fornecedor findById(long id) {
		Optional<Fornecedor> obj = repository.findById(id);		
		return obj.orElseThrow(() -> new ResourceNotFoundExcepetion(id));
	}
	
	public List<Fornecedor> findByNomeContaining(String nome) {
		List<Fornecedor> obj = repository.findByNomeContaining(nome);	
		return  obj;
	}
	
	public List<Fornecedor> findByRegistroContainingIgnoreCase(String registro){
		List<Fornecedor>  obj = repository.findByRegistroContainingIgnoreCase(registro);
		return obj;
	}
	
	public List<Fornecedor> findByEmailContainingIgnoreCase(String email){
		List<Fornecedor>  obj = repository.findByEmailContainingIgnoreCase(email);	
		return obj;
	}
	
	
}

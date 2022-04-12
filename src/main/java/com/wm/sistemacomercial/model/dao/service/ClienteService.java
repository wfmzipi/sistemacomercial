package com.wm.sistemacomercial.model.dao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wm.sistemacomercial.model.dao.repository.ClienteRepository;
import com.wm.sistemacomercial.model.entities.Cliente;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	public List<Cliente> findAll(){		
		return repository.findAll();
	}
	
	public Cliente findById(long id) {
		Optional<Cliente> obj = repository.findById(id);		
		return obj.get();
	}
	
	public List<Cliente> findByNomeContaining(String nome) {
		List<Cliente> obj = repository.findByNomeContaining(nome);	
		return  obj;
	}
	
	public List<Cliente> findByRegistroContainingIgnoreCase(String registro){
		List<Cliente>  obj = repository.findByRegistroContainingIgnoreCase(registro);
		return obj;
	}
	
	public List<Cliente> findByEmailContainingIgnoreCase(String email){
		List<Cliente>  obj = repository.findByEmailContainingIgnoreCase(email);	
		return obj;
	}
	
	
}

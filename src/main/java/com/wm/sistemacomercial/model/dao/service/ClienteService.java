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
	
	public Cliente findByNome(String nome) {
		Cliente obj = repository.findByNome(nome);		
		return obj;
	}
	
	public Cliente findByRegistro(String registro){
		Cliente obj = repository.findByNome(registro);		
		return obj;
	}
	
	public Cliente findByEmail(String email){
		Cliente obj = repository.findByNome(email);		
		return obj;
	}
	
	
}

package com.wm.sistemacomercial.model.dao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wm.sistemacomercial.model.dao.repository.EnderecoRepository;
import com.wm.sistemacomercial.model.dao.service.exception.ResourceNotFoundExcepetion;
import com.wm.sistemacomercial.model.entities.Cliente;
import com.wm.sistemacomercial.model.entities.Endereco;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository repository;
	
	public List<Endereco> findAll(){		
		return repository.findAll();
	}
	
	public Endereco findById(long id) {
		Optional<Endereco> obj = repository.findById(id);		
		return obj.orElseThrow(() -> new ResourceNotFoundExcepetion(id));	
	}
		
	
}

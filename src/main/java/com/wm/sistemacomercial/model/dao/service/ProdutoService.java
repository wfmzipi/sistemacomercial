package com.wm.sistemacomercial.model.dao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wm.sistemacomercial.model.dao.repository.ProdutoRepository;
import com.wm.sistemacomercial.model.dao.service.exception.ResourceNotFoundExcepetion;
import com.wm.sistemacomercial.model.entities.Produto;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;
	
	public List<Produto> findAll(){		
		return repository.findAll();
	}
	
	public Produto findById(long id) {
		Optional<Produto> obj = repository.findById(id);		
		return obj.orElseThrow(() -> new ResourceNotFoundExcepetion(id));
	}
	
	public List<Produto> findByNomeContaining(String nome) {
		List<Produto> obj = repository.findByNomeContaining(nome);	
		return  obj;
	}
	
	
}

package com.wm.sistemacomercial.model.dao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wm.sistemacomercial.model.dao.repository.FabricanteRepository;
import com.wm.sistemacomercial.model.dao.service.exception.ResourceNotFoundExcepetion;
import com.wm.sistemacomercial.model.entities.Fabricante;

@Service
public class FabricanteService {

	@Autowired
	private FabricanteRepository repository;

	public List<Fabricante> findAll() {
		return repository.findAll();
	}

	public Fabricante findById(long id) {
		Optional<Fabricante> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundExcepetion(id));
	}

	public List<Fabricante> findByNomeContaining(String nome) {
		List<Fabricante> obj = repository.findByNomeContaining(nome);
		return obj;
	}

}

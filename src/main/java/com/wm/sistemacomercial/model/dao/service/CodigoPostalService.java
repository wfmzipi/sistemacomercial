package com.wm.sistemacomercial.model.dao.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wm.sistemacomercial.model.dao.repository.CodigoPostalRepository;
import com.wm.sistemacomercial.model.entities.CodigoPostal;

@Service
public class CodigoPostalService {

	@Autowired
	private CodigoPostalRepository repository;
		
	public CodigoPostal findByCep(String CEP) {
		Optional<CodigoPostal> obj = Optional.ofNullable(repository.findByCep(CEP));	
		return obj.get();
	}
	
	
	
	
	
}

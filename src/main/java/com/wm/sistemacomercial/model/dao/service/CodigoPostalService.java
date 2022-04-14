package com.wm.sistemacomercial.model.dao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wm.sistemacomercial.model.dao.repository.CodigoPostalRepository;
import com.wm.sistemacomercial.model.entities.CodigoPostal;

@Service
public class CodigoPostalService {

	@Autowired
	private CodigoPostalRepository repository;
	
	
	public List<CodigoPostal> findAll(){
		
		return repository.findAll();
	}
	
		
	public CodigoPostal findByCep(String Cep) {
		CodigoPostal obj = repository.findByCEP(Cep);
		
		return obj;
	}
	
	
	
	
	
}

package com.wm.sistemacomercial.controler.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wm.sistemacomercial.model.dao.service.TelefoneService;
import com.wm.sistemacomercial.model.entities.Telefone;

@RestController
@RequestMapping(value = "/telefone")
public class TelefoneResource {
	
	@Autowired
	private TelefoneService telefone;
	
	@GetMapping
	public ResponseEntity<List<Telefone>> findAll(){
		
		List<Telefone> list = telefone.findAll();		
		return ResponseEntity.ok().body(list);
	}
	
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Telefone> findById(@PathVariable Long id){
		Telefone obj = telefone.findById(id);
		return ResponseEntity.ok().body(obj);		
	}

		
	
}

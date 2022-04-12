package com.wm.sistemacomercial.controler.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wm.sistemacomercial.model.dao.service.EnderecoService;
import com.wm.sistemacomercial.model.entities.Endereco;



@RestController
@RequestMapping(value = "/endereco")
public class EnderecoResource {
	
	@Autowired
	private EnderecoService Endereco;
	
	@GetMapping
	public ResponseEntity<List<Endereco>> findAll(){
		
		List<Endereco> list = Endereco.findAll();		
		return ResponseEntity.ok().body(list);
	}
	
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Endereco> findById(@PathVariable Long id){
		Endereco obj = Endereco.findById(id);
		return ResponseEntity.ok().body(obj);		
	}

}

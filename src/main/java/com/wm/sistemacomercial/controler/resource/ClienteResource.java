package com.wm.sistemacomercial.controler.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wm.sistemacomercial.model.dao.service.ClienteService;
import com.wm.sistemacomercial.model.entities.Cliente;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteResource {
	
	@Autowired
	private ClienteService cliente;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> findAll(){
		
		List<Cliente> list = cliente.findAll();		
		return ResponseEntity.ok().body(list);
	}
	
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Cliente> findById(@PathVariable Long id){
		Cliente obj = cliente.findById(id);
		return ResponseEntity.ok().body(obj);
		
		
		
	}

}

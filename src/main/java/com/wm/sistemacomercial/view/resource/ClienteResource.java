package com.wm.sistemacomercial.view.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wm.sistemacomercial.model.entities.Cliente;

@RestController
@RequestMapping(value="/Cliente")
public class ClienteResource {
	
	@GetMapping
	public ResponseEntity<Cliente> findAll(){
		
		Cliente cliente = new Cliente();
		return ResponseEntity.ok().body(cliente);
	}
	

}

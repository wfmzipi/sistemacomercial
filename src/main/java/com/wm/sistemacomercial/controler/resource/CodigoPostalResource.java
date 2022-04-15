package com.wm.sistemacomercial.controler.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wm.sistemacomercial.model.dao.service.CodigoPostalService;
import com.wm.sistemacomercial.model.entities.CodigoPostal;

@RestController
@RequestMapping(value = "/codigopostal")
public class CodigoPostalResource {

	@Autowired
	private CodigoPostalService codigopostal;

	@GetMapping
	public ResponseEntity<List<CodigoPostal>> findAll() {
		List<CodigoPostal> list = codigopostal.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{cep}")
	public ResponseEntity<CodigoPostal> findByCep(@PathVariable String cep) {
		CodigoPostal obj = codigopostal.findByCep(cep);
		return ResponseEntity.ok().body(obj);

	}

}

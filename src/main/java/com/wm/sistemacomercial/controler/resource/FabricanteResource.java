package com.wm.sistemacomercial.controler.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wm.sistemacomercial.model.dao.service.FabricanteService;
import com.wm.sistemacomercial.model.entities.Fabricante;

@RestController
@RequestMapping(value = "/fabricante")
public class FabricanteResource {

	@Autowired
	private FabricanteService fabricante;

	@GetMapping
	public ResponseEntity<List<Fabricante>> findAll() {
		List<Fabricante> list = fabricante.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Fabricante> findById(@PathVariable Long id) {
		Fabricante obj = fabricante.findById(id);
		return ResponseEntity.ok().body(obj);

	}

	@GetMapping(value = "/nome/{nome}")
	public ResponseEntity<List<Fabricante>> findByNome(@PathVariable String nome) {
		List<Fabricante> obj = fabricante.findByNomeContaining(nome);
		return ResponseEntity.ok().body(obj);
	}


}

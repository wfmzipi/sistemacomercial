package com.wm.sistemacomercial.controler.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wm.sistemacomercial.model.dao.service.FornecedorService;
import com.wm.sistemacomercial.model.entities.Fornecedor;

@RestController
@RequestMapping(value = "/fornecedor")
public class FornecedorResource {

	@Autowired
	private FornecedorService fornecedor;

	@GetMapping
	public ResponseEntity<List<Fornecedor>> findAll() {
		List<Fornecedor> list = fornecedor.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Fornecedor> findById(@PathVariable Long id) {
		Fornecedor obj = fornecedor.findById(id);
		return ResponseEntity.ok().body(obj);

	}

	@GetMapping(value = "/nome/{nome}")
	public ResponseEntity<List<Fornecedor>> findByNome(@PathVariable String nome) {
		List<Fornecedor> obj = fornecedor.findByNomeContaining(nome);
		return ResponseEntity.ok().body(obj);
	}

	@GetMapping(value = "/registro/{registro}")
	public ResponseEntity<List<Fornecedor>> findByRegistro(@PathVariable String registro) {
		List<Fornecedor> obj = fornecedor.findByRegistroContainingIgnoreCase(registro);
		return ResponseEntity.ok().body(obj);
	}

	@GetMapping(value = "/email/{email}")
	public ResponseEntity<List<Fornecedor>> findByEmail(@PathVariable String email) {
		List<Fornecedor> obj = fornecedor.findByEmailContainingIgnoreCase(email);
		return ResponseEntity.ok().body(obj);
	}

}

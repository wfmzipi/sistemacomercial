package com.wm.sistemacomercial.controler.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wm.sistemacomercial.model.dao.service.ProdutoService;
import com.wm.sistemacomercial.model.entities.Produto;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoResource {

	@Autowired
	private ProdutoService produto;

	@GetMapping
	public ResponseEntity<List<Produto>> findAll() {
		List<Produto> list = produto.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Produto> findById(@PathVariable Long id) {
		Produto obj = produto.findById(id);
		return ResponseEntity.ok().body(obj);

	}

	@GetMapping(value = "/nome/{nome}")
	public ResponseEntity<List<Produto>> findByNome(@PathVariable String nome) {
		List<Produto> obj = produto.findByNomeContaining(nome);
		return ResponseEntity.ok().body(obj);
	}

}

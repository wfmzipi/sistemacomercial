package com.wm.sistemacomercial.controler.resource;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wm.sistemacomercial.model.dao.service.OrdemVendaService;
import com.wm.sistemacomercial.model.entities.OrdemVenda;

@RestController
@RequestMapping(value = "/ordemvenda")
public class OrdemVendaResource {

	@Autowired
	private OrdemVendaService OrdemVenda;

	@GetMapping
	public ResponseEntity<List<OrdemVenda>> findAll() {
		List<OrdemVenda> list = OrdemVenda.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<OrdemVenda> findById(@PathVariable Long id) {
		OrdemVenda obj = OrdemVenda.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	@GetMapping(value = "/datavenda/")
	public ResponseEntity<List<OrdemVenda>> findByDataCompra(@RequestParam("data")  String data) throws ParseException {
		List<OrdemVenda> obj = OrdemVenda.findByDataCompra(data);
		return ResponseEntity.ok().body(obj);
	} 
	
}

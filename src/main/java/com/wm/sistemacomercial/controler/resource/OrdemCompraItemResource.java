package com.wm.sistemacomercial.controler.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wm.sistemacomercial.model.dao.service.OrdemCompraItemService;
import com.wm.sistemacomercial.model.entities.OrdemCompraItem;

@RestController
@RequestMapping(value = "/ordemcompraitem")
public class OrdemCompraItemResource {


	@Autowired
	private OrdemCompraItemService ordemcompraitem;

	@GetMapping
	public ResponseEntity<List<OrdemCompraItem>> findAll() {
		List<OrdemCompraItem> list = ordemcompraitem.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/id/{ordemcompra}")
	public ResponseEntity<OrdemCompraItem> findByordemcompra(@PathVariable String ordemcompra) {
		OrdemCompraItem obj = ordemcompraitem.findByOrdemCompra(ordemcompra);
		return ResponseEntity.ok().body(obj);
	}
 
	
		
}

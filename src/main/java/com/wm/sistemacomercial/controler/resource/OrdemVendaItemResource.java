package com.wm.sistemacomercial.controler.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wm.sistemacomercial.model.dao.service.OrdemVendaItemService;
import com.wm.sistemacomercial.model.entities.OrdemVendaItem;

@RestController
@RequestMapping(value = "/ordemvendaitem")
public class OrdemVendaItemResource {


	@Autowired
	private OrdemVendaItemService OrdemVendaItem;

	@GetMapping
	public ResponseEntity<List<OrdemVendaItem>> findAll() {
		List<OrdemVendaItem> list = OrdemVendaItem.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/id/{ordemvenda}")
	public ResponseEntity<OrdemVendaItem> findByordemcompra(@PathVariable String ordemvenda) {
		OrdemVendaItem obj = OrdemVendaItem.findByOrdemVenda(ordemvenda);
		return ResponseEntity.ok().body(obj);
	}
 
	
	
	
		
}

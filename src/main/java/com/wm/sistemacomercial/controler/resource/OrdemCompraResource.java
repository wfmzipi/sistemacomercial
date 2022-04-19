package com.wm.sistemacomercial.controler.resource;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wm.sistemacomercial.model.dao.service.OrdemCompraService;
import com.wm.sistemacomercial.model.entities.OrdemCompra;

@RestController
@RequestMapping(value = "/ordemcompra")
public class OrdemCompraResource {

	@Autowired
	private OrdemCompraService ordemcompra;

	@GetMapping
	public ResponseEntity<List<OrdemCompra>> findAll() {
		List<OrdemCompra> list = ordemcompra.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<OrdemCompra> findById(@PathVariable Long id) {
		OrdemCompra obj = ordemcompra.findById(id);
		return ResponseEntity.ok().body(obj);

	}

	@GetMapping(value = "/datacompra/{data_compra}")
	public ResponseEntity<List<OrdemCompra>> findByData_Compra(@PathVariable Date data_compra) {
		List<OrdemCompra> obj = ordemcompra.findByDataCompra(data_compra);
		return ResponseEntity.ok().body(obj);
	}


//	@GetMapping(value = "/datapagamento/{data_pagamento}")
//	public ResponseEntity<List<OrdemCompra>> findByData_Pagamento(@PathVariable Date data_pagamento) {
//		List<OrdemCompra> obj = ordemcompra.findByDataCompra(data_pagamento);
//		return ResponseEntity.ok().body(obj);
//	}
//	
//	@GetMapping(value = "/status/{status}")
//	public ResponseEntity<List<OrdemCompra>> findByStatus(@PathVariable String status) {
//		List<OrdemCompra> obj = ordemcompra.findByStatus(status);
//		return ResponseEntity.ok().body(obj);
//	}
//	
//	
//	@GetMapping(value = "/datacomprarange/{data_compra,data_pagamento}")
//	public ResponseEntity<List<OrdemCompra>> findByData_CompraBetween(@PathVariable Date data_inicio,@PathVariable Date data_fim) {
//		List<OrdemCompra> obj = ordemcompra.findByData_CompraBetween(data_inicio,data_fim);
//		return ResponseEntity.ok().body(obj);
//	}
//	
//	@GetMapping(value = "/datapagamentorange/{data_compra,data_pagamento}")
//	public ResponseEntity<List<OrdemCompra>> findByData_PagamentoBetween(@PathVariable Date data_inicio,@PathVariable Date data_fim) {
//		List<OrdemCompra> obj = ordemcompra.findByData_PagamentoBetween(data_inicio,data_fim);
//		return ResponseEntity.ok().body(obj);		
//	}	
//	
//	@GetMapping(value = "/datacomprarangestatus/{data_compra,data_pagamento,status}")
//	public ResponseEntity<List<OrdemCompra>> findByData_CompraBetweenAndStatus(@PathVariable Date data_inicio,@PathVariable Date data_fim,@PathVariable String status) {
//		List<OrdemCompra> obj = ordemcompra.findByData_CompraBetweenAndStatus(data_inicio,data_fim,status);
//		return ResponseEntity.ok().body(obj);
//	}
	
}

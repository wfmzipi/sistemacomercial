package com.wm.sistemacomercial.controler.resource;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

//	@RequestMapping(value="/fetch" , method=RequestMethod.GET)
//    public @ResponseBody String fetchResult(@RequestParam("from") @DateTimeFormat(pattern="yyyy-MM-dd") Date fromDate) {
//        //Content goes here
//    }
	//public ResponseEntity<List<OrdemCompra>> findByDataCompra(@RequestParam("data") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) String data) throws ParseException {
	
	
	@GetMapping(value = "/datacompra/")
	public ResponseEntity<List<OrdemCompra>> findByDataCompra(@RequestParam("data")  String data) throws ParseException {
		List<OrdemCompra> obj = ordemcompra.findByDataCompra(data);
		return ResponseEntity.ok().body(obj);
	}
	

	@GetMapping(value = "/datapagamento/")
	public ResponseEntity<List<OrdemCompra>> findByData_Pagamento(@RequestParam("data") @DateTimeFormat(pattern="yyyy-MM-dd") Date data) throws ParseException {
//		List<OrdemCompra> obj = ordemcompra.findByDataPagamento(new SimpleDateFormat("yyyy-MM-dd").parse(data));
		List<OrdemCompra> obj = ordemcompra.findByDataPagamento(data);
		return ResponseEntity.ok().body(obj);
	}

//	@GetMapping(value = "/status={status}")
//	public ResponseEntity<List<OrdemCompra>> findByStatus(@PathVariable String status) {
//		List<OrdemCompra> obj = ordemcompra.findByStatus(status);
//		return ResponseEntity.ok().body(obj);
//	}

//	@GetMapping(value = "/datacomprarange/datainicio/{datainicio}/datafim/{datafim}")
//	public ResponseEntity<List<OrdemCompra>> findByDataCompraBetween(@PathVariable String data_inicio,@PathVariable String data_fim) throws ParseException {
//		List<OrdemCompra> obj = ordemcompra.findByDataCompraBetween(new SimpleDateFormat("dd/MM/yyyy").parse(data_inicio),new SimpleDateFormat("dd/MM/yyyy").parse(data_fim));
//		return ResponseEntity.ok().body(obj);
//	}
	
//	@GetMapping(value = "/ordemcompra/datapagamentorange/{data_compra,data_pagamento}")
//	public ResponseEntity<List<OrdemCompra>> findByData_PagamentoBetween(@PathVariable Date data_inicio,@PathVariable Date data_fim) {
//		List<OrdemCompra> obj = ordemcompra.findByData_PagamentoBetween(data_inicio,data_fim);
//		return ResponseEntity.ok().body(obj);		
//	}	
	
//	@GetMapping(value = "/ordemcompra/datacomprarangestatus/{data_compra,data_pagamento,status}")
//	public ResponseEntity<List<OrdemCompra>> findByData_CompraBetweenAndStatus(@PathVariable Date data_inicio,@PathVariable Date data_fim,@PathVariable String status) {
//		List<OrdemCompra> obj = ordemcompra.findByData_CompraBetweenAndStatus(data_inicio,data_fim,status);
//		return ResponseEntity.ok().body(obj);
//	}
	
}

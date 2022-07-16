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


	
}

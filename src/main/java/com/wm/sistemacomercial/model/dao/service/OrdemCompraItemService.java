package com.wm.sistemacomercial.model.dao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wm.sistemacomercial.model.dao.repository.OrdemCompraItemRepository;
import com.wm.sistemacomercial.model.entities.OrdemCompraItem;

@Service
public class OrdemCompraItemService {

	@Autowired
	private OrdemCompraItemRepository repository;

	public List<OrdemCompraItem> findAll() {
		return repository.findAll();
	}

	public OrdemCompraItem findByOrdemCompra(String id) {
		OrdemCompraItem obj = repository.findByOrdemCompra(id);
		return obj;
	}

		
}

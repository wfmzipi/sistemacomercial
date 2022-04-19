package com.wm.sistemacomercial.model.dao.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wm.sistemacomercial.model.entities.OrdemCompra;

@Repository
public interface OrdemCompraRepository extends JpaRepository<OrdemCompra, Long> {
	

	public Optional<List<OrdemCompra>> findByDataCompra(@Param("datacompra") Date datacompra);
	
//	public List<OrdemCompra> findByDataPagamento(@Param("datapagamento") Date datapagamento);	
	
//	public List<OrdemCompra> findByStatus(@Param("status") String status);
	
//	public List<OrdemCompra> findByData_CompraBetween(@Param("datacompra") Date data_inicial,@Param("datacompra") Date data_fim);
	
//	public List<OrdemCompra> findByData_PagamentoBetween(@Param("data_pagamento") Date data_inicial,@Param("data_pagamento") Date data_fim);
	
//	public List<OrdemCompra> findByData_CompraBetweenAndStatus(@Param("data_compra") Date data_inicial,@Param("DataFim") Date data_fim,@Param("Status") String Status);	
	
}

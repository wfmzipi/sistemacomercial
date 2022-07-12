package com.wm.sistemacomercial.model.dao.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wm.sistemacomercial.model.entities.OrdemCompra;

@Repository
public interface OrdemCompraRepository extends JpaRepository<OrdemCompra, Long> {
	

	public List<OrdemCompra> findByDataCompra(@Param("dataCompra") String data);
	
	public List<OrdemCompra> findByDataPagamento(@Param("dataPagamento") Date data);	
	
	public List<OrdemCompra> findByStatus(@Param("status") String status);
	
	public List<OrdemCompra> findByDataCompraBetween(@Param("dataCompra") Date data_inicial,@Param("dataCompra") Date data_fim);
	
//	public List<OrdemCompra> findByDataPagamentoBetween(@Param("data_pagamento") Date data_inicial,@Param("data_pagamento") Date data_fim);
	
//	public List<OrdemCompra> findByDataCompraBetweenAndStatus(@Param("data_compra") Date data_inicial,@Param("DataFim") Date data_fim,@Param("Status") String Status);	
	
}

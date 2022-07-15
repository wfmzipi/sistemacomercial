package com.wm.sistemacomercial.model.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wm.sistemacomercial.model.entities.OrdemCompra;
import com.wm.sistemacomercial.model.entities.OrdemVenda;

@Repository
public interface OrdemVendaRepository extends JpaRepository<OrdemVenda, Long>{
	
	public List<OrdemVenda> findByDataVenda(@Param("dataVenda") String data);

}

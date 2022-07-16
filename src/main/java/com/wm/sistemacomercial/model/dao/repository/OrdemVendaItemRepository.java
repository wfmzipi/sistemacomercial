package com.wm.sistemacomercial.model.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wm.sistemacomercial.model.entities.OrdemVendaItem;

@Repository
public interface OrdemVendaItemRepository extends JpaRepository<OrdemVendaItem, Long>{
	
	@Query(value = "SELECT u FROM ordem_venda_item u where ID_VENDA = :ordemvenda")
	public OrdemVendaItem findByOrdemVenda(@Param("ordemvenda") String id);
	

}

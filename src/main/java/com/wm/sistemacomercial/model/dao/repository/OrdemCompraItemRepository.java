package com.wm.sistemacomercial.model.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wm.sistemacomercial.model.entities.OrdemCompraItem;

@Repository
public interface OrdemCompraItemRepository extends JpaRepository<OrdemCompraItem, Long> {

	@Query(value = "SELECT u FROM Ordem_Compra_Item u where ID_ORDEM_COMPRA = :ordemcompra")
	public OrdemCompraItem findByOrdemCompra(@Param("ordemcompra") String id);
	
}

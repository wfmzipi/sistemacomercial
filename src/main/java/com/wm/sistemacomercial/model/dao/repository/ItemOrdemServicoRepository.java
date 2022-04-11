package com.wm.sistemacomercial.model.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wm.sistemacomercial.model.entities.ItemOrdemServico;

@Repository
public interface ItemOrdemServicoRepository  extends JpaRepository<ItemOrdemServico, Long> {

}

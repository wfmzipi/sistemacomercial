package com.wm.sistemacomercial.model.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wm.sistemacomercial.model.entities.EnderecoFornecedor;

@Repository
public interface EnderecoFornecedorRepository extends JpaRepository<EnderecoFornecedor, Long> {

}

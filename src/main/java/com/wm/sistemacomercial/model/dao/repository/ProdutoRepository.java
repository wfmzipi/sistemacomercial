package com.wm.sistemacomercial.model.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wm.sistemacomercial.model.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	@Query(value = "SELECT u FROM Produto u where upper(u.nome) like concat('%',upper(:nome),'%')")
	public List<Produto> findByNomeContaining(@Param("nome") String nome);


}

package com.wm.sistemacomercial.model.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wm.sistemacomercial.model.entities.Fabricante;

@Repository
public interface FabricanteRepository extends JpaRepository<Fabricante, Long> {
	
	@Query(value = "SELECT u FROM Fabricante u where upper(u.nome) like concat('%',upper(:nome),'%')")
	public List<Fabricante> findByNomeContaining(@Param("nome") String nome);
	


}

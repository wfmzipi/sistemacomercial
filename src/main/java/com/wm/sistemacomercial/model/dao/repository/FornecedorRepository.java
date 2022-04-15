package com.wm.sistemacomercial.model.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wm.sistemacomercial.model.entities.Fornecedor;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
	
	@Query(value = "SELECT u FROM Fornecedor u where upper(u.nome) like concat('%',upper(:nome),'%')")
	public List<Fornecedor> findByNomeContaining(@Param("nome") String nome);
	
	@Query(value = "SELECT u FROM Fornecedor u where upper(u.registro) like concat('%',upper(:registro),'%')")
	public List<Fornecedor> findByRegistroContainingIgnoreCase(@Param("registro") String registro);
	
	@Query(value = "SELECT u FROM Fornecedor u where upper(u.email) like concat('%',upper(:email),'%')")
	public List<Fornecedor> findByEmailContainingIgnoreCase(@Param("email") String email);

}

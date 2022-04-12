package com.wm.sistemacomercial.model.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wm.sistemacomercial.model.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	@Query(value = "SELECT u FROM Cliente u where upper(u.nome) like concat('%',upper(:nome),'%')")
	public List<Cliente> findByNomeContaining(@Param("nome") String nome);
	
	@Query(value = "SELECT u FROM Cliente u where upper(u.registro) like concat('%',upper(:registro),'%')")
	public List<Cliente> findByRegistroContainingIgnoreCase(@Param("registro") String registro);
	
	@Query(value = "SELECT u FROM Cliente u where upper(u.email) like concat('%',upper(:email),'%')")
	public List<Cliente> findByEmailContainingIgnoreCase(@Param("email") String email);

}

package com.wm.sistemacomercial.model.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wm.sistemacomercial.model.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	@Query(value = "SELECT u FROM Cliente u where u.nome like %:nome%")
	public List<Cliente> findByNomeContaining(@Param("nome") String nome);
	
	@Query(value = "SELECT u FROM Cliente u where u.registro like %:registro%")
	public List<Cliente> findByRegistroContaining(@Param("registro") String registro);
	
	@Query(value = "SELECT u FROM Cliente u where u.email like %:email%")
	public List<Cliente> findByEmailContaining(@Param("email") String email);

}

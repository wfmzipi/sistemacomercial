package com.wm.sistemacomercial.model.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wm.sistemacomercial.model.entities.Cliente;
import com.wm.sistemacomercial.model.entities.CodigoPostal;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	public Cliente findByNome(String nome);
	public Cliente findByRegistro(String registro);
	public Cliente findByEmail(String email);

}

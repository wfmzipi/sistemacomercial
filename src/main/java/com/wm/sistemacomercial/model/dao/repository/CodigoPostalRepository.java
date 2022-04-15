package com.wm.sistemacomercial.model.dao.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wm.sistemacomercial.model.entities.CodigoPostal;

@Repository
public interface CodigoPostalRepository extends JpaRepository<CodigoPostal, String> {
	
	public Optional<CodigoPostal> findByCEP(String CEP);

}

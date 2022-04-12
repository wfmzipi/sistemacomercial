package com.wm.sistemacomercial.configuration;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.wm.sistemacomercial.model.dao.repository.ClienteRepository;
import com.wm.sistemacomercial.model.dao.repository.CodigoPostalRepository;
import com.wm.sistemacomercial.model.entities.Cliente;
import com.wm.sistemacomercial.model.entities.CodigoPostal;
import com.wm.sistemacomercial.model.entities.enums.ETipoRegistro;

@Configuration
public class configuracao implements CommandLineRunner{
	
	@Autowired
	private ClienteRepository clienterepository;

	@Autowired
	private CodigoPostalRepository codigopostalrepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Cliente cli1 = new Cliente("Wellington", "10619671742", ETipoRegistro.CPF, "wfmzipi@gmail.com");
		Cliente cli2 = new Cliente("Gisele", "10482275431", ETipoRegistro.CPF, "gislef_rocha@yahoo.com");
		clienterepository.saveAll(Arrays.asList(cli1,cli2) );
		
		CodigoPostal cep1 = new CodigoPostal("25515610");
		CodigoPostal cep2 = new CodigoPostal("26520610");
		codigopostalrepository.saveAll(Arrays.asList(cep1,cep2));
		
		
	}

	
	
	
}

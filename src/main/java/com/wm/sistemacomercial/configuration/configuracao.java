package com.wm.sistemacomercial.configuration;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.wm.sistemacomercial.model.dao.repository.ClienteRepository;
import com.wm.sistemacomercial.model.dao.repository.CodigoPostalRepository;
import com.wm.sistemacomercial.model.dao.repository.EnderecoRepository;
import com.wm.sistemacomercial.model.dao.repository.TelefoneRepository;
import com.wm.sistemacomercial.model.entities.Cliente;
import com.wm.sistemacomercial.model.entities.CodigoPostal;
import com.wm.sistemacomercial.model.entities.Endereco;
import com.wm.sistemacomercial.model.entities.Telefone;
import com.wm.sistemacomercial.model.entities.enums.ETipoEndereco;
import com.wm.sistemacomercial.model.entities.enums.ETipoRegistro;
import com.wm.sistemacomercial.model.entities.enums.ETipoTelefone;

@Configuration
public class configuracao implements CommandLineRunner{
	
	@Autowired
	private ClienteRepository clienterepository;

	@Autowired
	private CodigoPostalRepository codigopostalrepository;

	@Autowired
	private TelefoneRepository telefonerepository;

	@Autowired
	private EnderecoRepository enderecorepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		CodigoPostal cep1 = new CodigoPostal("25515610");
		CodigoPostal cep2 = new CodigoPostal("26520610");	
						
		Cliente cli1 = new  Cliente("Wellington", "10619671742", ETipoRegistro.CPF, "wfmzipi@gmail.com");
		Cliente cli2 = new Cliente("Gisele", "10482275431", ETipoRegistro.CPF, "gislef_rocha@yahoo.com");
				
		Telefone tel1 = new Telefone("987430743", ETipoTelefone.CELULAR,cli1);
		Telefone tel2 = new Telefone("9999999", ETipoTelefone.CELULAR,cli1);
		Telefone tel3 = new Telefone("111111111", ETipoTelefone.CELULAR,cli2);
		Telefone tel4 = new Telefone("222222222", ETipoTelefone.CELULAR,cli2);
		
		Endereco end1 = new Endereco("casa","165",ETipoEndereco.RESIDENCIAL,cep1,cli1);
		Endereco end2 = new Endereco("predio","140",ETipoEndereco.RESIDENCIAL,cep2,cli2);
		Endereco end3 = new Endereco("casa","105",ETipoEndereco.RESIDENCIAL,cep2,cli1);
		Endereco end4 = new Endereco("casa","158",ETipoEndereco.RESIDENCIAL,cep1,cli2);
			
		
		codigopostalrepository.saveAll(Arrays.asList(cep1,cep2));
		clienterepository.saveAll(Arrays.asList(cli1,cli2) );
		telefonerepository.saveAll(Arrays.asList(tel1,tel2,tel3,tel4));
		enderecorepository.saveAll(Arrays.asList(end1,end2,end3,end4));
		
		
	}

	
	
	
}

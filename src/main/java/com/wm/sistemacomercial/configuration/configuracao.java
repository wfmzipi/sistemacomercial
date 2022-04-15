package com.wm.sistemacomercial.configuration;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.wm.sistemacomercial.model.dao.repository.ClienteRepository;
import com.wm.sistemacomercial.model.dao.repository.EnderecoRepository;
import com.wm.sistemacomercial.model.dao.repository.FornecedorRepository;
import com.wm.sistemacomercial.model.dao.repository.TelefoneRepository;
import com.wm.sistemacomercial.model.dao.service.CodigoPostalService;
import com.wm.sistemacomercial.model.entities.Cliente;
import com.wm.sistemacomercial.model.entities.CodigoPostal;
import com.wm.sistemacomercial.model.entities.Endereco;
import com.wm.sistemacomercial.model.entities.Fornecedor;
import com.wm.sistemacomercial.model.entities.Telefone;
import com.wm.sistemacomercial.model.entities.enums.ETipoEndereco;
import com.wm.sistemacomercial.model.entities.enums.ETipoRegistro;
import com.wm.sistemacomercial.model.entities.enums.ETipoTelefone;

@Configuration
public class configuracao implements CommandLineRunner{
	
	@Autowired
	private ClienteRepository clienterepository;

	@Autowired
	private CodigoPostalService codigopostalservice;

	@Autowired
	private TelefoneRepository telefonerepository;

	@Autowired
	private EnderecoRepository enderecorepository;
	
	@Autowired
	private FornecedorRepository fornecedorrepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		CodigoPostal cep1 = codigopostalservice.findByCep("26515610");
		CodigoPostal cep2 = codigopostalservice.findByCep("26520610");
		
		Cliente cli1 = new  Cliente("Wellington", "10619671742", ETipoRegistro.CPF, "wfmzipi@gmail.com");
		Cliente cli2 = new Cliente("Gisele", "10482275431", ETipoRegistro.CPF, "gislef_rocha@yahoo.com");
				
		Telefone telclie1 = new Telefone("987430743", ETipoTelefone.CELULAR,cli1);
		Telefone telclie2 = new Telefone("9999999", ETipoTelefone.CELULAR,cli1);
		Telefone telclie3 = new Telefone("111111111", ETipoTelefone.CELULAR,cli2);
		Telefone telclie4 = new Telefone("222222222", ETipoTelefone.CELULAR,cli2);
		
		Endereco endcli1 = new Endereco("casa","165",ETipoEndereco.RESIDENCIAL,cep1,cli1);
		Endereco endcli2 = new Endereco("predio","140",ETipoEndereco.RESIDENCIAL,cep2,cli2);
		Endereco endcli3 = new Endereco("casa","105",ETipoEndereco.RESIDENCIAL,cep2,cli1);
		Endereco endcli4 = new Endereco("casa","158",ETipoEndereco.RESIDENCIAL,cep1,cli2);
			
//		clienterepository.saveAll(Arrays.asList(cli1,cli2));
//		telefonerepository.saveAll(Arrays.asList(telclie1,telclie2,telclie3,telclie4));	
//		enderecorepository.saveAll(Arrays.asList(endcli1,endcli2,endcli3,endcli4));
		
		Fornecedor for1 = new Fornecedor("Fornecedor A", "1354654313836", ETipoRegistro.CNPJ, "fornecedor@gmail.com");
		Fornecedor for2 = new Fornecedor("Fornecedor A", "1354654313836", ETipoRegistro.CNPJ, "fornecedor@gmail.com");
		Fornecedor for3 = new Fornecedor("Fornecedor A", "1354654313836", ETipoRegistro.CNPJ, "fornecedor@gmail.com");
		Fornecedor for4 = new Fornecedor("Fornecedor A", "1354654313836", ETipoRegistro.CNPJ, "fornecedor@gmail.com");
		
		Telefone telfor1 = new Telefone("987430743", ETipoTelefone.CELULAR,for1);
		Telefone telfor2 = new Telefone("9999999", ETipoTelefone.CELULAR,for2);
		Telefone telfor3 = new Telefone("111111111", ETipoTelefone.CELULAR,for3);
		Telefone telfor4 = new Telefone("222222222", ETipoTelefone.CELULAR,for4);

		Endereco endfor1 = new Endereco("casa","165",ETipoEndereco.RESIDENCIAL,cep1,for1);
		Endereco endfor2 = new Endereco("predio","140",ETipoEndereco.RESIDENCIAL,cep2,for2);
		Endereco endfor3 = new Endereco("casa","105",ETipoEndereco.RESIDENCIAL,cep2,for3);
		Endereco endfor4 = new Endereco("casa","158",ETipoEndereco.RESIDENCIAL,cep1,for4);
		
		fornecedorrepository.saveAll(Arrays.asList(for1,for2,for3,for4));
		telefonerepository.saveAll(Arrays.asList(telfor1,telfor2,telfor3,telfor4));
		enderecorepository.saveAll(Arrays.asList(endfor1,endfor2,endfor3,endfor4));
		
	}

	
	
	
}

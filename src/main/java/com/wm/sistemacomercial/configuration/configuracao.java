package com.wm.sistemacomercial.configuration;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.wm.sistemacomercial.model.dao.repository.ClienteRepository;
import com.wm.sistemacomercial.model.dao.repository.EnderecoRepository;
import com.wm.sistemacomercial.model.dao.repository.FabricanteRepository;
import com.wm.sistemacomercial.model.dao.repository.FornecedorRepository;
import com.wm.sistemacomercial.model.dao.repository.OrdemCompraItemRepository;
import com.wm.sistemacomercial.model.dao.repository.OrdemCompraRepository;
import com.wm.sistemacomercial.model.dao.repository.OrdemVendaItemRepository;
import com.wm.sistemacomercial.model.dao.repository.OrdemVendaRepository;
import com.wm.sistemacomercial.model.dao.repository.ProdutoRepository;
import com.wm.sistemacomercial.model.dao.repository.TelefoneRepository;
import com.wm.sistemacomercial.model.dao.service.CodigoPostalService;
import com.wm.sistemacomercial.model.entities.OrdemVenda;
import com.wm.sistemacomercial.model.entities.OrdemVendaItem;
import com.wm.sistemacomercial.model.entities.enums.EFormaPagamento;

@Configuration
public class configuracao implements CommandLineRunner {

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

	@Autowired
	private ProdutoRepository produtorepository;

	@Autowired
	private FabricanteRepository fabricanterepository;

	@Autowired
	private OrdemCompraRepository ordemcomprarepository;
	
	@Autowired
	private OrdemVendaRepository ordemvendarepository;
	
	@Autowired
	private OrdemVendaItemRepository ordemvendaitemrepository;

	@Autowired
	private OrdemCompraItemRepository ordemcompratemrepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		//***********************************************************************************************************//
		//===============================> Cadastro Produto
		/*
		Fornecedor for1 = new Fornecedor("Fornecedor A", "1354654313836", ETipoRegistro.CNPJ, "fornecedor@gmail.com");
		Fornecedor for2 = new Fornecedor("Fornecedor B", "1354654313836", ETipoRegistro.CNPJ, "fornecedor@gmail.com");
		fornecedorrepository.saveAll(Arrays.asList(for1,for2));
		Fabricante fab1 = new Fabricante("Fabricante A");
		Fabricante fab2 = new Fabricante("Fabricante b");
		fabricanterepository.saveAll(Arrays.asList(fab1,fab2));	
		
		Produto prod1 = new Produto("Cabo 10", 10, 1.00, 10.0, 1.50, Arrays.asList(for1,for2),Arrays.asList(fab1));
		Produto prod2 = new Produto("Bomba 1cv", 10, 254.00, 10.0, 290.0, Arrays.asList(for1,for2),Arrays.asList(fab1));
		produtorepository.saveAll(Arrays.asList(prod1,prod2));
		*/
		
		
		
		//***********************************************************************************************************//
		//===============================> Cadastro Ordem Compra
		/*
        OrdemCompra od1 = new OrdemCompra(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse("01/05/2022 00:00:00"),
        		                          new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse("10/05/2022 00:00:00"),
        		                          EEstatus.ABERTO,
        		                          2220.0,
        		                          10.0,
        		                          2210.0,
        		                          EFormaPagamento.CARTAO_CREDITO,
        		                          fornecedorrepository.getById((long) 11));
        
        OrdemCompraItem ordcomitem = new OrdemCompraItem(10, od1, produtorepository.getById((long) 13));
        
        //ordemcomprarepository.save(od1); --> cascade all
        ordemcompratemrepository.save(ordcomitem);
        */
        //***********************************************************************************************************//

        
		//***********************************************************************************************************//
		//===============================> Cadastro Ordem Venda
		/*
		OrdemVenda ord1 = new OrdemVenda(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse("01/08/2022 00:00:00"),100.00, 10.00, 90.00, EFormaPagamento.DINEHIRO);
		List<OrdemVendaItem> orveit1 = new ArrayList<>();
		
		orveit1.add(new OrdemVendaItem(10,ord1,produtorepository.getById((long) 13)));
		orveit1.add(new OrdemVendaItem(90,ord1,produtorepository.getById((long) 14)));
		orveit1.add(new OrdemVendaItem(50,ord1,produtorepository.getById((long) 15)));
		orveit1.add(new OrdemVendaItem(60,ord1,produtorepository.getById((long) 16)));
		orveit1.add(new OrdemVendaItem(140,ord1,produtorepository.getById((long) 13)));
		orveit1.add(new OrdemVendaItem(13,ord1,produtorepository.getById((long) 14)));
		orveit1.add(new OrdemVendaItem(11,ord1,produtorepository.getById((long) 15)));
		orveit1.add(new OrdemVendaItem(12,ord1,produtorepository.getById((long) 16)));
		orveit1.add(new OrdemVendaItem(15,ord1,produtorepository.getById((long) 14)));
		orveit1.add(new OrdemVendaItem(17,ord1,produtorepository.getById((long) 15)));
	
		//ordemvendarepository.save(ord1); ---> cascade all
	    ordemvendaitemrepository.saveAll(orveit1);		
		
		*/		
	    //***********************************************************************************************************//
		
		
		
		
        
        
		/*
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
			
		clienterepository.saveAll(Arrays.asList(cli1,cli2));
		telefonerepository.saveAll(Arrays.asList(telclie1,telclie2,telclie3,telclie4));	
		enderecorepository.saveAll(Arrays.asList(endcli1,endcli2,endcli3,endcli4));
		*/
		
		/*
		Fornecedor for1 = new Fornecedor("Fornecedor A", "1354654313836", ETipoRegistro.CNPJ, "fornecedor@gmail.com");
		Fornecedor for2 = new Fornecedor("Fornecedor B", "1354654313836", ETipoRegistro.CNPJ, "fornecedor@gmail.com");
		Fornecedor for3 = new Fornecedor("Fornecedor C", "1354654313836", ETipoRegistro.CNPJ, "fornecedor@gmail.com");
		Fornecedor for4 = new Fornecedor("Fornecedor D", "1354654313836", ETipoRegistro.CNPJ, "fornecedor@gmail.com");
		
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
		*/
		
			


		
		


		

/*
 * delete from pdv.produto_fabricante;
commit;
delete from pdv.produto_fornecedor;
commit;new ArrayList<>();
delete from pdv.produto;
commit;
delete from pdv.servico;
commit;
delete from pdv.telefone;
commit;
delete from pdv.servico;
commit;
delete from pdv.cliente;
commit;
delete from pdv.contas_pagar;
commit;
delete from pdv.contas_receber;
commit;
delete from pdv.endereco;
commit;
delete from pdv.endereco_cliente;
commit;
delete from pdv.endereco_fornecedor;
commit;
delete from pdv.fabricante;
commit;
delete from pdv.fluxo_caixa;
commit;
delete from pdv.fornecedor;
commit;
delete from pdv.item_ordem_compra;
commit;
delete from pdv.item_ordem_servico;
commit;
delete from pdv.ordem_compra;
commit;
delete from pdv.ordem_servico;
commit;
delete from pdv.item_ordem_servico;
commit;
delete from pdv.telefone;
commit;
delete from pdv.telefone_cliente;
commit;
delete from pdv.telefone_fornecedor;
commit;
delete from pdv.user;
commit;
*/		

	}

}

package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import exception.CustomException;
import model.dao.entities.ClienteDao;
import model.dao.entities.ClienteDaoImp;
import model.dao.entities.EnderecoDao;
import model.dao.entities.EnderecoDaoImp;
import model.dao.entities.FabricanteDao;
import model.dao.entities.FabricanteDaoImp;
import model.dao.entities.FornecedorDao;
import model.dao.entities.FornecedorDaoImp;
import model.dao.entities.ProdutoDao;
import model.dao.entities.ProdutoDaoImp;
import model.dao.entities.TelefoneDao;
import model.dao.entities.TelefoneDaoImp;
import model.dao.servico.ItemOrdemCompraDao;
import model.dao.servico.ItemOrdemCompraDaoImp;
import model.dao.servico.OrdemCompraDao;
import model.dao.servico.OrdemCompraDaoImp;
import model.entities.Cliente;
import model.entities.CodigoPostal;
import model.entities.Endereco;
import model.entities.Fabricante;
import model.entities.Fornecedor;
import model.entities.ItemOrdemCompra;
import model.entities.OrdemCompra;
import model.entities.Produto;
import model.entities.Telefone;
import model.entities.enums.EEstatus;
import model.entities.enums.EFormaPagamento;
import model.entities.enums.ETipoEndereco;
import model.entities.enums.ETipoRegistro;
import model.entities.enums.ETipoTelefone;

public class ProgramPrincipal {

	public static void main(String[] args) throws CustomException {

		Locale.setDefault(new Locale("pt", "BR"));
		TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));

		PopulaOrdemCompra();

	}

	private static void PopulaCliente() throws CustomException {

		ClienteDao daocliente = new ClienteDaoImp();
		Cliente cliente = new Cliente();

		cliente.setEmail("wfmzipi@gmail.com");
		cliente.setNome("Wellington");
		cliente.setRegistro("132920141");
		cliente.setTipo_registro(ETipoRegistro.IDENTIDADE);

		daocliente.save(cliente);
	}

	private static void PopulaTelefoneCliente() throws CustomException {

		ClienteDao daocliente = new ClienteDaoImp();
		Cliente cliente = new Cliente();

		cliente.setEmail("wfmzipi@gmail.com");
		cliente.setNome("Wellington");
		cliente.setRegistro("132920141");
		cliente.setTipo_registro(ETipoRegistro.IDENTIDADE);

		TelefoneDao daotelefone = new TelefoneDaoImp();
		Telefone telefone = new Telefone();

		telefone.setTelefone("987430743");
		telefone.setTipoTelefone(ETipoTelefone.CELULAR);
		telefone.setCliente(cliente);

		daotelefone.save(telefone);

	}

	private static void PopulaEnderecoCliente() throws CustomException {

		ClienteDao daocliente = new ClienteDaoImp();
		Cliente cliente = new Cliente();

		cliente.setEmail("wfmzipi@gmail.com");
		cliente.setNome("Wellington");
		cliente.setRegistro("132920141");
		cliente.setTipo_registro(ETipoRegistro.IDENTIDADE);

		EnderecoDao daoendereco = new EnderecoDaoImp();
		Endereco endereco = new Endereco();

		endereco.setComplemento("Casa");
		endereco.setNumero("165");
		endereco.setTipoendereo(ETipoEndereco.RESIDENCIAL);
		endereco.setCep(new CodigoPostal("26515610"));
		endereco.setCliente(cliente);

		daoendereco.save(endereco);

	}

	private static void PopulaFornecedor() throws CustomException {

		FornecedorDao daofornecedor = new FornecedorDaoImp();
		Fornecedor fornecedor = new Fornecedor();

		fornecedor.setEmail("wfmzipi@gmail.com");
		fornecedor.setNome("Wellington");
		fornecedor.setRegistro("132920141");
		fornecedor.setTipoRegistro(ETipoRegistro.CNPJ);		

		daofornecedor.save(fornecedor);

	}
	
	private static void PopulaTelefornecedor() throws CustomException {

		FornecedorDao daofornecedor = new FornecedorDaoImp();
		Fornecedor fornecedor = new Fornecedor();

		fornecedor.setEmail("wfmzipi@gmail.com");
		fornecedor.setNome("Wellington");
		fornecedor.setRegistro("132920141");
		fornecedor.setTipoRegistro(ETipoRegistro.CNPJ);		

		TelefoneDao daotelefone = new TelefoneDaoImp();
		Telefone telefone = new Telefone();

		telefone.setTelefone("987430743");
		telefone.setTipoTelefone(ETipoTelefone.CELULAR);
		telefone.setFornecedor(fornecedor);

		daotelefone.save(telefone);

	}

	private static void PopulaEnderecoFornecedor() throws CustomException {

		FornecedorDao daofornecedor = new FornecedorDaoImp();
		Fornecedor fornecedor = new Fornecedor();

		fornecedor.setEmail("wfmzipi@gmail.com");
		fornecedor.setNome("Wellington");
		fornecedor.setRegistro("132920141");
		fornecedor.setTipoRegistro(ETipoRegistro.CNPJ);	

		EnderecoDao daoendereco = new EnderecoDaoImp();
		Endereco endereco = new Endereco();

		endereco.setComplemento("Casa");
		endereco.setNumero("165");
		endereco.setTipoendereo(ETipoEndereco.RESIDENCIAL);
		endereco.setCep(new CodigoPostal("26515610"));

		endereco.setFornecedor(fornecedor);
		
		daoendereco.save(endereco);

	}

	private static void PopulaFabricante() throws CustomException {

		// ================= DAO============================
		FabricanteDao daofabricante = new FabricanteDaoImp();

		// ================= Entities =====================
		Fabricante fabricante = new Fabricante();

		fabricante.setNome("Fabricante AAAA");

		daofabricante.save(fabricante);
		daofabricante.findAll().forEach(x -> System.out.println(x.toString()));

	}

	private static void PopulaProduto() throws CustomException {

		// ================= DAO============================
		ProdutoDao daoproduto = new ProdutoDaoImp();

		Produto produto1 = new Produto("Fio 2,5 mm", 10, 50.60, 100.00, 101.0);
		Produto produto2 = new Produto("Fio 4 mm", 33, 70.80, 100.00, 147.0);
		Produto produto3 = new Produto("Fio 4 mm", 10, 10.0, 50.0, 20.0);

		daoproduto.save(produto1);
		daoproduto.save(produto2);
		daoproduto.save(produto3);

	}
	
	private static void PopulaProdutoFornecedor() throws CustomException {

		FornecedorDao daofornecedor = new FornecedorDaoImp();
		ArrayList<Fornecedor> fornecedor = new ArrayList<>();
		
		fornecedor.add(new Fornecedor("Forncedor A","193264-7127",ETipoRegistro.CNPJ,"wfmzipi@gmail.com"));

		ProdutoDao daoproduto = new ProdutoDaoImp();
		Produto produto1 = new Produto("Fio 2,5 mm", 10, 50.60, 100.00, 101.0);
		produto1.setFornecedor(fornecedor);

		daoproduto.save(produto1);

	}
	
	private static void PopulaProdutoFabricante() throws CustomException {

		FabricanteDao daofabricante = new FabricanteDaoImp();
		ArrayList<Fabricante> fabricante = new ArrayList<>();
		
		fabricante.add(new Fabricante("Fabricante Novo"));

		ProdutoDao daoproduto = new ProdutoDaoImp();
		Produto produto1 = new Produto("Fio 2,5 mm", 10, 50.60, 100.00, 101.0);
		produto1.setFabricante(fabricante);

		daoproduto.save(produto1);

	}
	

	private static void PopulaOrdemCompra() throws CustomException {

		// ================= DAO============================
		OrdemCompraDao daoordemcompra = new OrdemCompraDaoImp();
		ItemOrdemCompraDao daoitemOrdemCompra = new ItemOrdemCompraDaoImp();
		FornecedorDao daofornecedor = new FornecedorDaoImp();
		ProdutoDao daoproduto = new ProdutoDaoImp();

		// ================= Entities =====================
		Fornecedor fornecedor = daofornecedor.findById(Long.valueOf(18));
		List<ItemOrdemCompra> list_itemOrdemCompra = new ArrayList<>();
		
		OrdemCompra ordemCompra = new OrdemCompra();
		
		list_itemOrdemCompra.add(new ItemOrdemCompra(10,ordemCompra, daoproduto.findById(Long.valueOf(15))));
		list_itemOrdemCompra.add(new ItemOrdemCompra(10,ordemCompra, daoproduto.findById(Long.valueOf(16))));
		list_itemOrdemCompra.add(new ItemOrdemCompra(10,ordemCompra, daoproduto.findById(Long.valueOf(17))));
		list_itemOrdemCompra.add(new ItemOrdemCompra(10,ordemCompra, daoproduto.findById(Long.valueOf(18))));
		list_itemOrdemCompra.add(new ItemOrdemCompra(10,ordemCompra, daoproduto.findById(Long.valueOf(19))));

		
		double stot = 0;
		double tot = 0;
		for (int i = 0; i < list_itemOrdemCompra.size(); i++) {
			stot+=list_itemOrdemCompra.get(i).getProduto().getPrecoVenda();
			tot+=list_itemOrdemCompra.get(i).getProduto().getPrecoVenda();
		}
	
			
		ordemCompra.setDataCompra(new Date());
		ordemCompra.setDataPagamento(new Date());
		ordemCompra.setDesconto(0.0);
		ordemCompra.setStatus(EEstatus.ABERTO);
		ordemCompra.setFormaPagamento(EFormaPagamento.DINEHIRO);
		ordemCompra.setFornecedor(fornecedor);       
		ordemCompra.setItemOrdemCompra(list_itemOrdemCompra);
		ordemCompra.setSubtotal(stot);
		ordemCompra.setTotal(tot);
		
		
		
		
		daoordemcompra.save(ordemCompra);

		
		//cascade=CascadeType.ALL
//	 OrdemCompra ordemCompra = new OrdemCompra(new Date(),new Date(),TipoStatus.FECHADO,100.0,10.0,90.0, FormaPagamento.DINHEIRO, fornecedor);
//	 daoordemcompra.save(ordemCompra);

		// new SimpleDateFormat("yyyy-MM-dd HH:mm").parse("2017-12-15 10:00"));
	}

	
//	 daocliente.findAll().forEach( x -> System.out.println(x));
//	 daotelefone.findAll().forEach( x -> System.out.println(x));
//	 daocliente.findById(Long.valueOf(55)).getTelefonecliente().forEach(x -> System.out.println(x));

	
}

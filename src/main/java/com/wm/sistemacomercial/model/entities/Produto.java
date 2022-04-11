package com.wm.sistemacomercial.model.entities;



import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
 

@Entity(name = "Produto")
public class Produto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PRODUTO")
	private Long idproduto;     

	@Column(name = "NOME")
	private String nome;

	@Column(name = "QUANTIDADE")
	private int quantidade;
	
	@Column(name = "PRECO_COMPRA")
	private Double precocompra;
	
	@Column(name = "MARGEM")
	private Double margem;
	
	@Column(name = "PRECO_VENDA")
	private Double precovenda;

	@ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="PRODUTO_FORNECEDOR",
         joinColumns={@JoinColumn(name="ID_PRODUTO",
               referencedColumnName="ID_PRODUTO")},
         inverseJoinColumns={@JoinColumn(name="ID_FORNECEDOR",
               referencedColumnName="ID_FORNECEDOR")})
	private List<Fornecedor> fornecedor;
	
	@ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="PRODUTO_FABRICANTE",
         joinColumns={@JoinColumn(name="ID_PRODUTO",
               referencedColumnName="ID_PRODUTO")},
         inverseJoinColumns={@JoinColumn(name="ID_FABRICANTE",
               referencedColumnName="ID_FABRICANTE")})
	private List<Fabricante> fabricante;
	
	
	
	public Produto() {};
	
	
	public Produto(String nome, int quantidade, Double precoCompra, Double margem, Double precoVenda) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.precocompra = precoCompra;
		this.margem = margem;
		this.precovenda = precoVenda;
	}

	public Long getIDProduto() {
		return idproduto;
	}

	public void setIDProduto(Long iDProduto) {
		this.idproduto = iDProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Number getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrecoCompra() {
		return precocompra;
	}

	public void setPrecoCompra(Double precoCompra) {
		this.precocompra = precoCompra;
	}

	public Double getMargem() {
		return margem;
	}

	public void setMargem(Double margem) {
		this.margem = margem;
	}

	public Double getPrecoVenda() {
		return precovenda;
	}

	public void setPrecoVenda(Double precoVenda) {
		this.precovenda = precoVenda;
	}


	
	
	public Double getPrecocompra() {
		return precocompra;
	}


	public void setPrecocompra(Double precocompra) {
		this.precocompra = precocompra;
	}


	public Double getPrecovenda() {
		return precovenda;
	}


	public void setPrecovenda(Double precovenda) {
		this.precovenda = precovenda;
	}


	public List<Fornecedor> getFornecedor() {
		return fornecedor;
	}


	public void setFornecedor(List<Fornecedor> fornecedor) {
		this.fornecedor = fornecedor;
	}

	
	

	public List<Fabricante> getFabricante() {
		return fabricante;
	}


	public void setFabricante(List<Fabricante> fabricante) {
		this.fabricante = fabricante;
	}


	@Override
	public String toString() {
		return "Produto [Nome=" + nome + ", Quantidade=" + quantidade + ", PrecoCompra=" + precocompra + ", Margem="
				+ margem + ", PrecoVenda=" + precovenda + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
}

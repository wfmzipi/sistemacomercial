package com.wm.sistemacomercial.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "Produto")
public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_produto")
	private Long idproduto;

	@Column(name = "nome")
	private String nome;

	@Column(name = "quantidade")
	private int quantidade;

	@Column(name = "preco_compra")
	private Double precocompra;

	@Column(name = "margem")
	private Double margem;

	@Column(name = "preco_venda")
	private Double precovenda;
	

	@JsonIgnore
	@ManyToMany()
	@JoinTable(name = "PRODUTO_FORNECEDOR", joinColumns = {
			@JoinColumn(name = "id_produto", referencedColumnName = "id_produto") }, inverseJoinColumns = {
					@JoinColumn(name = "id_fornecedor", referencedColumnName = "id_fornecedor") })
	private List<Fornecedor> fornecedor;

	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "PRODUTO_FABRICANTE", joinColumns = {
			@JoinColumn(name = "id_produto", referencedColumnName = "id_produto") }, inverseJoinColumns = {
					@JoinColumn(name = "id_fabricante", referencedColumnName = "id_fabricante") })
	private List<Fabricante> fabricante;

	@JsonIgnore
	@OneToMany()
	@JoinColumn(name = "ID_PRODUTO")
	private List<OrdemVendaItem> ordemVendaItem;
	
	
	
	
	
	public Produto() {
	};

	public Produto(String nome, int quantidade, Double precocompra, Double margem, Double precovenda) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.precocompra = precocompra;
		this.margem = margem;
		this.precovenda = precovenda;
	}


	public Produto(String nome, int quantidade, Double precocompra, Double margem, Double precovenda,
			List<Fornecedor> fornecedor, List<Fabricante> fabricante) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.precocompra = precocompra;
		this.margem = margem;
		this.precovenda = precovenda;
		this.fornecedor = fornecedor;
		this.fabricante = fabricante;
	}

		
	public Long getIdproduto() {
		return idproduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrecocompra() {
		return precocompra;
	}

	public void setPrecocompra(Double precocompra) {
		this.precocompra = precocompra;
	}

	public Double getMargem() {
		return margem;
	}

	public void setMargem(Double margem) {
		this.margem = margem;
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
		return "Produto [idproduto=" + idproduto + ", nome=" + nome + ", quantidade=" + quantidade + ", precocompra="
				+ precocompra + ", margem=" + margem + ", precovenda=" + precovenda ;
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

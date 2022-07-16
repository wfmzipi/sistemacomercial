package com.wm.sistemacomercial.model.entities;



import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "Ordem_Compra_Item")
public class OrdemCompraItem implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ORDEM_COMPRA_ITEM", nullable = false)
	private Long idOrdemCompraItem;
	
	@Column(name = "QUANTIDADE")
	private int quantidade;
		
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "ID_ORDEM_COMPRA")
	private OrdemCompra ordemCompra;
	
	@OneToOne
	@JoinColumn(name="ID_PRODUTO")
	private Produto produto;
	
	
	public OrdemCompraItem() {}

	public OrdemCompraItem(Integer quantidade, OrdemCompra ordemCompra, Produto produto) {
		this.quantidade = quantidade;
		this.ordemCompra = ordemCompra;
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public OrdemCompra getOrdemCompra() {
		return ordemCompra;
	}

	public void setOrdemCompra(OrdemCompra ordemCompra) {
		this.ordemCompra = ordemCompra;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Long getIdOrdemCompraItem() {
		return idOrdemCompraItem;
	}

	@Override
	public String toString() {
		return "OrdemCompraItem [idOrdemCompraItem=" + idOrdemCompraItem + ", quantidade=" + quantidade
				+ ", ordemCompra=" + ordemCompra + ", produto=" + produto + "]";
	}
	
	
}

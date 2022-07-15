package com.wm.sistemacomercial.model.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "ordem_venda_item")
public class OrdemVendaItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ITEM_VENDA")
	private int IdItemVenda;
		
	@Column(name = "QUANTIDADE")
	private int Quantidade;

	@ManyToOne()
	@JoinColumn(name = "ID_VENDA")
	private OrdemVenda ordemVenda;
	
	@JsonIgnore
	@OneToOne()
	@JoinColumn(name = "ID_PRODUTO")
	private Produto produto;
	
	public OrdemVendaItem() {};
	
	public OrdemVendaItem(int quantidade, OrdemVenda ordemVenda, Produto produto) {
		this.Quantidade = quantidade;
		this.ordemVenda = ordemVenda;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		Quantidade = quantidade;
	}

	public OrdemVenda getOrdemVenda() {
		return ordemVenda;
	}

	public void setOrdemVenda(OrdemVenda ordemVenda) {
		this.ordemVenda = ordemVenda;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		produto = produto;
	}
	
	
	
}

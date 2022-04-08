package model.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name="ITEM_ORDEM_COMPRA")
public class ItemOrdemCompra implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ITEM_ORDEM_COMPRA", nullable = false)
	private Long idItemOrdemCompra;
	
	@Column(name = "QUANTIDADE")
	private int quantidade;
		
	@ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ORDEM_COMPRA")
	private OrdemCompra ordemCompra;
	
	@OneToOne
	@JoinColumn(name="ID_PRODUTO")
	private Produto produto;
	
	
	public ItemOrdemCompra() {}

	public ItemOrdemCompra(Integer quantidade, Produto produto) {
		this.quantidade = quantidade;
		this.produto = produto;
	}
	

	public ItemOrdemCompra(Integer quantidade, OrdemCompra ordemCompra, Produto produto) {
		this.quantidade = quantidade;
		this.ordemCompra = ordemCompra;
		this.produto = produto;
	}

	
	
	public Long getIdItemOrdemCompra() {
		return idItemOrdemCompra;
	}

	public void setIdItemOrdemCompra(Long idItemOrdemCompra) {
		this.idItemOrdemCompra = idItemOrdemCompra;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
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

	@Override
	public String toString() {
		return "ItemOrdemCompra [idItemOrdemCompra=" + idItemOrdemCompra + ", quantidade=" + quantidade
				+ ", ordemCompra=" + ordemCompra + ", produto=" + produto + "]";
	}


	
	
	
	
	
	
}

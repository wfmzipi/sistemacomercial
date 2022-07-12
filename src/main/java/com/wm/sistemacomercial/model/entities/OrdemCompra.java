package com.wm.sistemacomercial.model.entities;



import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.wm.sistemacomercial.model.entities.enums.EEstatus;
import com.wm.sistemacomercial.model.entities.enums.EFormaPagamento;

@Entity(name = "Ordem_Compra")
public class OrdemCompra implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ordem_compra", nullable = false)
	private Long id_ordem_compra;
	
	@Column(name = "data_compra")
	private String dataCompra;
	
	@Column(name = "data_pagamento")
	private Date dataPagamento;
	
	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private EEstatus status;
	
	@Column(name = "subtotal")
	private Double subtotal;
	
	@Column(name = "desconto")
	private Double desconto;
	
	@Column(name = "total")
	private Double total;
	
	@Column(name = "forma_pagamento")
	@Enumerated(EnumType.STRING)
	private EFormaPagamento formaPagamento;
	
	@OneToOne
	@JoinColumn(name="id_fornecedor")
	private Fornecedor fornecedor;

	@OneToMany(mappedBy = "ordemCompra")
    private List<ItemOrdemCompra> itemOrdemCompra;
	
	
	public OrdemCompra() {}


	public OrdemCompra(String dataCompra, Date dataPagamento, EEstatus status, Double subtotal, Double desconto,
			Double total, EFormaPagamento formaPagamento, Fornecedor fornecedor,
			List<ItemOrdemCompra> itemOrdemCompra) {
		this.dataCompra = dataCompra;
		this.dataPagamento = dataPagamento;
		this.status = status;
		this.subtotal = subtotal;
		this.desconto = desconto;
		this.total = total;
		this.formaPagamento = formaPagamento;
		this.fornecedor = fornecedor;
		this.itemOrdemCompra = itemOrdemCompra;
	}

	public OrdemCompra(String dataCompra, Date dataPagamento, EEstatus status, Double subtotal, Double desconto,
			Double total, EFormaPagamento formaPagamento, Fornecedor fornecedor) {
		this.dataCompra = dataCompra;
		this.dataPagamento = dataPagamento;
		this.status = status;
		this.subtotal = subtotal;
		this.desconto = desconto;
		this.total = total;
		this.formaPagamento = formaPagamento;
		this.fornecedor = fornecedor;
	}
	
	
	public Long getIdordemcompra() {
		return id_ordem_compra;
	}


	public void setIdordemcompra(Long idordemcompra) {
		this.id_ordem_compra = idordemcompra;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String getdataCompra() {
		return dataCompra;
	}


	public void setdataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}


	public Date getdataPagamento() {
		return dataPagamento;
	}


	public void setdataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}


	public EEstatus getStatus() {
		return status;
	}


	public void setStatus(EEstatus status) {
		this.status = status;
	}


	public Double getSubtotal() {
		return subtotal;
	}


	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}


	public Double getDesconto() {
		return desconto;
	}


	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}


	public Double getTotal() {
		return total;
	}


	public void setTotal(Double total) {
		this.total = total;
	}


	public EFormaPagamento getFormaPagamento() {
		return formaPagamento;
	}


	public void setFormaPagamento(EFormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}


	public Fornecedor getFornecedor() {
		return fornecedor;
	}


	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}


	public List<ItemOrdemCompra> getItemOrdemCompra() {
		return itemOrdemCompra;
	}


	public void setItemOrdemCompra(List<ItemOrdemCompra> itemOrdemCompra) {
		this.itemOrdemCompra = itemOrdemCompra;
	}


	@Override
	public String toString() {
		return "OrdemCompra [idordemcompra=" + id_ordem_compra + ", dataCompra=" + dataCompra + ", dataPagamento="
				+ dataPagamento + ", status=" + status + ", subtotal=" + subtotal + ", desconto=" + desconto
				+ ", total=" + total + ", formaPagamento=" + formaPagamento + ", fornecedor=" + fornecedor
				+ ", itemOrdemCompra=" + itemOrdemCompra + "]";
	}


	
	
	
	
	
}

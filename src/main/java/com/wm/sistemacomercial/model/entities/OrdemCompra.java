package com.wm.sistemacomercial.model.entities;



import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
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
	@Column(name = "ID_ORDEM_COMPRA", nullable = false)
	private Long idordemcompra;
	
	@Column(name = "DATA_COMPRA")
	private Date dataCompra;
	
	@Column(name = "DATA_PAGAMENTO")
	private Date dataPagamento;
	
	@Column(name = "STATUS")
	@Enumerated(EnumType.STRING)
	private EEstatus status;
	
	@Column(name = "SUBTOTAL")
	private Double subtotal;
	
	@Column(name = "DESCONTO")
	private Double desconto;
	
	@Column(name = "TOTAL")
	private Double total;
	
	@Column(name = "FORMA_PAGAMENTO")
	@Enumerated(EnumType.STRING)
	private EFormaPagamento formaPagamento;
	
	@OneToOne
	@JoinColumn(name="ID_FORNECEDOR")
	private Fornecedor fornecedor;

	@OneToMany(mappedBy = "ordemCompra", cascade = CascadeType.ALL)
    private List<ItemOrdemCompra> itemOrdemCompra;
	
	
	public OrdemCompra() {}


	public OrdemCompra(Date dataCompra, Date dataPagamento, EEstatus status, Double subtotal, Double desconto,
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


	
	
	public Long getIdordemcompra() {
		return idordemcompra;
	}


	public void setIdordemcompra(Long idordemcompra) {
		this.idordemcompra = idordemcompra;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Date getDataCompra() {
		return dataCompra;
	}


	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}


	public Date getDataPagamento() {
		return dataPagamento;
	}


	public void setDataPagamento(Date dataPagamento) {
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
		return "OrdemCompra [idordemcompra=" + idordemcompra + ", dataCompra=" + dataCompra + ", dataPagamento="
				+ dataPagamento + ", status=" + status + ", subtotal=" + subtotal + ", desconto=" + desconto
				+ ", total=" + total + ", formaPagamento=" + formaPagamento + ", fornecedor=" + fornecedor
				+ ", itemOrdemCompra=" + itemOrdemCompra + "]";
	}


	
	
	
	
	
}

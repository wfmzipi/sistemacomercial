package com.wm.sistemacomercial.model.entities;



import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wm.sistemacomercial.model.entities.enums.EFormaPagamento;

@Entity(name = "Ordem_venda")
public class OrdemVenda implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_VENDA")
	private Long IdVenda;
	
	@Column(name = "DATA_VENDA")
	private Date dataVenda;
	
	@Column(name = "SUBTOTAL")
	private Double subTotal;

	@Column(name = "DESCONTO")
	private Double Desconto;
	
	@Column(name = "TOTAL")
	private Double Total;
	
	@Column(name = "FORMA_PAGAMENTO")
	private EFormaPagamento FormaPagament;

	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_VENDA", referencedColumnName = "ID_VENDA")
	private List<OrdemVendaItem> ordemVendaItem;
	
	
	
	public OrdemVenda() {};	
	
	public OrdemVenda(Date dataVenda, Double subTotal, Double desconto, Double total, EFormaPagamento formaPagament
			) {
		this.dataVenda = dataVenda;
		this.subTotal = subTotal;
		this.Desconto = desconto;
		this.Total = total;
		this.FormaPagament = formaPagament;
		
	}

	public Long getIdVenda() {
		return IdVenda;
	}

	public void setIdVenda(Long idVenda) {
		IdVenda = idVenda;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		dataVenda = dataVenda;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		subTotal = subTotal;
	}

	public Double getDesconto() {
		return Desconto;
	}

	public void setDesconto(Double desconto) {
		Desconto = desconto;
	}

	public Double getTotal() {
		return Total;
	}

	public void setTotal(Double total) {
		Total = total;
	}

	public EFormaPagamento getFormaPagament() {
		return FormaPagament;
	}

	public void setFormaPagament(EFormaPagamento formaPagament) {
		FormaPagament = formaPagament;
	}


	
	
	
	
}

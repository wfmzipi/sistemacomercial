package com.wm.sistemacomercial.model.entities;



import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.wm.sistemacomercial.model.entities.enums.EFormaPagamento;

@Entity(name = "Ordem_venda")
public class OrdemVenda implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_VENDA")
	private Long IdVenda;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy'T'HH:mm:ss'Z'", timezone = "GMT" )
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

	@OneToMany(mappedBy = "ordemVenda")
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

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
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

	public List<OrdemVendaItem> getOrdemVendaItem() {
		return ordemVendaItem;
	}

	public void setOrdemVendaItem(List<OrdemVendaItem> ordemVendaItem) {
		this.ordemVendaItem = ordemVendaItem;
	}

	public Long getIdVenda() {
		return IdVenda;
	}



	
	
	
	
}

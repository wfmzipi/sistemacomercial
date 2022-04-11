package com.wm.sistemacomercial.model.entities;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.wm.sistemacomercial.model.entities.enums.EFormaPagamento;

@Entity(name = "Venda_Reciclagem")
public class VendaReciclagem implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_VENDA")
	private Long IDVenda;
	
	@Column(name = "DATA_VENDA")
	private Date DataVenda;
	
	@Column(name = "SUB_TOTAL")
	private Double SubTotal;

	@Column(name = "DESCONTO")
	private Double Desconto;
	
	@Column(name = "TOTAL")
	private Double Total;
	
	@Column(name = "FORMA_PAGAMENTO")
	private EFormaPagamento FormaPagament;
	
}

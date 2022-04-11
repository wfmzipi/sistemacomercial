package com.wm.sistemacomercial.model.entities;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.wm.sistemacomercial.model.entities.enums.EEstatus;
import com.wm.sistemacomercial.model.entities.enums.EFormaPagamento;


@Entity(name = "Ordem_Servico")
public class OrdemServico implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ORDEM_SERVICO")
	private Long IDOrdemServico;
	
	@Column(name = "DATA_ENTRADA")
	private Date DataEntrada; 
	
	@Column(name = "DATA_SAIDA")
	private Date DataSaida;
	
	@Column(name = "STATUS") 
	private EEstatus Status;
	
	@Column(name = "ORCAMENTO")
	private Double Orcamento;
	
	@Column(name = "DESCRICAO_OBJETO")
	private String DescriCaoObjeto;
	
	@Column(name = "SUBTOTAL")
	private Double SubTotal;
		
	@Column(name = "DESCONTO") 
	private Double Desconto;
	
	@Column(name = "TOTAL")
	private Double Total;
	
	@Column(name = "FORMA_PAGAMENTO") 
	private EFormaPagamento FormaPagamento;
	

	private Cliente cliente; 
	
	

}

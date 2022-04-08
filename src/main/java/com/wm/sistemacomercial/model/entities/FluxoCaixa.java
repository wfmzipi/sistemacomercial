package model.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import model.entities.enums.ETipOperacao;

@Entity(name="FLUXOCAIXA")
public class FluxoCaixa implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_FLUXO_CAIXA")
	private Long IDFluxoCaixa;
	
	@Column(name = "TIPO_OPERACAO")
	private ETipOperacao TipoOperacao; 
	
	@Column(name = "ID_OPERACAO")
	private Number IDOperacao;

	@Column(name = "DATA_OPERACAO")
	private Date DataOperacao;
	
	@Column(name = "VALOR")
	private Number Valor;


	
	
	
}

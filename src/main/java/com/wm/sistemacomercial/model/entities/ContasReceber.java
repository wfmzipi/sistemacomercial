package com.wm.sistemacomercial.model.entities;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.wm.sistemacomercial.model.entities.enums.EStatusConta;

@Entity(name = "Contas_Receber")
public class ContasReceber implements Serializable {
 	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CONTA_RECEBER")
	private Long IDContaReceber;
	
	@Column(name = "DATA_INCLUSAO")
	private Date DataInclusao;
	
	@Column(name = "DATA_RECEBIMENT")
	private Date DataRecebimento;
	
	@Column(name = "VALOR_TOTAL")
	private Number ValorTotal;
	
	@Column(name = "STATUS")
	private EStatusConta Status;

	public ContasReceber() {};
	
	public ContasReceber(Date dataInclusao, Date dataRecebimento, Number valorTotal, EStatusConta status) {
		DataInclusao = dataInclusao;
		DataRecebimento = dataRecebimento;
		ValorTotal = valorTotal;
		Status = status;
	}

	public Long getIDContaReceber() {
		return IDContaReceber;
	}

	public void setIDContaReceber(Long iDContaReceber) {
		IDContaReceber = iDContaReceber;
	}

	public Date getDataInclusao() {
		return DataInclusao;
	}

	public void setDataInclusao(Date dataInclusao) {
		DataInclusao = dataInclusao;
	}

	public Date getDataRecebimento() {
		return DataRecebimento;
	}

	public void setDataRecebimento(Date dataRecebimento) {
		DataRecebimento = dataRecebimento;
	}

	public Number getValorTotal() {
		return ValorTotal;
	}

	public void setValorTotal(Number valorTotal) {
		ValorTotal = valorTotal;
	}

	public EStatusConta getStatus() {
		return Status;
	}

	public void setStatus(EStatusConta status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "ContasReceber [IDContaReceber=" + IDContaReceber + ", DataInclusao=" + DataInclusao
				+ ", DataRecebimento=" + DataRecebimento + ", ValorTotal=" + ValorTotal + ", Status=" + Status + "]";
	}

		

}

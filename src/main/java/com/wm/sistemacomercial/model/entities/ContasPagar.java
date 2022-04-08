package model.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import model.entities.enums.StatusConta;

@Entity(name="Contas_Pagar")
public class ContasPagar implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CONTA_PAGAR")
	private Long IDContaPagar;
	
	@Column(name = "DATA_INCLUSAO")
	private Date DataInclusao;
	
	@Column(name = "DATA_PAGAMENTO")
	private Date DataPagamento;
	
	@Column(name = "VALOR_TOTAL")
	private Number ValorTotal;
	
	@Column(name = "DATA_VENCIMENTO")
	private Date DataVencimento;
	
	@Column(name = "STATUS")
	private StatusConta Status;

	public Long getIDContaPagar() {
		return IDContaPagar;
	}

	public void setIDContaPagar(Long iDContaPagar) {
		IDContaPagar = iDContaPagar;
	}

	public Date getDataInclusao() {
		return DataInclusao;
	}

	public void setDataInclusao(Date dataInclusao) {
		DataInclusao = dataInclusao;
	}

	public Date getDataPagamento() {
		return DataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		DataPagamento = dataPagamento;
	}

	public Number getValorTotal() {
		return ValorTotal;
	}

	public void setValorTotal(Number valorTotal) {
		ValorTotal = valorTotal;
	}

	public Date getDataVencimento() {
		return DataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		DataVencimento = dataVencimento;
	}

	public StatusConta getStatus() {
		return Status;
	}

	public void setStatus(StatusConta status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "ContasPagar [IDContaPagar=" + IDContaPagar + ", DataInclusao=" + DataInclusao + ", DataPagamento="
				+ DataPagamento + ", ValorTotal=" + ValorTotal + ", DataVencimento=" + DataVencimento + ", Status="
				+ Status + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((IDContaPagar == null) ? 0 : IDContaPagar.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContasPagar other = (ContasPagar) obj;
		if (IDContaPagar == null) {
			if (other.IDContaPagar != null)
				return false;
		} else if (!IDContaPagar.equals(other.IDContaPagar))
			return false;
		return true;
	}
	
	
	
	
	

}

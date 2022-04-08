package model.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

import model.entities.enums.ETipoTelefone;

@Entity(name = "TELEFONE")
public class Telefone implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TELEFONE")
	private Long idteelefone;

	@Column(name = "TELEFONE")
	private String telefone;

	@Column(name = "TIPO_TELEFONE")
	private ETipoTelefone tipotelefone;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "TELEFONE_CLIENTE", joinColumns = {
			@JoinColumn(name = "ID_TELEFONE", referencedColumnName = "ID_TELEFONE") }, inverseJoinColumns = {
					@JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID_CLIENTE") })
	private Cliente cliente;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "TELEFONE_FORNECEDOR", joinColumns = {
			@JoinColumn(name = "ID_TELEFONE", referencedColumnName = "ID_TELEFONE") }, inverseJoinColumns = {
					@JoinColumn(name = "ID_FORNECEDOR", referencedColumnName = "ID_FORNECEDOR") })
	private Fornecedor fornecedor;
	
	
	public Telefone() {
	};

	public Telefone(String telefone, ETipoTelefone tipoTelefone) {
		this.telefone = telefone;
		this.tipotelefone = tipoTelefone;
	}

	public Telefone(String telefone, ETipoTelefone tipoTelefone, Cliente cliente) {
		this.telefone = telefone;
		this.tipotelefone = tipoTelefone;
		this.cliente = cliente;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public ETipoTelefone getTipoTelefone() {
		return tipotelefone;
	}

	public void setTipoTelefone(ETipoTelefone tipoTelefone) {
		this.tipotelefone = tipoTelefone;
	}

	
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	

	public ETipoTelefone getTipotelefone() {
		return tipotelefone;
	}

	public void setTipotelefone(ETipoTelefone tipotelefone) {
		this.tipotelefone = tipotelefone;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	@Override
	public String toString() {
		return "Telefone [IDTelefone=" + idteelefone + ", Telefone=" + telefone + ", TipoTelefone=" + tipotelefone
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
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
		Telefone other = (Telefone) obj;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}

}

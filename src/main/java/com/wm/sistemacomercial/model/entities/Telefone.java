package com.wm.sistemacomercial.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wm.sistemacomercial.model.entities.enums.ETipoTelefone;

@Entity(name = "Telefone")
public class Telefone implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_telefone")
	private Long idteelefone;

	@Column(name = "telefone")
	private String telefone;

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_telefone")
	private ETipoTelefone tipotelefone;

	@JsonIgnore
	@ManyToOne()
	@JoinTable(name = "Telefone_Fornecedor", joinColumns = {
			@JoinColumn(name = "id_telefone", referencedColumnName = "id_telefone") }, inverseJoinColumns = {
					@JoinColumn(name = "id_fornecedor", referencedColumnName = "id_fornecedor") })
	private Fornecedor fornecedor;

	@JsonIgnore
	@ManyToOne()
	@JoinTable(name = "Telefone_Cliente", joinColumns = {
			@JoinColumn(name = "id_telefone", referencedColumnName = "id_telefone") }, inverseJoinColumns = {
					@JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente") })
	private Cliente cliente;

	public Telefone() {
	};

	public Telefone(String telefone, ETipoTelefone tipoTelefone) {
		this.telefone = telefone;
		this.tipotelefone = tipoTelefone;
	}

	public Telefone(String telefone, ETipoTelefone tipotelefone, Cliente cliente) {
		this.telefone = telefone;
		this.tipotelefone = tipotelefone;
		this.cliente = cliente;
	}

	
	
	public Telefone(String telefone, ETipoTelefone tipotelefone, Fornecedor fornecedor) {
		this.telefone = telefone;
		this.tipotelefone = tipotelefone;
		this.fornecedor = fornecedor;
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

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public ETipoTelefone getTipotelefone() {
		return tipotelefone;
	}

	public void setTipotelefone(ETipoTelefone tipotelefone) {
		this.tipotelefone = tipotelefone;
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

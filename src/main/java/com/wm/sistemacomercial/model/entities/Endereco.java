package com.wm.sistemacomercial.model.entities;



import java.io.Serializable;

import javax.persistence.CascadeType;
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
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wm.sistemacomercial.model.entities.enums.ETipoEndereco;

@Entity(name = "Endereco")
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_endereco")
	private Long idendereco;

	@Column(name = "complemento")
	private String complemento;

	@Column(name = "numero")
	private String numero;

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_endereco")
	private ETipoEndereco tipoendereo;

	@OneToOne
	@JoinColumn(name="CEP")
	private CodigoPostal cep;

    @JsonIgnore
	@ManyToOne()
	@JoinTable(name = "Endereco_Cliente", joinColumns = {
			@JoinColumn(name = "id_endereco", referencedColumnName = "id_endereco") }, inverseJoinColumns = {
					@JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente") })
	private Cliente cliente;

    @JsonIgnore
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "ENDERECO_FORNECEDOR", joinColumns = {
			@JoinColumn(name = "ID_ENDERECO", referencedColumnName = "ID_ENDERECO") }, inverseJoinColumns = {
					@JoinColumn(name = "ID_FORNECEDOR", referencedColumnName = "ID_FORNECEDOR") })
	private Fornecedor fornecedor;
	
	
	public Endereco() {
	};

	public Endereco(String complemento, String numero, ETipoEndereco tipoendereo, CodigoPostal cep) {
		this.complemento = complemento;
		this.numero = numero;
		this.tipoendereo = tipoendereo;
		this.cep = cep;
	}

	public Endereco(String complemento, String numero, ETipoEndereco tipoendereo, CodigoPostal cep, Cliente cliente) {
		super();
		this.complemento = complemento;
		this.numero = numero;
		this.tipoendereo = tipoendereo;
		this.cep = cep;
		this.cliente = cliente;
	}

	public Long getIdendereco() {
		return idendereco;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public ETipoEndereco getTipoendereo() {
		return tipoendereo;
	}

	public void setTipoendereo(ETipoEndereco tipoendereo) {
		this.tipoendereo = tipoendereo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public CodigoPostal getCep() {
		return cep;
	}

	public void setCep(CodigoPostal cep) {
		this.cep = cep;
	}
	
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	@Override
	public String toString() {
		return "Endereco [idendereco=" + idendereco + ", complemento=" + complemento + ", numero=" + numero
				+ ", tipoendereo=" + tipoendereo + ", cep=" + cep + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + ((tipoendereo == null) ? 0 : tipoendereo.hashCode());
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
		Endereco other = (Endereco) obj;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (tipoendereo != other.tipoendereo)
			return false;
		return true;
	}

}

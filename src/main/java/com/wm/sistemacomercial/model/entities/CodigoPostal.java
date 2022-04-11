package com.wm.sistemacomercial.model.entities;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "Codigo_Postal")
public class CodigoPostal implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CEP")
	private String Cep;
	
	@Column(name="CIDADE")
	private  String Cidade;
	
	@Column(name="BAIRRO")
	private String Bairro;
	
	@Column(name="ESTADO")
	private String Estado;
	
	@Column(name="LONGRADOURO")
	private String Longradouro;
	
	@Column(name="COMPLEMENTO")
	private String Complemento;
	

	public CodigoPostal() {};
	
	public CodigoPostal(String cEP) {
		Cep = cEP;
	}
	
	public CodigoPostal(String cEP, String cidade, String bairro, String estado, String longradouro,
			String complemento) {
		Cep = cEP;
		Cidade = cidade;
		Bairro = bairro;
		Estado = estado;
		Longradouro = longradouro;
		Complemento = complemento;
	}
	public String getCEP() {
		return Cep;
	}
	public void setCEP(String cEP) {
		Cep = cEP;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getLongradouro() {
		return Longradouro;
	}
	public void setLongradouro(String longradouro) {
		Longradouro = longradouro;
	}
	public String getComplemento() {
		return Complemento;
	}
	public void setComplemento(String complemento) {
		Complemento = complemento;
	}

	@Override
	public String toString() {
		return "CodigoPostal [CEP=" + Cep + ", Cidade=" + Cidade + ", Bairro=" + Bairro + ", Estado=" + Estado
				+ ", Longradouro=" + Longradouro + ", Complemento=" + Complemento + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Cep == null) ? 0 : Cep.hashCode());
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
		CodigoPostal other = (CodigoPostal) obj;
		if (Cep == null) {
			if (other.Cep != null)
				return false;
		} else if (!Cep.equals(other.Cep))
			return false;
		return true;
	}
	
	
	
	
}

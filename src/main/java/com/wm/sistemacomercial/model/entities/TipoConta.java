package com.wm.sistemacomercial.model.entities;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Tipo_Conta")
public class TipoConta implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TIPO_CONTA")
	private Long IDTipoConta; 

	@Column(name = "NOME")
	private String Nome;
	
	@Column(name = "DESCRICAO")
	private String Descricao;

	public TipoConta() {};
	
	public TipoConta(String nome, String descricao) {
		Nome = nome;
		Descricao = descricao;
	}

	public Long getIDTipoConta() {
		return IDTipoConta;
	}

	public void setIDTipoConta(Long iDTipoConta) {
		IDTipoConta = iDTipoConta;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	@Override
	public String toString() {
		return "TipoConta [IDTipoConta=" + IDTipoConta + ", Nome=" + Nome + ", Descricao=" + Descricao + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
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
		TipoConta other = (TipoConta) obj;
		if (Nome == null) {
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		return true;
	}
	
	
	
	
}

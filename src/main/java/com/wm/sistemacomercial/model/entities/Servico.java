package com.wm.sistemacomercial.model.entities;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "Servico")
public class Servico implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_SERVICO")
	private Long IDServico;     
	
	@Column(name = "NOME")
	private String Nome;

	@Column(name = "OBSERVACAO")
	private String Observacao;
	
	@Column(name = "PRECO")
	private Double Preco;
	
	@Column(name = "MARGEM")
	private Double Margem;

	
	public Servico() {};
	
	
	public Servico(String nome, String observacao, Double preco, Double margem) {
		Nome = nome;
		Observacao = observacao;
		Preco = preco;
		Margem = margem;
	}

	public Long getIDServico() {
		return IDServico;
	}

	public void setIDServico(Long iDServico) {
		IDServico = iDServico;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getObservacao() {
		return Observacao;
	}

	public void setObservacao(String observacao) {
		Observacao = observacao;
	}

	public Double getPreco() {
		return Preco;
	}

	public void setPreco(Double preco) {
		Preco = preco;
	}

	public Double getMargem() {
		return Margem;
	}

	public void setMargem(Double margem) {
		Margem = margem;
	}

	@Override
	public String toString() {
		return "Servico [IDServico=" + IDServico + ", Nome=" + Nome + ", Observacao=" + Observacao + ", Preco=" + Preco
				+ ", Margem=" + Margem + "]";
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
		Servico other = (Servico) obj;
		if (Nome == null) {
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		return true;
	}
	
	
	
	
	
	
}

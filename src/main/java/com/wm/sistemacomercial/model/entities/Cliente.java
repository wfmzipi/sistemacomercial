package com.wm.sistemacomercial.model.entities;


import java.io.Serializable;
import java.util.List;

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
import javax.persistence.OneToMany;

import com.wm.sistemacomercial.model.entities.enums.ETipoRegistro;

@Entity(name = "Cliente")
public class Cliente implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cliente;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "registro")
	private String registro;
	
	@Column(name = "tiporegistro")
	@Enumerated(EnumType.STRING)
	private ETipoRegistro tiporegistro;
	
	@Column(name = "email")
	private String email;
	
	@OneToMany( mappedBy = "cliente")
	private List<Endereco> endereco;	
	
	@OneToMany( mappedBy = "cliente")  
    private List<Telefone> telefone;
	
	
	
	public Cliente () {};
	
	public Cliente( String nome, String registro, ETipoRegistro tiporegistro, String email) {		
		this.nome = nome;
		this.registro = registro;
		this.tiporegistro = tiporegistro;
		this.email = email;
	}
	
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getRegistro() {
		return registro;
	}


	public void setRegistro(String registro) {
		this.registro = registro;
	}


	public ETipoRegistro getTiporegistro() {
		return tiporegistro;
	}


	public void setTiporegistro(ETipoRegistro tiporegistro) {
		this.tiporegistro = tiporegistro;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public List<Telefone> getTelefone() {
		return telefone;
	}


	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}


	
	
	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [id_cliente=" + id_cliente + ", nome=" + nome + ", registro=" + registro + ", tipo_registro="
				+ tiporegistro + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((registro == null) ? 0 : registro.hashCode());
		result = prime * result + ((tiporegistro == null) ? 0 : tiporegistro.hashCode());
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
		Cliente other = (Cliente) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (registro == null) {
			if (other.registro != null)
				return false;
		} else if (!registro.equals(other.registro))
			return false;
		if (tiporegistro == null) {
			if (other.tiporegistro != null)
				return false;
		} else if (!tiporegistro.equals(other.tiporegistro))
			return false;
		return true;
	}
	

	
	
	
	
}

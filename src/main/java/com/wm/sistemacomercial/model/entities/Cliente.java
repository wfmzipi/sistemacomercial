package com.wm.sistemacomercial.model.entities;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.wm.sistemacomercial.model.entities.enums.ETipoRegistro;

@Entity(name = "Cliente")
public class Cliente implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cliente;
	

	private String nome;
	

	private String registro;
	
	@Enumerated(EnumType.STRING)
	private ETipoRegistro tiporegistro;
	

	private String email;
	

   // private List<Endereco> endereco;
	

	//private List<Telefone> telefone;
	
	public Cliente () {};
	
	public Cliente(String nome, String registro, ETipoRegistro TipoRegistro, String email) {
		this.nome = nome;
		this.registro = registro;
		this.tiporegistro = TipoRegistro;
		this.email = email;
	}

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
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

	public void setTipo_registro(ETipoRegistro TipoRegistro) {
		this.tiporegistro = TipoRegistro;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

//	public List<Endereco> getEndereco() {
//		return endereco;
//	}
//
//	public void setEndereco(List<Endereco> endereco) {
//		this.endereco = endereco;
//	}

	public void setTiporegistro(ETipoRegistro tiporegistro) {
		this.tiporegistro = tiporegistro;
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

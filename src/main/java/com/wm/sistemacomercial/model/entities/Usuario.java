package com.wm.sistemacomercial.model.entities;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Usuarios")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_USER")
	private Long id;
	
	@Column(name="NOME")
	private String nome;
	
	@Column(name="LOGIN")
	private String login;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="EMAIL")
	private String email;

	public Usuario(Long id, String nome, String login, String password, String email) {
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.password = password;
		this.email = email;
	}
	
	public Usuario() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

		
	@Override
	public String toString() {
		return "Users [id=" + id + ", nome=" + nome + ", login=" + login + ", password=" + password + ", email=" + email
				+ "]";
	}
	
	
	
}

package com.wm.sistemacomercial.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.wm.sistemacomercial.model.entities.enums.ETipoRegistro;

@Entity(name = "Fornecedor")
public class Fornecedor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_fornecedor")
	private Long idfornecedor;

	@Column(name = "nome")
	private String nome;

	@Column(name = "registro")
	private String registro;

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_registro")
	private ETipoRegistro tiporegistro;

	@Column(name = "email")
	private String email;

	@OneToMany(mappedBy = "fornecedor")
	private List<Endereco> endereco;

	@OneToMany(mappedBy = "fornecedor")
	private List<Telefone> telefone;

	@ManyToMany()
	@JoinTable(name = "PRODUTO_FORNECEDOR", joinColumns = {
			@JoinColumn(name = "id_fornecedor", referencedColumnName = "id_fornecedor") }, inverseJoinColumns = {
					@JoinColumn(name = "id_produto", referencedColumnName = "id_produto") })
	private List<Produto> produto;

	
	public Fornecedor() {
	};

	public Fornecedor(String nome, String registro, ETipoRegistro tiporegistro, String email) {
		this.nome = nome;
		this.registro = registro;
		this.tiporegistro = tiporegistro;
		this.email = email;
	}

	public Fornecedor(String nome, String registro, ETipoRegistro tiporegistro, String email, List<Telefone> telefone) {
		super();
		this.nome = nome;
		this.registro = registro;
		this.tiporegistro = tiporegistro;
		this.email = email;
		this.telefone = telefone;
	}

	public Long getIdFornecedor() {
		return idfornecedor;
	}

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public String getregistro() {
		return registro;
	}

	public void setregistro(String registro) {
		this.registro = registro;
	}

	public ETipoRegistro gettiporegistro() {
		return tiporegistro;
	}

	public void settiporegistro(ETipoRegistro tiporegistro) {
		this.tiporegistro = tiporegistro;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
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

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "Forncedor [IdFornecedor=" + idfornecedor + ", nome=" + nome + ", registro=" + registro
				+ ", tiporegistro=" + tiporegistro + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
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
		Fornecedor other = (Fornecedor) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
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
		if (tiporegistro != other.tiporegistro)
			return false;
		return true;
	}

}

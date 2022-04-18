package com.wm.sistemacomercial.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name = "Fabricante")
public class Fabricante implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_fabricante")
	private Long id_fabricante;

	@Column(name = "nome")
	private String nome;

	@ManyToMany()
	@JoinTable(name = "PRODUTO_FABRICANTE", joinColumns = {
			@JoinColumn(name = "id_fabricante", referencedColumnName = "id_fabricante") }, inverseJoinColumns = {
					@JoinColumn(name = "id_produto", referencedColumnName = "id_produto") })
	private List<Produto> produto;

	public Fabricante() {
	};

	public Fabricante(String nome) {
		this.nome = nome;
	}

	public Long getid_fabricante() {
		return this.id_fabricante;
	}

	public void setid_fabricante(Long iDFabricante) {
		this.id_fabricante = iDFabricante;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "Fabricante [IDFabricante=" + id_fabricante + ", Nome=" + nome + "]";
	}

}

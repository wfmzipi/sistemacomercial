package com.wm.sistemacomercial.model.entities;



import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity(name = "Fabricante")
public class Fabricante implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_FABRICANTE")
	private Long idfabricante;
	
	private String Nome;

	
	@ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="PRODUTO_FABRICANTE",
         joinColumns={@JoinColumn(name="ID_FABRICANTE",
               referencedColumnName="ID_FABRICANTE")},
         inverseJoinColumns={@JoinColumn(name="ID_PRODUTO",
               referencedColumnName="ID_PRODUTO")})
	private List<Produto> produto;
	
	
	
	
	public Fabricante() {};
	
	
	public Fabricante( String nome) {
		this.Nome = nome;
	}

	public Long getIDFabricante() {
		return this.idfabricante;
	}

	public void setIDFabricante(Long iDFabricante) {
		this.idfabricante = iDFabricante;
	}

	public String getNome() {
		return this.Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}


	
	
	public List<Produto> getProduto() {
		return produto;
	}


	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}


	@Override
	public String toString() {
		return "Fabricante [IDFabricante=" + idfabricante + ", Nome=" + Nome + "]";
	}
	
	
	
	
	
	
}

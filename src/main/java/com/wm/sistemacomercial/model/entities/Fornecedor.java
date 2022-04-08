package model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import model.entities.enums.ETipoRegistro;


@Entity(name="FORNECEDOR")
public class Fornecedor implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_FORNECEDOR")
	private Long idfornecedor;
	
	@Column(name = "NOME")
	private String Nome;

	@Column(name = "REGISTRO")
	private String Registro;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_REGISTRO")
	private ETipoRegistro TipoRegistro;
	
	@Column(name = "EMAIL")
	private String Email;

	@OneToMany(cascade=CascadeType.ALL)
    @JoinTable(name="ENDERECO_FORNECEDOR",
              joinColumns={@JoinColumn(name="ID_FORNECEDOR",
               referencedColumnName="ID_FORNECEDOR")},
              inverseJoinColumns={@JoinColumn(name="ID_ENDERECO",
               referencedColumnName="ID_ENDERECO")})
    private List<Endereco> endereco;
	
    @OneToMany(cascade=CascadeType.ALL)
    @JoinTable(name="TELEFONE_FORNECEDOR",
              joinColumns={@JoinColumn(name="ID_FORNECEDOR",
               referencedColumnName="ID_FORNECEDOR")},
              inverseJoinColumns={@JoinColumn(name="ID_TELEFONE",
               referencedColumnName="ID_TELEFONE")})
	private List<Telefone> telefone;
	
	@ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="PRODUTO_FORNECEDOR",
         joinColumns={@JoinColumn(name="ID_FORNECEDOR",
               referencedColumnName="ID_FORNECEDOR")},
         inverseJoinColumns={@JoinColumn(name="ID_PRODUTO",
               referencedColumnName="ID_PRODUTO")})
	private List<Produto> produto;
    
	
	public Fornecedor() {};
	
	

	public Fornecedor(String nome, String registro, ETipoRegistro tipoRegistro, String email) {
		super();
		Nome = nome;
		Registro = registro;
		TipoRegistro = tipoRegistro;
		Email = email;
	}

	public Long getIDFornecedor() {
		return idfornecedor;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getRegistro() {
		return Registro;
	}

	public void setRegistro(String registro) {
		Registro = registro;
	}

	public ETipoRegistro getTipoRegistro() {
		return TipoRegistro;
	}

	public void setTipoRegistro(ETipoRegistro tipoRegistro) {
		TipoRegistro = tipoRegistro;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	public List<Endereco> getEndereco() {
		return endereco;
	}



	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}



	public List<Telefone> getTelefone() {
		return telefone;
	}



	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}



	public List<Produto> getProduto() {
		return produto;
	}



	public void setProduto(ArrayList<Produto> produto) {
		this.produto = produto;
	}



	@Override
	public String toString() {
		return "Forncedor [IDFornecedor=" + idfornecedor + ", Nome=" + Nome + ", Registro=" + Registro
				+ ", TipoRegistro=" + TipoRegistro + ", Email=" + Email + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
		result = prime * result + ((Registro == null) ? 0 : Registro.hashCode());
		result = prime * result + ((TipoRegistro == null) ? 0 : TipoRegistro.hashCode());
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
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (Nome == null) {
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		if (Registro == null) {
			if (other.Registro != null)
				return false;
		} else if (!Registro.equals(other.Registro))
			return false;
		if (TipoRegistro != other.TipoRegistro)
			return false;
		return true;
	}

	
	
	
	
}

package com.wm.sistemacomercial.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Endreco_Fornecedor")
public class EnderecoFornecedor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEndereco_Fornecedor;
	
	@Column(name = "ID_ENDERECO")
	private Long IDEndereco;

	@Column(name = "ID_FORNECEDOR")
	private Long IDFornecedor;

	public EnderecoFornecedor(Long iDEndereco, Long iDFornecedor) {
		super();
		IDEndereco = iDEndereco;
		IDFornecedor = iDFornecedor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((IDEndereco == null) ? 0 : IDEndereco.hashCode());
		result = prime * result + ((IDFornecedor == null) ? 0 : IDFornecedor.hashCode());
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
		EnderecoFornecedor other = (EnderecoFornecedor) obj;
		if (IDEndereco == null) {
			if (other.IDEndereco != null)
				return false;
		} else if (!IDEndereco.equals(other.IDEndereco))
			return false;
		if (IDFornecedor == null) {
			if (other.IDFornecedor != null)
				return false;
		} else if (!IDFornecedor.equals(other.IDFornecedor))
			return false;
		return true;
	}

}

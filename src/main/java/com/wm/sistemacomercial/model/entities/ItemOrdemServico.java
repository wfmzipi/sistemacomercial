package com.wm.sistemacomercial.model.entities;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Item_Ordem_Servic")
public class ItemOrdemServico implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ITEM_ORDEM_SERVICO")
	private Long id;
	private Integer quantidade;
	private OrdemServico ordemServico;

//	private List<Produto> produtos = new ArrayList<>();
//	private List<Servico> servico = new ArrayList<>();

	public ItemOrdemServico() {

	}

	public ItemOrdemServico(Long id, Integer quantidade, OrdemServico ordemServico) {
		super();
		this.id = id;
		this.quantidade = quantidade;
		this.ordemServico = ordemServico;
	}

	@Override
	public String toString() {
		return "itemOrdemServico [id=" + id + ", quantidade=" + quantidade + "]";
	}

}

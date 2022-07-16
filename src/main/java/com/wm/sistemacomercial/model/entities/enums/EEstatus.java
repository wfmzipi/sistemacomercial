package com.wm.sistemacomercial.model.entities.enums;

public enum EEstatus {
	ABERTO,
	EXECUCAO,
	FINALIZADO,
	ENTREGUE,
	PENDENTE;
	
	
	/*
	  vaaliar conversão de tipo
	ABERTO(1),
	EXECUCAO(2),
	FINALIZADO(3),
	ENTREGUE(4),
	PENDENTE(5);

	private int code;
	
	private EEstatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static EEstatus valueOf(int code) {
		for (EEstatus value : EEstatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Status inválido");
	}
	*/
}

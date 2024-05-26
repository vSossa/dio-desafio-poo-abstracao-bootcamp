package com;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	private LocalDate data;

	public Mentoria(String nome,
				 String descricao,
				 LocalDate data) {
		super(nome, descricao);
		
		this.data = data;
	}

	@Override
	public double calcularXp() {
		return super.XP_PADRAO; 
	}			

	@Override
	public String toString() {
		return "-- Mentoria\n" +   
			"    Título: "    + super.getTitulo() + "\n" +
			"    Data: "      + this.data         + "\n" +
			"    Descrição: " + super.getDescricao();
	}
}

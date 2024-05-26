package com;

public class Curso extends Conteudo {
	private final double cargaHoraria;

	public Curso(String nome,
				 String descricao,
				 double cargaHoraria) {
		super(nome, descricao);
		
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public double calcularXp() {
		return super.XP_PADRAO * this.cargaHoraria;
	}			

	@Override
	public String toString() {
		return "-- Curso\n" +   
			"    Título: " + getTitulo() + "\n" +
			"    Carga horária: " + this.cargaHoraria + "\n" +
			"    Descrição: " + getDescricao();
	}
}

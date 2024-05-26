package com;

import java.util.Objects;

public abstract class Conteudo { 
	protected final double XP_PADRAO = 10;

	private String titulo;
	private String descricao;

	public Conteudo(String titulo,
				    String descricao) { 
		this.titulo = titulo;
		this.descricao = descricao;	
	}

	public abstract double calcularXp();

	public String getTitulo()    { return this.titulo; }
	public String getDescricao() { return this.descricao; }

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if ( !(o instanceof Conteudo c) ) return false;
		return this.getTitulo() == c.getTitulo();
	} 

	@Override 
	public int hashCode() {
		return Objects.hash(this.getTitulo());
	}
} 

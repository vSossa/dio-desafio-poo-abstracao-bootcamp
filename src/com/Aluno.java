package com;

import java.util.Objects;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashSet;

public class Aluno {
	private String nome;
	private double xpTotal;
	private Set<Conteudo> conteudosInscritos;
	private Set<Conteudo> conteudosConcluidos;

	public Aluno(String nome) {
		this.nome = nome;
		this.xpTotal = 0;
		this.conteudosInscritos = new HashSet<>();
		this.conteudosConcluidos = new LinkedHashSet<>();
	}		

	public String getNome()                       { return this.nome; }
	public Set<Conteudo> getConteudosInscritos()  { return this.conteudosInscritos; }
	public Set<Conteudo> getConteudosConcluidos() { return this.conteudosConcluidos; }
	public double getXpTotal() {
		for (Conteudo conteudo : this.conteudosConcluidos) {
			this.xpTotal += conteudo.calcularXp();
		}	

		return this.xpTotal;
	}

	public void inscrever(Conteudo c) {
		if (c == null) return ;
	
		this.conteudosInscritos.add(c);
	}

	public void avancar() {
		if (this.conteudosInscritos.isEmpty()) return ;
			
		Conteudo conteudoConcluido = null;
		for (Conteudo conteudo : this.conteudosInscritos) {
			conteudoConcluido = conteudo;	
			break;
		}

		if (conteudoConcluido == null) return ;

		this.conteudosInscritos.remove(conteudoConcluido);
		this.conteudosConcluidos.add(conteudoConcluido);
	}

	public void mostrarConteudosInscritos() {
		if (this.conteudosInscritos.isEmpty()) return ;

		for (Conteudo conteudo : this.conteudosInscritos) {
			System.out.println(conteudo);
			System.out.println("====");
		}
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if ( !(o instanceof Aluno a) ) return false;
		return this.getNome() == a.getNome();
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.getNome());	
	}
}

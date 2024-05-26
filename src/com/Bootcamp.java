package com;

import java.util.Objects;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.time.LocalDate;

public class Bootcamp {
	private String nome;
	private String descricao;

	private final LocalDate DATA_INICIAL;
	private final LocalDate DATA_FINAL;

	private Set<Aluno> alunos;
	private Set<Conteudo> conteudos;	
		
	public Bootcamp(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;

		this.DATA_INICIAL = LocalDate.now();
		this.DATA_FINAL = DATA_INICIAL.plusDays(120);

		this.alunos = new HashSet<>();
		this.conteudos = new LinkedHashSet<>();	
	}

	public String getNome()             { return this.nome; } 
	public String getDescricao()        { return this.descricao; }
	public LocalDate getDataDeInicio()  { return this.DATA_INICIAL; }
	public LocalDate getDataDeTermino() { return this.DATA_FINAL; }
	public Set<Conteudo> getConteudos() { return this.conteudos; }
	public Set<Aluno> getAlunos()       { return this.alunos; }	

	public void adicionarAluno(Aluno a) {
		if (a == null) return ;
	
		this.alunos.add(a);
		for (Conteudo conteudo : this.conteudos) {
			a.inscrever(conteudo);
		}
	}

	public void adicionarConteudo(Conteudo c) {
		if (c == null) return ;

		this.conteudos.add(c);	
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if ( !(o instanceof Bootcamp b) ) return false;
		return b.getNome() == this.getNome() && 
			b.getConteudos() == this.getConteudos();
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.getNome(), this.getConteudos());
	}
}

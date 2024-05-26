import com.*;

import java.time.LocalDate; public class Main {
	public static void main(String[] args) {
		Bootcamp b = new Bootcamp("DIO", "dev-java");
		System.out.println(b.getNome());
		System.out.println();

		Conteudo cursoA = new Curso("Java", "Aprendendo java", 3.00);
		Conteudo cursoB = new Curso("Python", "Aprendendo Python", 2.00);
	
		Conteudo mentoriaA = new Mentoria("Organização", 
									      "Aprendendo tecnicas de organização",
									      LocalDate.parse("2024-06-04"));
		Conteudo mentoriaB = new Mentoria("Algoritmos", 
									      "Aprendendo algoritmos",
									      LocalDate.parse("2024-07-04"));
		b.adicionarConteudo(cursoA);
		b.adicionarConteudo(cursoB);
		b.adicionarConteudo(mentoriaA);
		b.adicionarConteudo(mentoriaB);

		Aluno vitor = new Aluno("Vitor");
		System.out.println("Nada ainda");
		vitor.mostrarConteudosInscritos();
		System.out.println();

		Aluno alice = new Aluno("Alice");
		System.out.println("Nada ainda");
		alice.mostrarConteudosInscritos();
		System.out.println();

		b.adicionarAluno(vitor);
		vitor.mostrarConteudosInscritos();
		System.out.println();
 
		b.adicionarAluno(alice);	
		alice.mostrarConteudosInscritos();
		System.out.println();

		System.out.println("====");
		System.out.println("Vitor xp: " + vitor.getXpTotal());
		vitor.avancar();
		vitor.avancar();
		vitor.avancar();
		vitor.avancar();
		vitor.avancar();
		System.out.println("Vitor xp: " + vitor.getXpTotal());
		System.out.println("====");
		
		System.out.println("====");
		System.out.println("Alice xp: " + alice.getXpTotal());
		alice.avancar();
		alice.avancar();
		System.out.println("Alice xp: " + alice.getXpTotal());
		System.out.println("====");
	} 
}

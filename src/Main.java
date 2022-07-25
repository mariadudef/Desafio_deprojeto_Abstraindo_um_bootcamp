import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		String opc, prog;
		int quant;
		System.out.println("----------------------------------");
		Scanner input = new Scanner(System.in);

		System.out.println("Titulo do Bootcamp: ");
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome(input.next());
		System.out.println("Descricaoo do Bootcamp: ");
		bootcamp.setDescricao(input.next());

		do {
			Curso curso = new Curso();
			System.out.println("Titulo do curso: ");
			curso.setTitulo(input.next());
			System.out.println("Descricao do curso: ");
			curso.setDescricao(input.next());
			System.out.println("Carga horaria do curso: ");
			curso.setCargaHoraria(input.nextInt());
			bootcamp.getConteudos().add(curso);

			System.out.println("Dejesa inserir outro curso ? (S/N)");

			opc = input.next().toUpperCase();

		} while (opc.equals("S"));

		do {
			Mentoria mentoria = new Mentoria();
			System.out.println("Titulo da Mentoria: ");
			mentoria.setTitulo(input.next());
			System.out.println("Descricao da Mentoria: ");
			mentoria.setDescricao(input.next());
			bootcamp.getConteudos().add(mentoria);

			System.out.println("Dejesa inserir outra Mentoria ? (S/N)");

			opc = input.next().toUpperCase();

		} while (opc.equals("S"));
		do {
			Dev dev = new Dev();
			System.out.println("Nome do Dev: ");
			dev.setNome(input.next());
			dev.inscreverBootcamp(bootcamp);
			System.out.println("--------------------------------------");
			System.err.println("Conteudos Inscritos" +dev.getNome()+":" +"\n"+  dev.getConteudosInscritos());
			System.out.println("---------------------------------------");
			System.out.println("Voce progrediu no Bootcamp? (S/N)");
			prog = input.next().toUpperCase();
			if (prog.equals("S")) {
				System.out.println("Voce progrediu quantas vezes no Bootcamp? (S/N)");
				quant= input.nextInt();
				for (int i =0; i>quant; i++) {
					dev.progredir();
					
				}
				
				}else {
					System.out.println("Lembre de terminar o Bootcamp no prazo de 45 dias! ");
				}
				System.out.println("------------------------------------------");
			 	System.out.println("Conteúdos Concluídos"+dev.getNome()+":" +dev.getConteudosConcluidos());
			 	System.out.println("XP:" + dev.calcularTotalXp());
			
				
				
				
			
			
			
			
			
			
		} while (opc.equals("S"));

	

	}

}

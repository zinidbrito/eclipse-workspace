package projetoAula2_13;

import java.util.Scanner;

public class ExampleClass {

	public static void main(String[] args) {
		
		
		
		double nota1,nota2,nota3,nota4;
		double frequencia;
		double totalNotas;
		String nomeAluno;
		char statusAluno;
		
		Scanner entradaNotas= new Scanner(System.in);
		Scanner entradaCaracteres = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno...");
			nomeAluno = entradaCaracteres.nextLine();
		
		System.out.println("Digite um caracter para a situação do aluno (O ==> OK; P==> PENDÊNCIA)");
			statusAluno = entradaCaracteres.nextLine().charAt(0);
		
		System.out.println("Digite a primeira nota...");
			nota1 = entradaNotas.nextDouble();
		System.out.println("Digite a segunda nota...");
			nota2 = entradaNotas.nextDouble();
		System.out.println("Digite a terceira nota...");
			nota3 = entradaNotas.nextDouble();
		System.out.println("Digite a quarta nota...");
			nota4 = entradaNotas.nextDouble();
			
		System.out.println("Digite a Frenquencia do aluno...");
			frequencia = entradaNotas.nextDouble();
		
		totalNotas = nota1 + nota2 + nota3 + nota4;
			boolean aprovado = totalNotas >= 70 && frequencia >= 0.75;
			
		System.out.printf("O aluno %s, obteve nota final %.2f e frequencia %.2f%%. A situação do aluno é %c. \n"
				+ "Aluno aprovado? %b.",nomeAluno, totalNotas, frequencia * 100, statusAluno, aprovado);
		
		
		
		
		
		
		
		
	}

}

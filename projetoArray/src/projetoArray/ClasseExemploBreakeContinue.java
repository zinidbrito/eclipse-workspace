package projetoArray;

import java.util.Scanner;

public class ClasseExemploBreakeContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0, somatorio = 0;
		
		System.out.println("Difite o número desejado: ");
		numero = entrada.nextInt();
		
		while (numero > 0) {
			somatorio += numero;
			
			System.out.println("Digite o numeor desejado: ");
			numero = entrada.nextInt();
			
			if (numero == 18) {
				break;
				
			}
			System.out.printf("O somatorio foi: %d", somatorio);
			
		}
		

	}

}

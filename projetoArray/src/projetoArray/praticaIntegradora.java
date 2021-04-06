package projetoArray;

import java.util.Scanner;

public class praticaIntegradora {

	public static void main(String[] args) {
		
		Scanner entCaractere =  new Scanner(System.in);
		Scanner entNumero = new Scanner (System.in);
		char operacao = ' ';
		int[] numeros = new int[1000];
		int i = 0, somatorio = 0;
		double media = 0;
		int contaPares = 0;
		
		do {
			System.out.println("_________________________________\n"
					+ "Menu de opções.\n" 
					+ "[D] - Para Digitar Novos Numeros.\n"
					+ "[Z] - Para Somar todos os numeros\n"
					+ "[V] para visualizar todos os numeros difitador \n"
					+ "[P] para a qunatidade de números digitados\n"
					+ "[M] para a média simples dos numeros digitados\n"
					+ "[Q] para a quantidade de pares\n"
					+ "[S] para sair do programa\n"
					+ "_________________________________\n");
			
			operacao = entCaractere.nextLine().charAt(0);
			
			switch (operacao) {
			case 'D' :  
				System.out.println("Digite o numero desejado...");
				numeros[i] = entNumero.nextInt();
				i++;
				break;
			case 'Z' :
				for (int j = 0; j < i; j++) {
					somatorio += numeros[j];
				}
				System.out.printf("O somatori dos numeor é: %d\n", somatorio);
				break;
			case 'V':
				for (int j = 0; j < i; j++) {
					System.out.printf("%d\n ", numeros[j]);
					}
					break;
			case 'P':
				System.out.printf("Foram digitados %d números.\n", i - 1);
				break;				
			case 'M':
				for (int j = 0; j < i; j++) {
					somatorio += numeros[j];	
				} if (somatorio == 0){
					System.out.println("o Numero zero possui média 0 ou nenhum numero foi digitado.\n");
					} else {
						media = somatorio / i;							
					System.out.printf("A media dos números informados é %.2f.\n", media);
					}
					break;			
			case 'Q':
				for (int j = 0; j < i; j++) {
					if (numeros[j] % 2 == 0)
						contaPares += 1;				
			}
				
			System.out.printf("Quantidade de numeros pares: %d.\n", contaPares);
				break;
			case 'S':
				break;
			default :
				System.out.println("Opção digitada inválida!!");
		} 
			
		}	while (operacao != 'S');
		
		System.out.println("Fim da operação,");
		
		
	}
}
		
		
		
		
		
		
		

	

	



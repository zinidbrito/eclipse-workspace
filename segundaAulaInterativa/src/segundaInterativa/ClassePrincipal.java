package segundaInterativa;
import java.util.*;

public class ClassePrincipal {

	public static void main(String[] args) {
		/*Criar um programa que
		 * Receber nomes, cidades e situa??es de pesosoas
		 * Esse programa nao deve permitir nomes vazios, idades negativas e situa??es diferentes de A I ou E
		 * Ao final do programa exibir : 
		 * a) todos os dados das pessoas
		 * b) a maior idade informada
		 * c)  o numero ou a quatidade de pessoas me cada uma das situa??es
		 * */

		String[] nomes = new String[50];
		int[] idade = new int[50];
		char[] situacoes = new char[50];
		char continuar = 'S';
		int nPessoas = 0, maiorIdade = 0, indiceMaiorIdade = 0;
		
		Scanner entCar = new Scanner(System.in);
		Scanner entNum = new Scanner(System.in);
		int[] totSituacao = new int[3];		
		while (continuar == 'S' || continuar == 's') {
			System.out.printf("Digite o nome da %d? pessoa: \n",nPessoas+1);
				nomes[nPessoas] = entCar.nextLine();
				
		while (nomes[nPessoas].equals("")){
			System.out.printf("Nome Inv?lido. Digite o nome da %d? pessoa:\n", nPessoas+1);
				nomes[nPessoas] = entCar.nextLine();
		}
		
		while (idade[nPessoas] <0) {
		System.out.printf("Digite a idade da %d? pessoa: \\n",nPessoas+1);
		idade[nPessoas] = entNum.nextInt();
	}
		if (idade[nPessoas] > maiorIdade) {
			maiorIdade = idade[nPessoas];
			indiceMaiorIdade = nPessoas;
		}
		System.out.printf("Digite a situa??o da %d pessoa (A, I ou E)",nPessoas+1);
		situacoes[nPessoas] = entCar.nextLine().charAt(0);		
		
		while(situacoes[nPessoas] != 'A' && situacoes[nPessoas] != 'a' && 	
			  situacoes[nPessoas] != 'I' && situacoes[nPessoas] != 'i' &&
			  situacoes[nPessoas] != 'E' && situacoes[nPessoas] != 'e') {
			System.out.printf("Situa??o inv?lida. Digite a situa??o da %d pessoa", nPessoas+1);
				situacoes[nPessoas] = entCar.nextLine().charAt(0);
		
		}
		
		System.out.println("Deseja continuar? (Sim, N?o)");	
		continuar = entCar.nextLine().charAt(0);
		
		
		nPessoas++;		
	}
		
		System.out.println("\n\n******************* In?cio dos Resultados *******************");
		for (int i = 0; i < nPessoas; i++ )
			System.out.printf("Nome: %s. Idade: %d. Situa??o %c. \n",nomes[i], idade[i], situacoes[i]);
		
		System.out.printf("A maior idade encotrada foi: %d", maiorIdade);
		
		System.out.println("totalizad");
	
	}
}


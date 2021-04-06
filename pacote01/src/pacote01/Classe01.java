package pacote01;
import java.io.*;
import java.util.*;

public class Classe01 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[50];
		int contaNros = 0;
		char continuar = 'S';
		while (continuar == 'S' || continuar == 's') {
			System.out.printf("Digite o %dº numero: \n", contaNros+1);
			numeros[contaNros] = entrada.nextInt();
			contaNros++;
			entrada.nextLine();
			System.out.println("Deseja continuar digitando números? (S - sim N - Não)?");
			continuar = entrada.nextLine().charAt(0);
			}
		try {
			FileWriter arq = new FileWriter("C:\\Users\\gabri\\Desktop\\DEV\\gabrielSaida3.txt");
			PrintWriter gravarArquivo = new PrintWriter(arq);
			for (int i = 0; i < contaNros; i++) {
				gravarArquivo.printf("%d%n", numeros[i]);
			}
			arq.close();
			gravarArquivo.close();
			System.out.println("Programa Finalizado");
		}
		catch (IOException e) {
			System.out.println("Erro gravando dados: " + e.getMessage());
		}
		
	}
}
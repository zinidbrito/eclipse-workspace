package projetoArray;
import java.util.Scanner;		

public class ClasseExemplo2 {

	public static void main(String[] args) {
		Scanner entrada =  new Scanner(System.in);
				int numero = 0, somatorio = 0, contador = 0;
		
		do {
			System.out.println("Digite numeros positivos ou zero para sair");
			numero = entrada.nextInt();
			
			if (numero == 18)
			continue;
			
			somatorio += numero;
			
		} while (numero > 0);
		System.out.printf("o total é %d: ", somatorio);
	}
}


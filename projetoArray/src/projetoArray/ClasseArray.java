package projetoArray;
import java.util.*;
public class ClasseArray {

	public static void main(String[] args) {
		
		//tipo[] nome = new tipo[tamanho];
		int[] numeros = new int[5];
		int total = 0;
		
		Scanner entrada = new Scanner(System.in);	
		
		int i = 0;
				for(i = 0; i < numeros.length; i++ ){
					System.out.printf("Digite o %d numero: ", i+1);
					numeros[i] = entrada.nextInt();	
					total += numeros[i];
				}
		
		System.out.println(total);
		
		
	}

}

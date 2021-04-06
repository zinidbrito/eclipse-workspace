package estruturaDados;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<String> carros = new ArrayList<String>();
		
		carros.add("Uno"); //ADD adiciona sempre ao final da lista
		carros.add("Gol");
		carros.add("Palio");	
		
		carros.add(1, "Sandero"); // ADD com index, adiciona String na posi��o desejada no array .add(index, elemento)
		
		if (carros.contains("Gol")) {    // retorna um booleando se CONTAINS a String "Gol"
			System.out.println("Existe a String Gol");
		} else {
			System.out.println("A String Gol N�o existe");
		}	
		
		carros.set(0, "Saveiro");// SET substitui o elemento no index definido .set(index, elemento)
		
		int posicaoGol = carros.indexOf("Gol"); //INDEXOF retorna a primeira posi��o do indice da ocorrencia definida
		System.out.printf("Gol esta no indice %d\n", posicaoGol); // CASO O M�TODO NAO EXISTE, RETORNA "-1"
		
		
		int ultimaPosicaoGol = carros.lastIndexOf("Gol"); //LASTINDEXOF retorna a ultima posi��o do indice da ocorrencia definida
		System.out.println(ultimaPosicaoGol);  // CASO O M�TODO NAO EXISTE, RETORNA "-1"
		
		for (int i = 0; i < carros.size(); i++) { //SIZE retorna o tamanho da lista 
			System.out.println(carros.get(i)); //GET retorna um valor na lista
		}
		
		carros.remove(0); //REMOVER remove a posis��o definida no parenteses
		carros.remove(1);
		
		System.out.println("Removendo...");
		for (int i = 0; i < carros.size(); i++) { //SIZE retorna o tamanho da lista
			System.out.println(carros.get(i)); //GET retorna um valor na lista
		}
		
		
		carros.clear(); // limpa todos os elementos da lista

		System.out.println(carros);
		
		
	}
}

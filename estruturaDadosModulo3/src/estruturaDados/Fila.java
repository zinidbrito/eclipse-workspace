package estruturaDados;
import java.util.*;
public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		
	//adicionando elementos na fila
		fila.add("Pessoa 01");
		fila.add("Pessoa 02");
		fila.add("Pessoa 03");
		fila.add("Pessoa 04");
		fila.add("Pessoa 05");

		System.out.println(fila);
		
		//removendo elemento da fila
		
	System.out.println("Elemento Removido " + fila.remove());
	
	//verificar primeiro elemento da fila
	System.out.println("Elemento Verificado "+ fila.peek());
	
	//procurar elemento na fila (true or false) booleano
	System.out.println(fila.contains("Pessoa 03"));
	
	//retornar tamanho da fila
 System.out.println("Tamho da fila " + fila.size());
 
 //retorna se  afila est� vazia ou n�o
 
   //limpa todos os elementos da fila
   //fila.clear();
 
 System.out.println("A fila est� vazia ? True ou False :" + fila.isEmpty());
 

	
	System.out.println("Resutaldo final ap�s os m�todos" + fila);
	
	 //limpa todos os elementos da fila
	 fila.clear();
		System.out.println("Resutaldo final ap�s o m�todo clear" + fila);
	
	
	
	
	
	
	
	
	
	
	
	}

}

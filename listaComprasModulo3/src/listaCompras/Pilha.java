package listaCompras;
import java.util.*;
public class Pilha {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		Stack<String> stackVazia = new Stack<>();
	
		//adicionado elementos na pilha
		
		stack.add("Livro 1");
		stack.add("Livro 2");
		stack.add("Livro 3");
		stack.add("Livro 4");
		stack.add("Livro 5");
		
		System.out.println(stack);
		
		//removendo elemento da pilha
		
		System.out.println("Ultimo elemento removido " + stack.pop()); //remove o ultimo elemtento
		System.out.println("Elemento removido " + stack);
		
		//retonar o elemendo do topo da pilha sem remover
		stack.peek();
		System.out.println("Ultimo Elemento verificado sem remover " + stack.peek());
		
		//procurar elmento na pilha, caso nao encontre retorna "-1"
		
		System.out.println("Posi��o " + stack.search("Livro 2"));

		//verifica se a piplha est� vazia
		System.out.println(stack.isEmpty());
		System.out.println(stackVazia.isEmpty());
		
	}

}

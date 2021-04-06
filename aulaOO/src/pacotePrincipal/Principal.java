package pacotePrincipal;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Scanner entCaracter = new Scanner(System.in);
		Scanner entNumerico = new Scanner(System.in);
		char imprimirEndereco;
		
		
		System.out.println("Digite o nome ");
			p1.nome = entCaracter.nextLine();
		System.out.println("Digite a idade ");
			p1.idade = entNumerico.nextInt();
		System.out.println("Digite o CPF ");
			p1.CPF = entCaracter.nextLine();
		System.out.println("Digite a Rua ");		
			p1.endereco.logradouro = entCaracter.nextLine();
		System.out.println("Digite o número da rua: ");
			p1.endereco.numero = entNumerico.nextInt();
		System.out.println("Digite o complemento");
			p1.endereco.complemento = entCaracter.nextLine();
		System.out.println("Digite a cidade");
			p1.endereco.cidade = entCaracter.nextLine();
		System.out.println("Digite a estado");
			p1.endereco.estado = entCaracter.nextLine();
		System.out.println("Digite o CEP");
			p1.endereco.CEP = entCaracter.nextLine();
			
		System.out.println("DEseja imprimir os dados com endereço");
		imprimirEndereco =  entCaracter.nextLine().charAt(0);
		
		System.out.printf("%s\n ", p1.imprimirDadosPessoa(imprimirEndereco));
		
		Pessoa p2 = new Pessoa()
		




		

		
		
		
		
		
		
	}
	
	
		
		
		
		
	
		
}

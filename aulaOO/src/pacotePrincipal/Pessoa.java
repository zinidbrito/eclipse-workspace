package pacotePrincipal;

public class Pessoa {
	
		String nome;
		int idade;
		String CPF;
		DadosEndereco endereco;
		
		Pessoa(){
			endereco = new DadosEndereco();				
		}
		
				
		String imprimirDadosPessoa(char imprimirEndereco) {
			if (imprimirEndereco == 'N' || imprimirEndereco == 'n')			
			return "Nome: " + nome + "\nIdade: " + Integer.toString(idade) +
			"\nCPF: " + CPF;
			else 
				return "Nome: " + nome + "\nIdade: " + Integer.toString(idade) +
						"\nCPF: " + CPF + "\n" + endereco.imprimirDadosEndereco();
					
		
		}
}

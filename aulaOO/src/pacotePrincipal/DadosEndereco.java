package pacotePrincipal;

public class DadosEndereco {
	
	String logradouro;
	int numero;
	String complemento;
	String estado;
	String cidade;
	String CEP;
	

	String imprimirDadosEndereco() {		
		return "Rua: " + logradouro + ", " + Integer.toString(numero) + ", " + complemento + ". " + cidade + 
			". Estado: " + estado + "CEP: " + CEP; 
	}
	

}

package projetoAula2_5;

public class ClasseAula2_5 {

	public static void main(String[] args) {
		
	String nome = "Gabriel Diniz de Brito";
	String nome2 = "Ágata Pereira Rodrigues";
	
	
	System.out.println(nome);
	System.out.println(nome2);
	
	int tamanhoDoNome = nome.length();
	int tamanhoDoNome2 = nome2.length();
	
	System.out.println(tamanhoDoNome);
	System.out.println(tamanhoDoNome2);
	
	int totalCaracteres = tamanhoDoNome + tamanhoDoNome2;
	System.out.println(totalCaracteres);
	
	String nomesConcatenados = nome.concat(nome2);
	System.out.println(nomesConcatenados);
	
	String nomeSemEspaco = nome.replace(' ', '.');
	System.out.println(nomeSemEspaco);
	
	
	String somenteNome = nome2.substring(0, 13);
	System.out.println(somenteNome);
	
	String nomeTudoMaiusculo = nome.toUpperCase();
	System.out.println(nomeTudoMaiusculo);
	
	
	}

}

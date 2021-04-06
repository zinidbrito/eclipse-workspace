package projetoArray;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class gravacaoDeArquivos {

	public static void main(String[] args) {
		try {
			FileWriter arquivo = new FileWriter("C:\\Users\\gabri\\LeituraDeArquivos\\saidaDeDados.txt");
			PrintWriter gravarArquivo = new PrintWriter(arquivo);
			
			for(int i = 0; i<= 1000; i++) {
				gravarArquivo.printf("Varlor de i %d:\n", i);
	
				
			}
			
			System.out.println("Arquivo Gravado com Sucesso!");

				gravarArquivo.close();
				arquivo.close();
		}
		catch (IOException e ) {
			System.out.println("Erro ao gravar o arquivo!" + e.getMessage());

		}
	}

}

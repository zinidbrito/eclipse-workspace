package filaAtendimento;
import java.util.*;

public class FilaAtendimento {
	private Scanner scanner = new Scanner(System.in);
	private Queue<String> fila = new LinkedList<>();
	
	private String mostrarMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("Digite o comando desejeado: \n");
		sb.append("1 - ver a fila \n");
		sb.append("2 - adicionar pessoa na fila \n");
		sb.append("3 -  chamar proxima pessoa da fila\n");
		sb.append("4 - limpar a fila \n");
		sb.append("5 - sair \n");
		System.out.println(sb.toString());
		
		return scanner.nextLine();
	}
		
	public void iniciar() {
		String opcao = mostrarMenu();
		while (!opcao.equals("5")) {
			switch (opcao) {
			case "1":
				System.out.println(fila);
				opcao = mostrarMenu();
				break;
			case "2":
				System.out.println("Digite o nome da pessoa para adicionar na fila...");
				String item = scanner.nextLine();
				fila.add(item);
				System.out.println(fila);
				opcao= mostrarMenu();
				break;
			case "3":
				System.out.println("A proxima pessoa é " + fila.remove());
				System.out.println(fila);
				opcao = mostrarMenu();
				break;
			case "4":
				if (fila.isEmpty()) {
					System.out.println("A fila ja está vazia!");
				} else {
				fila.clear();
				System.out.println("A fila foi limpa!" + fila);
			}
				opcao = mostrarMenu();
				break;
			default:
				System.out.println("Opção inválida!");
				opcao = mostrarMenu();
				
			}
		}
	}
	

}

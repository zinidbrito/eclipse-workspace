package listaCompras;
import java.util.*;
/* Digite o comando desejado:
*1 - ver a lista
	*2 - adicionar item na lista
*3 - remover item na lista
*4 - limpar lista
*5- sair
*/
public class ListaCompras {
	private ArrayList<String> lista = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);

	public void iniciar() {
		String opcao = mostrarMenu();
			while (!opcao.equals("5")) {
				switch (opcao) {
			case "1":
				System.out.println(lista);
					opcao = mostrarMenu();
				break;
			case "2":
				System.out.println("Digite um item para adicionar na lista...");
				String item = scanner.nextLine();
				lista.add(item);
				System.out.println(lista);				
					opcao = mostrarMenu();
				break;
			case "3":
				System.out.println("Digite um item para remover na lista...");
				int indice = Integer.valueOf(scanner.nextLine());
				lista.remove(indice);
				System.out.println(lista);
					opcao = mostrarMenu();
				break;
			case "4":
				lista.clear();
				System.out.println(lista);
				opcao = mostrarMenu();
				break;
				default:
					System.out.println("Op??o inv?lida");
					opcao = mostrarMenu();
			}
		}
			
			scanner.close();
			System.out.println("OBRIGADO!");
			
	} 
	
	
	private String mostrarMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("|########MENU DE OP??ES########|\n");
		sb.append("|   Digite o comando desejado  |\n");
		sb.append("|[1] - ver a lista             |\n");
		sb.append("|[2] - adicionar item na lista |\n");
		sb.append("|[3] - remover item na lista   |\n");
		sb.append("|[4] - limpar lista            |\n");
		sb.append("|[5] - sair                    |\n");
		sb.append("################################");
		System.out.println(sb.toString());
		
		return scanner.nextLine();
	}
}

package palindromoMaiorProduto;

public class Palindromo {

	public static void main(String[] args) {
		int i = 0;
		int temp[] = new int[1001];
		int paliInverso = 0;
		int pali = 0;
		int palindromo = 0;
		while (i <= 999) {
			pali = temp[i];
			i++;
		}
		if (pali == paliInverso) {
			palindromo = paliInverso;
			System.out.println(palindromo);
		}

	}

}

/*
 * i = 0 while i <= 999: temp = str(i * 999) tempInverso = temp[::-1] if temp ==
 * tempInverso: pol = int(temp) i += 1 print(pol)
 */
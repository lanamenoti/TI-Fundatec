import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String[] nomes = new String[10];
		boolean nomeEstaNoArray = true;

		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Imforme o nome da pessoa na posição " + i + ":");
			nomes[i] = teclado.next();
		}

		System.out.println("Imforme um nome da pessoa:");
		String nome = teclado.next();
		
		for (int i = 0; i < nomes.length; i++) {
			if (nome.equals(nomes[i])) {
				nomeEstaNoArray = true;
				break;
			} else {
				nomeEstaNoArray = false;
			}
		}
		
		if (nomeEstaNoArray) {
			System.out.println("ACHEI!");
		} else {
			System.out.println("NÃO ACHEI!");
		}
	}

}

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String[] nomes = new String[10];
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Imforme o nome da pessoa na posição " + i + ":" );
			nomes[i] = teclado.next();
		}
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("O nome da pessoa na posição " + i + " é: " + nomes[i] );
		}
	}

}

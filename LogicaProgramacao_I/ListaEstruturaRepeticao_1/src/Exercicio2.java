import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n, soma = 0;

		System.out.println("Digite um n�mero inteiro maior que 1:");
		n = teclado.nextInt();

		for (int i = 1; i <= n; i++) {
			soma = soma + i;
		}
		
		if (soma > 100) {
			System.out.println("O resultado da soma �: " + soma + " e � maior que 100.");
		} else {
			System.out.println("O resultado da soma �: " + soma + " e � menor que 100.");
		}
	}

}

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double[] numeros = new double[10];
		int quantidadePositivos = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um número:");
			numeros[i] = teclado.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > 0) {
				quantidadePositivos++;
			}
		}

		System.out.println("A quantidade de números positivos é " + quantidadePositivos);
	}
}

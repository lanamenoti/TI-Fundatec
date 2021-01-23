import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int[] numeros = new int[10];
		int quantidadePares = 0, quantidadeImpares = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um número:");
			numeros[i] = teclado.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				quantidadePares++;
			} else {
				quantidadeImpares++;
			}
		}

		System.out.println("A quantidade de números pares é " + quantidadePares);
		System.out.println("A quantidade de números ímpares é " + quantidadeImpares);
	}
}

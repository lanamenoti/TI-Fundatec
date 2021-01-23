import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int[] numeros = new int[10];
		int[] numerosArmazenados = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Digite um número para posição %d do array:", i + 1);
			numeros[i] = teclado.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				numerosArmazenados[i] = numeros[i] * 2;
			} else {
				numerosArmazenados[i] = numeros[i] * 3;
			}
		}

		for (int i = 0; i < numerosArmazenados.length; i++) {
			System.out.println(numerosArmazenados[i]);
		}
	}
}

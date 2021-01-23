import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int[] arrayA = new int[10];
		int[] arrayB = new int[10];
		
		for (int i = 0; i < arrayA.length; i++) {
			System.out.printf("Digite um número para posição %d do array:", i + 1);
			arrayA[i] = teclado.nextInt();
		}

		for (int i = 0; i <arrayB.length; i++) {
			arrayB[i] = arrayA[i] * 5;
		}

		for (int i = 0; i < arrayB.length; i++) {
			System.out.printf("O resultado da multiplicação por 5 na posição %d é %d\n", i + 1, arrayB[i]);
		}
	}
}

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int[] arrayA = new int[10];
		int[] arrayB = new int[10];
		
		for (int i = 0; i < arrayA.length; i++) {
			System.out.printf("Digite um n�mero para posi��o %d do array:", i + 1);
			arrayA[i] = teclado.nextInt();
		}

		for (int i = 0; i <arrayB.length; i++) {
			arrayB[i] = arrayA[i] * 5;
		}

		for (int i = 0; i < arrayB.length; i++) {
			System.out.printf("O resultado da multiplica��o por 5 na posi��o %d � %d\n", i + 1, arrayB[i]);
		}
	}
}

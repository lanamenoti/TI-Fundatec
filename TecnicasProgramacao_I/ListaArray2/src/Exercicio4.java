import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int[] numeros = new int[20];
		int[] resultadosMultiplicação = new int[20];
		int numeroASerMultiplicado;

		System.out.println("Digite um número para multiplicar o array:");
		numeroASerMultiplicado = teclado.nextInt();
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Digite um número para posição %d do array:", i + 1);
			numeros[i] = teclado.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {
			resultadosMultiplicação[i] = numeros[i] * numeroASerMultiplicado;
		}

		for (int i = 0; i < resultadosMultiplicação.length; i++) {
			System.out.printf("O resultado da multiplicação na posição %d é %d\n", i + 1, resultadosMultiplicação[i]);
		}
	}

}

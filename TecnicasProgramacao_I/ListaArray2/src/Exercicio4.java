import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int[] numeros = new int[20];
		int[] resultadosMultiplica��o = new int[20];
		int numeroASerMultiplicado;

		System.out.println("Digite um n�mero para multiplicar o array:");
		numeroASerMultiplicado = teclado.nextInt();
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Digite um n�mero para posi��o %d do array:", i + 1);
			numeros[i] = teclado.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {
			resultadosMultiplica��o[i] = numeros[i] * numeroASerMultiplicado;
		}

		for (int i = 0; i < resultadosMultiplica��o.length; i++) {
			System.out.printf("O resultado da multiplica��o na posi��o %d � %d\n", i + 1, resultadosMultiplica��o[i]);
		}
	}

}

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int valor1;
		int valor2;
		int difValores;

		System.out.println("Informe o primeiro valor:");
		valor1 = teclado.nextInt();

		System.out.println("Informe o segundo valor:");
		valor2 = teclado.nextInt();

		if (valor1 > valor2) {
			difValores = valor1 - valor2;
		} else {
			difValores = valor2 - valor1;
		}
		if (difValores > 1000) {
			System.out.println("A diferença entre os valores é maior que 1000");
		} else {
			System.out.println("A diferença entre os valores é menor que 1000");
		}
		if (difValores % 2 == 0) {
			System.out.println("A diferença entre os valores é par");
		} else {
			System.out.println("A diferença entre os valores é ímpar");
		}
	}

}

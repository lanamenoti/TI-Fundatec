import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int A;
		int B;
		int C;
		int soma;
		
		System.out.println("Informe o valor A:");
		A = teclado.nextInt();
		
		System.out.println("Informe o valor B:");
		B = teclado.nextInt();
		
		System.out.println("Informe o valor C:");
		C = teclado.nextInt();
		
		soma = A + B;
		
		if (soma < C) {
			System.out.println("A soma de A e B é menor que C.");
		} else if (soma > C) {
			System.out.println("A soma de A e B é maior que C.");
		} else {
			System.out.println("A soma de A e B é igual a C.");
		}
	}

	

}

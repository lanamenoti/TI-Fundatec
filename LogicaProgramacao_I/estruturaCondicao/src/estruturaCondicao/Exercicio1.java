package estruturaCondicao;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Digite o primeiro n�mero:");
		num1 = teclado.nextInt();
		
		System.out.println("Digite o segundo n�mero:");
		num2 = teclado.nextInt();
		
		if (num1 > num2) {
			System.out.println("O maior n�mero digitado � " + num1);
			System.out.println("O menor n�mero digitado � " + num2);
		} else if (num2 > num1) {
			System.out.println("O maior n�mero digitado � " + num2);
			System.out.println("O menor n�mero digitado � " + num1);
		} else {
			System.out.println("Os n�meros s�o iguais");
		}
	}

}

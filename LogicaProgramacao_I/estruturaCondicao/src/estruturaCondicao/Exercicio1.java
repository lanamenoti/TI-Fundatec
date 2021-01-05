package estruturaCondicao;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Digite o primeiro número:");
		num1 = teclado.nextInt();
		
		System.out.println("Digite o segundo número:");
		num2 = teclado.nextInt();
		
		if (num1 > num2) {
			System.out.println("O maior número digitado é " + num1);
			System.out.println("O menor número digitado é " + num2);
		} else if (num2 > num1) {
			System.out.println("O maior número digitado é " + num2);
			System.out.println("O menor número digitado é " + num1);
		} else {
			System.out.println("Os números são iguais");
		}
	}

}

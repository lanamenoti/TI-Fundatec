package estruturaCondicao;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Informe o valor de a:");
		a = teclado.nextInt();
		
		System.out.println("Informe o valor de b:");
		b = teclado.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("Os n�meros digitados s�o m�ltiplos");
		} else {
			System.out.println("Os n�meros digitados n�o s�o m�ltiplos");
		}
		
	}

}

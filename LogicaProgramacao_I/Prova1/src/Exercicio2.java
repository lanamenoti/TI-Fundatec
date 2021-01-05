import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double num1;
		double num2;
		double resultado;
		char opcao;
		
		System.out.println("Informe o primeiro n�mero:");
		num1 = teclado.nextInt();
		
		System.out.println("Informe o segundo n�mero:");
		num2 = teclado.nextInt();
		
		System.out.println("Escolha uma op��o (a, b, c, d, e):");
		opcao = teclado.next().charAt(0);
		
		switch (opcao) {
		case 'a':
			resultado = num1 + (num2 * num2);
			System.out.println("O resultado da opera��o da op��o escolhida �: " + resultado);
			break;
		case 'b':
			resultado = num1 * 0.45;
			System.out.println("O resultado da opera��o da op��o escolhida �: " + resultado);
			break;	
		case 'c':
			resultado = num2 * 1.3;
			System.out.println("O resultado da opera��o da op��o escolhida �: " + resultado);
			break;
		case 'd':
			resultado = num2 * (num1 * num1);
			System.out.println("O resultado da opera��o da op��o escolhida �: " + resultado);
			break;
		case 'e':
			if (num1 % 5 == 0) {
				System.out.printf("%.0f � multiplo de 5.", num1);
			} else {
				System.out.printf("%.0f n�o � multiplo de 5.", num1);
			}
			break;
		default:
			System.out.println("A op��o digitada � inv�lida!");
			break;
		}
		
	}

}

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double num1;
		double num2;
		double resultado;
		char opcao;
		
		System.out.println("Informe o primeiro número:");
		num1 = teclado.nextInt();
		
		System.out.println("Informe o segundo número:");
		num2 = teclado.nextInt();
		
		System.out.println("Escolha uma opção (a, b, c, d, e):");
		opcao = teclado.next().charAt(0);
		
		switch (opcao) {
		case 'a':
			resultado = num1 + (num2 * num2);
			System.out.println("O resultado da operação da opção escolhida é: " + resultado);
			break;
		case 'b':
			resultado = num1 * 0.45;
			System.out.println("O resultado da operação da opção escolhida é: " + resultado);
			break;	
		case 'c':
			resultado = num2 * 1.3;
			System.out.println("O resultado da operação da opção escolhida é: " + resultado);
			break;
		case 'd':
			resultado = num2 * (num1 * num1);
			System.out.println("O resultado da operação da opção escolhida é: " + resultado);
			break;
		case 'e':
			if (num1 % 5 == 0) {
				System.out.printf("%.0f é multiplo de 5.", num1);
			} else {
				System.out.printf("%.0f não é multiplo de 5.", num1);
			}
			break;
		default:
			System.out.println("A opção digitada é inválida!");
			break;
		}
		
	}

}

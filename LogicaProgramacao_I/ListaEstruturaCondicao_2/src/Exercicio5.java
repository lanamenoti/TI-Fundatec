import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double num1;
		double num2;
		char opcao;
		double calculo;
		
		System.out.println("Informe o primeiro n�mero:");
		num1 = teclado.nextDouble();
		
		System.out.println("Informe o segundo n�mero:");
		num2 = teclado.nextDouble();
		
		System.out.println("Escolha uma op��o:");
		opcao = teclado.next().charAt(0);
		
		if (opcao == 'a') {
			calculo = num1 + (num2 * 2);
			System.out.println("O resultado da op��o escolhida �: " + calculo);
		} else if (opcao == 'b') {
			calculo =  num1 * 0.25;
			System.out.println("O resultado da op��o escolhida �: " + calculo);
		} else if (opcao == 'c') {
			calculo = num2 + (num2 * 0.20);
			System.out.println("O resultado da op��o escolhida �: " + calculo);
		} else {
			System.out.println("Op��o inv�lida!");
		}
	}

}

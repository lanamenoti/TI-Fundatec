import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double num1;
		double num2;
		char opcao;
		double calculo;
		
		System.out.println("Informe o primeiro número:");
		num1 = teclado.nextDouble();
		
		System.out.println("Informe o segundo número:");
		num2 = teclado.nextDouble();
		
		System.out.println("Escolha uma opção:");
		opcao = teclado.next().charAt(0);
		
		if (opcao == 'a') {
			calculo = num1 + (num2 * 2);
			System.out.println("O resultado da opção escolhida é: " + calculo);
		} else if (opcao == 'b') {
			calculo =  num1 * 0.25;
			System.out.println("O resultado da opção escolhida é: " + calculo);
		} else if (opcao == 'c') {
			calculo = num2 + (num2 * 0.20);
			System.out.println("O resultado da opção escolhida é: " + calculo);
		} else {
			System.out.println("Opção inválida!");
		}
	}

}

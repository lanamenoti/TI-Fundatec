import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double salario;
		double vendas;
		
		System.out.println("Informe seu salário:");
		salario = teclado.nextDouble();
		
		System.out.println("Informe o valor das vendas que efetuou:");
		vendas = teclado.nextDouble();
		
		if (vendas <= 1500) {
			salario = salario + (vendas * 0.03);
			System.out.println("O valor do seu salário total é: " + salario);
		} else {
			salario = salario + (vendas * 0.03) + ((vendas - 1500) * 0.05);
			System.out.println("O valor do seu salário total é: " + salario);
		}
	}

}

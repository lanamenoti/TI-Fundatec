import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int quantCarrosVendidos;
		double valorTotalVnedas;
		double salarioFixo;
		double valorCarrosVendidos;
		double salario;
		
		System.out.println("Informe a quantidade de carros vendidos:");
		quantCarrosVendidos = teclado.nextInt();
		
		System.out.println("Informe o valor total de suas vendas:");
		valorTotalVnedas = teclado.nextDouble();
		
		System.out.println("Informe o seu salário fixo:");
		salarioFixo = teclado.nextDouble();
		
		System.out.println("Informe o valor recebido por cada carro vendido:");
		valorCarrosVendidos = teclado.nextDouble();
		
		salario = salarioFixo + (valorTotalVnedas * 0.05) + (quantCarrosVendidos * valorCarrosVendidos);
		System.out.println("Seu salário total é: " + salario);
		
	}

}

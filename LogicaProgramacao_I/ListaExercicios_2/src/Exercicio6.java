import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double salarioLiquido;
		double salarioBruto;
		double comissaoVendas;
		double porcDesconto;
		
		System.out.println("Informe seu sal�rio bruto:");
		salarioBruto = teclado.nextDouble();
		
		System.out.println("Informe o valor de sua comiss�o de vendas:");
		comissaoVendas = teclado.nextDouble();
		
		System.out.println("Informe a porcentagem de desconto:");
		porcDesconto = teclado.nextDouble();
		
		salarioLiquido = salarioBruto + comissaoVendas - ((porcDesconto * (salarioBruto + comissaoVendas)) / 100);
		
		System.out.println("O sal�rio l�quido �: " + salarioLiquido + " reais.");
		
		
	}

}

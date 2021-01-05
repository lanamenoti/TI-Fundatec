import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double valorUnitPor;
		double valorUnitPar;
		double valorUnitA;
		String tipo;
		String nome;
		double compraCliente;
		double totalCompraClienteSemDesc;
		double totalCompraClienteDesc;
		double desconto;
		
		System.out.println("Informe o valor unitário da porca:");
		valorUnitPor = teclado.nextDouble();
		
		System.out.println("Informe o valor unitário do parafuso:");
		valorUnitPar = teclado.nextDouble();
		
		System.out.println("Informe o valor unitário da arruela:");
		valorUnitA = teclado.nextDouble();
		
		System.out.println("Informe o tipo de produto que o cliente quer comprar:");
		tipo = teclado.next();
		
		System.out.println("Informe qual a quantidade de peças compradas pelo cliente:");
		compraCliente = teclado.nextDouble();
		
		System.out.println("Informe o nome do cliente:");
		nome = teclado.next();
		
		
		
		if (tipo.equals("Porca")) {
			totalCompraClienteSemDesc = compraCliente * valorUnitPor;
			valorUnitPor = valorUnitPor - (valorUnitPor * 0.10);
			totalCompraClienteDesc = compraCliente * valorUnitPor;
			
			desconto = totalCompraClienteSemDesc - totalCompraClienteDesc;
			System.out.println("Cliente: " + nome);
			System.out.println("Quantidade de porcas compradas: " + compraCliente);
			System.out.println("Desconto aplicado na compra: " + desconto);
			System.out.println("Total a pagar: " + totalCompraClienteDesc);
		} else if (tipo.equals("Parafuso")) {
			totalCompraClienteSemDesc = compraCliente * valorUnitPar;
			valorUnitPor = valorUnitPor - (valorUnitPar * 0.20);
			totalCompraClienteDesc = compraCliente * valorUnitPar;
			
			desconto = totalCompraClienteSemDesc - totalCompraClienteDesc;
			System.out.println("Cliente: " + nome);
			System.out.println("Quantidade de parafusos compradas: " + compraCliente);
			System.out.println("Desconto aplicado na compra: " + desconto);
			System.out.println("Total a pagar: " + totalCompraClienteDesc);
		} else {
			totalCompraClienteSemDesc = compraCliente * valorUnitA;
			valorUnitPor = valorUnitPor - (valorUnitA * 0.10);
			totalCompraClienteDesc = compraCliente * valorUnitA;
			
			desconto = totalCompraClienteSemDesc - totalCompraClienteDesc;
			System.out.println("Cliente: " + nome);
			System.out.println("Quantidade de arruelas compradas: " + compraCliente);
			System.out.println("Desconto aplicado na compra: " + desconto);
			System.out.println("Total a pagar: " + totalCompraClienteDesc);
		}
		
	}

}

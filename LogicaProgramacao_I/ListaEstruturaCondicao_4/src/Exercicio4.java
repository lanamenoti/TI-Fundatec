import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double valorCliente;
		String moedaCliente;
		double valorDiarioCambioD;
		double valorDiarioCambioE;
		double valorDiarioCambioL;
		double taxaCasaCambio;
		double total;
		
		System.out.println("Informe o valor que o cliente quer trocar:");
		valorCliente = teclado.nextDouble();
		
		System.out.println("Informe a moeda que o cliente quer trocar:");
		moedaCliente = teclado.next();
		
		System.out.println("Informe o valor di�rio de c�mbio do dol�r:");
		valorDiarioCambioD = teclado.nextDouble();
		
		System.out.println("Informe o valor di�rio de c�mbio do euro:");
		valorDiarioCambioE = teclado.nextDouble();
		
		System.out.println("Informe o valor di�rio de c�mbio da libra:");
		valorDiarioCambioL = teclado.nextDouble();
		
		System.out.println("Informe a taxa da casa de c�mbio:");
		taxaCasaCambio = teclado.nextDouble();
		
		if (moedaCliente.equals("Dol�r")) {
			total = (valorDiarioCambioD * valorCliente) + taxaCasaCambio;
			System.out.println("O valor total em dol�r �: " + total);
		} else if (moedaCliente.equals("Euro")) {
			total = (valorDiarioCambioE * valorCliente) + taxaCasaCambio;
			System.out.println("O valor total em euro �: " + total);
		} else if (moedaCliente.equals("Euro")) {
			total = (valorDiarioCambioL * valorCliente) + taxaCasaCambio;
			System.out.println("O valor total em libras �: " + total);
		}
	}

}

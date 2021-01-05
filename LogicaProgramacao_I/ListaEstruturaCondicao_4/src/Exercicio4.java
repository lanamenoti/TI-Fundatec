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
		
		System.out.println("Informe o valor diário de câmbio do dolár:");
		valorDiarioCambioD = teclado.nextDouble();
		
		System.out.println("Informe o valor diário de câmbio do euro:");
		valorDiarioCambioE = teclado.nextDouble();
		
		System.out.println("Informe o valor diário de câmbio da libra:");
		valorDiarioCambioL = teclado.nextDouble();
		
		System.out.println("Informe a taxa da casa de câmbio:");
		taxaCasaCambio = teclado.nextDouble();
		
		if (moedaCliente.equals("Dolár")) {
			total = (valorDiarioCambioD * valorCliente) + taxaCasaCambio;
			System.out.println("O valor total em dolár é: " + total);
		} else if (moedaCliente.equals("Euro")) {
			total = (valorDiarioCambioE * valorCliente) + taxaCasaCambio;
			System.out.println("O valor total em euro é: " + total);
		} else if (moedaCliente.equals("Euro")) {
			total = (valorDiarioCambioL * valorCliente) + taxaCasaCambio;
			System.out.println("O valor total em libras é: " + total);
		}
	}

}

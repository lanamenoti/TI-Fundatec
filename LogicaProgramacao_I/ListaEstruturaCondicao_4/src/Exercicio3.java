import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numeroConsumidor;
		double quantKWH;
		String tipoConsumidor;
		double custoTotal;
		
		System.out.println("Informe o número do consumidor:");
		numeroConsumidor = teclado.nextInt();
		
		System.out.println("Informe a quantidade de kWh consumida:");
		quantKWH = teclado.nextDouble();
		
		System.out.println("Informe o tipo do consumidor:");
		tipoConsumidor = teclado.next();
		
		
		if (tipoConsumidor.equals("Residencial")) {
			custoTotal = quantKWH * 0.30;
			System.out.println("O custo total para o consumidor " + numeroConsumidor + " é " + custoTotal);
		} else if (tipoConsumidor.equals("Comercial")) {
			custoTotal = quantKWH * 0.50;
			System.out.println("O custo total para o consumidor " + numeroConsumidor + " é " + custoTotal);
		} else if (tipoConsumidor.equals("Industrial")) {
			custoTotal = quantKWH * 0.70;
			System.out.println("O custo total para o consumidor " + numeroConsumidor + " é " + custoTotal);
		}
	}

}

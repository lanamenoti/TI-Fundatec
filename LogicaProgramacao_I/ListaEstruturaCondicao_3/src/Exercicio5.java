import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int conta;
		double saldo; 
		double debito;
		double credito;
		
		System.out.println("Informe o n�mero da sua conta:");
		conta = teclado.nextInt();
		
		System.out.println("Informe o saldo da sua conta:");
		saldo = teclado.nextDouble();
		
		System.out.println("Informe o d�bito da sua conta:");
		debito = teclado.nextDouble();
		
		System.out.println("Informe o cr�dito da sua conta:");
		credito = teclado.nextDouble();
		
		saldo = saldo - (debito + credito);
		
		if (saldo >= 0) {
			System.out.println("Saldo positivo!");
		} else {
			System.out.println("Saldo negativo");
		}
	}

}

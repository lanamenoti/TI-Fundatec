import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int quantFuncionarios;
		int prodLanchesPorHora;
		
		System.out.println("Informe a quantidade de funcion�rios que gostaria de contratar:");
		quantFuncionarios = teclado.nextInt();
		
		prodLanchesPorHora =  120 * quantFuncionarios;
		
		System.out.println("A nova produ��o com " + quantFuncionarios + " funcion�rios �: " + prodLanchesPorHora + " lanches por hora.");
	}

}

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int quantFuncionarios;
		int prodLanchesPorHora;
		
		System.out.println("Informe a quantidade de funcionários que gostaria de contratar:");
		quantFuncionarios = teclado.nextInt();
		
		prodLanchesPorHora =  120 * quantFuncionarios;
		
		System.out.println("A nova produção com " + quantFuncionarios + " funcionários é: " + prodLanchesPorHora + " lanches por hora.");
	}

}

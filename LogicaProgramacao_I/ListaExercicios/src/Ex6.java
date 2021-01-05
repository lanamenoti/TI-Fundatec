import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double salario;
		double perc;
		double novoSalario;
		
		System.out.println("Informe o seu salário:");
		salario = teclado.nextDouble();
		
		System.out.println("Informe o percentual de reajuste:");
		perc = teclado.nextDouble();
		
		novoSalario = salario + ((salario * perc)/100);
		
		System.out.println("O novo salário é: " + novoSalario);
		
		
	}

}

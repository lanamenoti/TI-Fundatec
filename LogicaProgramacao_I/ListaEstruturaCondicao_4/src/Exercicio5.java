import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int horasTrabalhadas;
		int horasExtrasTrabalhadas;
		double salario;
		
		System.out.println("Informe as horas normais trabalhadas na semana:");
		horasTrabalhadas = teclado.nextInt();
		
		System.out.println("Informe as horas extras trabalhadas na semana:");
		horasExtrasTrabalhadas = teclado.nextInt();
		
		//salario = (horasTrabalhadas * 40) + (horasExtrasTrabalhadas * (40 * 0.5));
		salario = (horasTrabalhadas * 40) + (horasExtrasTrabalhadas * (40 * 1.5));
		System.out.println("O valor do salário após uma semana é: " + salario);
		
	}

}

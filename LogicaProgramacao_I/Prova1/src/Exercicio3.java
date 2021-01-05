import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double salario;
		int horasExtras;
		String cargo;
		
		System.out.println("Informe o salário fixo recebido:");
		salario = teclado.nextDouble();
		
		System.out.println("Informe a quantidade de horas extras trabalhadas:");
		horasExtras = teclado.nextInt();
		
		System.out.println("Informe seu cargo:");
		cargo = teclado.next().toLowerCase();
		
		if (cargo.equals("desenvolvedor") || cargo.equals("testadores") || cargo.equals("testador")) {
			salario = salario + (horasExtras * 15);
		} else if (cargo.equals("analista") || cargo.equals("gestores") || cargo.equals("gestor")) {
			salario = salario + (horasExtras * 12);
		} else if (cargo.equals("suporte") || cargo.equals("atendimento")) {
			salario = salario + (horasExtras * 9);
		} else {
			salario = salario + (horasExtras * 5);
		}
		
		System.out.printf("Você receberá R$%.2f no final do mês.", salario);
	}

}

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double salarioFixo;
		double horasExtrasTrabalhadas;
		String cargo;
		
		System.out.println("Informe seu sal�rio:");
		salarioFixo = teclado.nextDouble();
		
		System.out.println("Informe a quantidade de horas extras trabalhadas:");
		horasExtrasTrabalhadas = teclado.nextDouble();
		
		System.out.println("Informe seu cargo:");
		cargo = teclado.next();
		
		if (cargo.equals("Gerente")) {
			salarioFixo = salarioFixo + (horasExtrasTrabalhadas * 15);
			System.out.println("Voc� receber� " + salarioFixo + " no final do m�s");
		} else if (cargo.equals("Desenvolvedor") || cargo.equals("Testador") ) {
			salarioFixo = salarioFixo + (horasExtrasTrabalhadas * 8);
			System.out.println("Voc� receber� " + salarioFixo + " no final do m�s");
		} else if (cargo.equals("Analista")) {
			salarioFixo = salarioFixo + (horasExtrasTrabalhadas * 12);
			System.out.println("Voc� receber� " + salarioFixo + " no final do m�s");
		} else {
			salarioFixo = salarioFixo + (horasExtrasTrabalhadas * 5);
			System.out.println("Voc� receber� " + salarioFixo + " no final do m�s");
		}
	}

}

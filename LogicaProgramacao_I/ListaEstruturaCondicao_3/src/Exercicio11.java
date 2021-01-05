import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		char categoria;
		double salario;
		
		System.out.println("Informe a categoria na qual está inserido:");
		categoria = teclado.next().charAt(0);
		
		System.out.println("Informe o valor do seu salário:");
		salario = teclado.nextDouble();
		
		if (categoria == 'A' || categoria == 'C' || categoria == 'F' || categoria == 'H') {
			salario = salario + (salario * 0.10);
			System.out.println("Você está na categoria " + categoria +" e seu salario reajustado será de: " + salario);
		} else if (categoria == 'B' || categoria == 'D' || categoria == 'I' || categoria == 'J' || categoria == 'E' || categoria == 'T') {
			salario = salario + (salario * 0.15);
			System.out.println("Você está na categoria " + categoria +" e seu salario reajustado será de: " + salario);
		} else if (categoria == 'K' || categoria == 'R') {
			salario = salario + (salario * 0.25);
			System.out.println("Você está na categoria " + categoria +" e seu salario reajustado será de: " + salario);
		} else if (categoria == 'L' || categoria == 'M' || categoria == 'N' || categoria == 'O' || categoria == 'P' || categoria == 'Q' || categoria == 'S') {
			salario = salario + (salario * 0.35);
			System.out.println("Você está na categoria " + categoria +" e seu salario reajustado será de: " + salario);
		} else if (categoria == 'U' || categoria == 'V' || categoria == 'X' || categoria == 'Y' || categoria == 'W' || categoria == 'Z' ) {
			salario = salario + (salario * 0.5);
			System.out.println("Você está na categoria " + categoria +" e seu salario reajustado será de: " + salario);
		}
	}

}

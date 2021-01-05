import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double salario;
		String cargo;
		
		System.out.println("Informe seu salário:");
		salario = teclado.nextDouble();
		
		System.out.println("Informe seu cargo:");
		cargo = teclado.next();
		
		if (cargo.equals("Desenvolvedor")) {
			salario = salario + (salario  * 0.07);
			System.out.println("Seu salário teve um aumento de 7% e ficou:" + salario);
		} else if (cargo.equals("Tester") || cargo.equals("Suporte")) {
			salario = salario + (salario  * 0.08);
			System.out.println("Seu salário teve um aumento de 8% e ficou:" + salario);
		} else {
			salario = salario + (salario  * 0.05);
			System.out.println("Seu salário teve um aumento de 5% e ficou:" + salario);
		}
	}

}

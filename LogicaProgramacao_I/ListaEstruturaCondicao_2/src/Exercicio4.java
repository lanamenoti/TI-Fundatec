import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valor1;
		int valor2;
		
		System.out.println("Informe o valor 1:");
		valor1 = teclado.nextInt();
		
		System.out.println("Informe o valor 2:");
		valor2 = teclado.nextInt();
		
		if (valor1 > valor2 ) {
			System.out.println("O menor valor digitado é: " + valor2);
		} else {
			System.out.println("O menor valor digitado é: " + valor1);
		}
	}

}

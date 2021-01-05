import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valor1;
		int valor2;
		int valor3;
		
		System.out.println("Informe o primeiro valor:");
		valor1 = teclado.nextInt();
		
		System.out.println("Informe o segundo valor:");
		valor2 = teclado.nextInt();
		
		System.out.println("Informe o terceiro valor:");
		valor3 = teclado.nextInt();
		
		if (valor1 > valor2 && valor1 > valor3) {
			if (valor2 > valor3) {
				System.out.println("A ordem crescente dos números informados é: " + valor3 + ", " + valor2 + ", " + valor1);
			} else {
				System.out.println("A ordem crescente dos números informados é: " + valor2 + ", " + valor3 + ", " + valor1);
			}
		} else if (valor2 > valor1 && valor2 > valor3) {
			if (valor1 > valor3) {
				System.out.println("A ordem crescente dos números informados é: " + valor3 + ", " + valor1 + ", " + valor2);
			} else {
				System.out.println("A ordem crescente dos números informados é: " + valor1 + ", " + valor3 + ", " + valor2);
			}
		} else {
			if (valor1 > valor2) {
				System.out.println("A ordem crescente dos números informados é: " + valor2 + ", " + valor1 + ", " + valor3);
			} else {
				System.out.println("A ordem crescente dos números informados é: " + valor1 + ", " + valor2 + ", " + valor3);
			}
		}
	}

}

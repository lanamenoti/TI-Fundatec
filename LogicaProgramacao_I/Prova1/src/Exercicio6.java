import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valor1;
		int valor2;
		int valor3;
		int media;
		
		System.out.println("Informe o valor 1:");
		valor1 = teclado.nextInt();
		
		System.out.println("Informe o valor 2:");
		valor2 = teclado.nextInt();
		
		System.out.println("Informe o valor 3:");
		valor3 = teclado.nextInt();
		
		media = (valor1 + valor2 + valor3) / 3;
		
		if (valor1 > valor2 && valor1 > valor3) {
			System.out.println(valor1 + " é o maior valor digitado e a média dos valores é: " + media);
		} else if (valor2 > valor1 && valor2 > valor3) {
			System.out.println(valor2 + " é o maior valor digitado e a média dos valores é: " + media);
		} else {
			System.out.println(valor3 + " é o maior valor digitado e a média dos valores é: " + media);
		}
	}

}

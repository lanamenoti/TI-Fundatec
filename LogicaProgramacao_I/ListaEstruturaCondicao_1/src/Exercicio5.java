import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valor;
		int antecessor;
		
		System.out.println("Informe um valor:");
		valor = teclado.nextInt();
		
		antecessor = valor - 1;
		
		System.out.println("O antecessor do valor digitado é: " + antecessor);
		
		if (antecessor % 2 == 0) {
			System.out.println(antecessor + " é par");
		} else {
			System.out.println(antecessor + " é ímpar");
		}
		
		if (antecessor > 0) {
			System.out.println(antecessor + " é positivo");
		} else {
			System.out.println(antecessor + " é negativo");
		}
	}
}

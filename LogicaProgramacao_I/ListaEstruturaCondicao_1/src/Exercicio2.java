import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um número:");
		numero = teclado.nextInt();
		
		if (numero > 100) {
			System.out.println("O número é maior que 100");
		} else {
			System.out.println("O número é menor que 100");
		}
	}

}

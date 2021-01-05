import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um número:");
		numero = teclado.nextInt();
		
		if (numero > 0) {
			System.out.println("O número digitado é positivo");
		} else {
			System.out.println("O número digitado é negativo");
		}
	}

}

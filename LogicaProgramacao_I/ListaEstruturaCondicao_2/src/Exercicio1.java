import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um n�mero:");
		numero = teclado.nextInt();
		
		if (numero > 0) {
			System.out.println("O n�mero digitado � positivo");
		} else {
			System.out.println("O n�mero digitado � negativo");
		}
	}

}

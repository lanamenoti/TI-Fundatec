import java.util.Scanner;

public class EXercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um número:");
		numero = teclado.nextInt();
		
		if (numero % 3 == 0) {
			System.out.println("O número é múltiplo de 3");
		} else {
			System.out.println("O número não é múltiplo de 3");
		}
	}

}

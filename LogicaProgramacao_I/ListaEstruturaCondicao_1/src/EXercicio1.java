import java.util.Scanner;

public class EXercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um n�mero:");
		numero = teclado.nextInt();
		
		if (numero % 3 == 0) {
			System.out.println("O n�mero � m�ltiplo de 3");
		} else {
			System.out.println("O n�mero n�o � m�ltiplo de 3");
		}
	}

}

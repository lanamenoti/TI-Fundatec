import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero = 0, somaP = 0, somaI = 0;
		
		while (numero <= 1000) {
			if (numero % 2 == 0) {
				somaP += numero;
			} else {
				somaI += numero;
			}
			
			System.out.println("Digite um n�mero:");
			numero = teclado.nextInt();
		}
		
		System.out.println("A soma dos n�meros pares digitados �:" + somaP);
		System.out.println("A soma dos n�meros �mpares digitados �:" + somaI);
		
	}

}

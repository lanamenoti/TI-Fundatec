import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero = 0, somaT = 0, somaP = 0, somaI = 0, quant = 0;
		
		while (numero >= 0) {
			if (numero % 2 == 0) {
				somaP += numero;
			} else {
				somaI += numero;
			}
			
			somaT += numero;
			quant++;
			
			System.out.println("Digite um n�mero:");
			numero = teclado.nextInt();
		}
		
		System.out.println("A soma dos n�meros pares digitados �:" + somaP);
		System.out.println("A soma dos n�meros �mpares digitados �:" + somaI);
		System.out.println("A soma total dos n�meros digitados �:" + somaT);
		System.out.println("A quantidade de n�meros digitados �: " + (quant - 1));
		
	}
}

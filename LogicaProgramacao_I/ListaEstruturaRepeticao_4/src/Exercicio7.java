import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero, somaN = 0, somaP = 0, quantN = 0, quantP = 0, mediaP = 0, mediaN = 0, quantPares = 0;
		
		System.out.println("Digite um número:");
		numero = teclado.nextInt();
		
		while (numero != 0) {
			if (numero > 0) {
				somaP += numero;
				quantP++;
				
				if (numero % 2 == 0) {
					quantPares++;
				}
			}
			
			if (numero < 0) {
				somaN += numero;
				quantN++;
			}
			
			System.out.println("Digite um número:");
			numero = teclado.nextInt();
		}
		
		mediaN = somaN / quantN;
		mediaP = somaP / quantP;
		
		System.out.println("A soma dos números positivos digitados é " + somaP);
		System.out.println("A soma dos números negativos digitados é " + somaN);
		System.out.println("A média dos números positivos digitados é " + mediaP);
		System.out.println("A média dos números negativos digitados é " + mediaN);
		System.out.println("A quantidade de números positivos pares digitados é " + quantPares);
	}

}

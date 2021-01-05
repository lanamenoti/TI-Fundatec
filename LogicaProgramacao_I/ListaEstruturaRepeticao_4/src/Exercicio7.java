import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero, somaN = 0, somaP = 0, quantN = 0, quantP = 0, mediaP = 0, mediaN = 0, quantPares = 0;
		
		System.out.println("Digite um n�mero:");
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
			
			System.out.println("Digite um n�mero:");
			numero = teclado.nextInt();
		}
		
		mediaN = somaN / quantN;
		mediaP = somaP / quantP;
		
		System.out.println("A soma dos n�meros positivos digitados � " + somaP);
		System.out.println("A soma dos n�meros negativos digitados � " + somaN);
		System.out.println("A m�dia dos n�meros positivos digitados � " + mediaP);
		System.out.println("A m�dia dos n�meros negativos digitados � " + mediaN);
		System.out.println("A quantidade de n�meros positivos pares digitados � " + quantPares);
	}

}

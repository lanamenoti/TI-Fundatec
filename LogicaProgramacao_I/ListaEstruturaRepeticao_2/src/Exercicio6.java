import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n, somaP = 0, quantN = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite um valor para N:");
			n = teclado.nextInt();
			
			if (n >= 0) {
				somaP += n;
			}
			
			if (n < 0) {
				quantN++;
			}
		}
		
		System.out.println("A soma do números positivos é " + somaP);
		System.out.println("A quantidade de números negativos é " + quantN);
	}

}

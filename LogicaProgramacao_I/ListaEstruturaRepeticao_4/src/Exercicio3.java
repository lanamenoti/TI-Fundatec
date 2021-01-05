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
			
			System.out.println("Digite um número:");
			numero = teclado.nextInt();
		}
		
		System.out.println("A soma dos números pares digitados é:" + somaP);
		System.out.println("A soma dos números ímpares digitados é:" + somaI);
		System.out.println("A soma total dos números digitados é:" + somaT);
		System.out.println("A quantidade de números digitados é: " + (quant - 1));
		
	}
}

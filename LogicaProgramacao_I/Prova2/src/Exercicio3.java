import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valor, somaPares = 0, somaImpares = 0, quantPares = 0, quantImpares = 0;
		
		for (int i = 0; i < 100; i++) {
			
			System.out.println("Digite um valor:");
			valor = teclado.nextInt();
			
			if (valor % 2 == 0) {
				somaPares += valor;
				quantPares++;
			} else {
				somaImpares += valor;
				quantImpares++;
			}
		}
		
		System.out.println("A soma dos valores pares �: " + somaPares);
		System.out.println("A quantidade dos valores pares �: " + quantPares);
		System.out.println("A soma dos valores �mpares �: " + somaImpares);
		System.out.println("A quantidade dos valores �mpares �: " + quantImpares);
	}

}

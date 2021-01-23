import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int[] numeros = new int[10];
		int quantidadeNegativos = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um número:");
			numeros[i] = teclado.nextInt();
		}
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 0) {
				quantidadeNegativos++;
			}
		}
		
		System.out.println("A quantidade de números negativos é " + quantidadeNegativos);
	}

}

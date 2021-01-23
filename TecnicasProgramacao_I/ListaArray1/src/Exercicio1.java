import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int[] arrayA = new int[20];
		int[] arrayB = new int[20];
		int[] arrayResultado = new int[20];
		
		for (int i = 0; i < arrayResultado.length; i++) {
			System.out.println("Informe o valor da posição " + i + " do primeiro array:");
			arrayA[i] = teclado.nextInt();
			
			System.out.println("Informe o valor da posição " + i + " do segundo array:");
			arrayB[i] = teclado.nextInt();
			
			arrayResultado[i] = arrayA[i] + arrayB[i];
		}
		
		for (int i = 0; i < arrayResultado.length; i++) {
			System.out.println("A soma de "+ arrayA[i] + " com " + arrayB[i] + " é " + arrayResultado[i]);
		}
	}

}

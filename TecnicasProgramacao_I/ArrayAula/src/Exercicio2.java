import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int[] arrayNumPositivos = new int[10];

		for (int i = 0; i < arrayNumPositivos.length; i++) {
			arrayNumPositivos[i] = teclado.nextInt();
		}
		
		for (int i = 0; i < arrayNumPositivos.length; i++) {
			System.out.println(arrayNumPositivos[i]);
		}
	}
}

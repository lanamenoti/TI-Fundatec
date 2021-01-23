import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String[] arrayFrutas = new String[10];
		
		for (int i = 0; i < arrayFrutas.length; i++) {
			arrayFrutas[i] = teclado.next();
		}
		
		for (int i = 0; i < arrayFrutas.length; i++) {
			System.out.println(arrayFrutas[i]);
		}
	}

}

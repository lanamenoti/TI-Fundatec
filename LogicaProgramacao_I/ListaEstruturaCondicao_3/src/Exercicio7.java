import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int N;
		
		System.out.println("Informe o número N:");
		N = teclado.nextInt();
		
		if (N <= 10) {
			System.out.println("F1");
		} else if (N > 10 && N <= 100) {
			System.out.println("F2");
		} else {
			System.out.println("F3");
		}
	}

}

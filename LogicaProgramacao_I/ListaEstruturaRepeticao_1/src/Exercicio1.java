import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite um número inteiro maior que 1:");
		n = teclado.nextInt();
		
		
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " é par");
			} else {
				System.out.println(i);
			}
		}
		
	}

}

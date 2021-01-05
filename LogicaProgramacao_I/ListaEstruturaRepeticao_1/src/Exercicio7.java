import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o valor de n:");
			n = teclado.nextInt();
			
			System.out.println("Tabuada do " + n);
			
			for (int j = 0; j <= 10; j++) {
				System.out.printf("%d x %d = %d\n", n, j, n * j);
			}
		}
	}
}

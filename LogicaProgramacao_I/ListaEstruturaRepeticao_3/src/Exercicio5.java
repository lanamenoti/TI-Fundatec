import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double raio, area;
		
		System.out.println("Informe o valor do raio:");
		raio = teclado.nextDouble();
		
		while (raio > 0) {
			area = 3.14 * (raio * raio);
			
			System.out.printf("A área do círculo com raio %.0f é %.2f\n", raio, area);
			
			System.out.println("Informe o valor do raio:");
			raio = teclado.nextDouble();
		}
	}

}

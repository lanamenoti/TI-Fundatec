import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num, fatorial = 1;
		
		System.out.println("Informe um número:");
		num = teclado.nextInt();
		
		for (int i = num; i > 0; i--) {
			fatorial = fatorial * i;
		}
		
		System.out.printf("O fatorial de %d é %d", num, fatorial);
	}

}

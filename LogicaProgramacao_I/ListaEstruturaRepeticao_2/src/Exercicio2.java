import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero, antecessor, sucessor, quad, dobro, metade;
		
		for (int i = 0; i < 15; i++) {
			System.out.println("Digite um n�mero:");
			numero = teclado.nextInt();
			
			antecessor = numero - 1;
			sucessor = numero + 1;
			quad = numero * numero;
			dobro = numero * 2;
			metade = numero / 2;
			
			System.out.printf("O antecessor de %d �: %d\n", numero, antecessor);
			System.out.printf("O sucessor de %d �: %d\n", numero, sucessor);
			System.out.printf("O quadrado de %d �: %d\n", numero, quad);
			System.out.printf("O dobro de %d �: %d\n", numero, dobro);
			System.out.printf("A metade de %d �: %d\n", numero, metade);
		}
	}

}

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n1, n2, n3, soma, mult;
		
		System.out.println("Digite o valor do primeiro número:");
		n1 = teclado.nextInt();
		
		System.out.println("Digite o valor do segundo número:");
		n2 = teclado.nextInt();
		
		System.out.println("Digite o valor do terceiro número:");
		n3 = teclado.nextInt();
		
		while (n1 == n2 || n1 == n3 || n2 == n3) {
			System.out.println("Os valores não podem ser iguais!");
			
			System.out.println("Digite o valor do primeiro número novamente:");
			n1 = teclado.nextInt();
			
			System.out.println("Digite o valor do segundo número novamente:");
			n2 = teclado.nextInt();
			
			System.out.println("Digite o valor do terceiro número novamente:");
			n3 = teclado.nextInt();
		}
		
		soma = n1 + n2 + n3;
		mult = n1 * n2 * n3;
		
		System.out.println("O resultado da soma dos números digitados é " + soma);
		System.out.println("O resultado da multiplicação dos números digitados é " + mult);
		
	}

}

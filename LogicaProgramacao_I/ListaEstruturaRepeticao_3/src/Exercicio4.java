import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n1, n2, n3, soma, mult;
		
		System.out.println("Digite o valor do primeiro n�mero:");
		n1 = teclado.nextInt();
		
		System.out.println("Digite o valor do segundo n�mero:");
		n2 = teclado.nextInt();
		
		System.out.println("Digite o valor do terceiro n�mero:");
		n3 = teclado.nextInt();
		
		while (n1 == n2 || n1 == n3 || n2 == n3) {
			System.out.println("Os valores n�o podem ser iguais!");
			
			System.out.println("Digite o valor do primeiro n�mero novamente:");
			n1 = teclado.nextInt();
			
			System.out.println("Digite o valor do segundo n�mero novamente:");
			n2 = teclado.nextInt();
			
			System.out.println("Digite o valor do terceiro n�mero novamente:");
			n3 = teclado.nextInt();
		}
		
		soma = n1 + n2 + n3;
		mult = n1 * n2 * n3;
		
		System.out.println("O resultado da soma dos n�meros digitados � " + soma);
		System.out.println("O resultado da multiplica��o dos n�meros digitados � " + mult);
		
	}

}

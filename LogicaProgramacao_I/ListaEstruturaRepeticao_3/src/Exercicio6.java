import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num, somaPares = 0, multImpares = 1;
		
		System.out.println("Digite um n�mero:");
		num = teclado.nextInt();
		
		while (num > 0) {
			if (num % 2 == 0) {
				somaPares += num;
			} else {
				multImpares *= num;
			}
			
			System.out.println("Digite um n�mero:");
			num = teclado.nextInt();
		}
		
		System.out.println("A soma dos n�meros pares digitados � " + somaPares);
		System.out.println("A multiplica��o dos n�meros �mpares digitados � " + multImpares);
	}

}

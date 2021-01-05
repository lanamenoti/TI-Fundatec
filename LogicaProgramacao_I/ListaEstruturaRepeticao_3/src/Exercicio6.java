import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num, somaPares = 0, multImpares = 1;
		
		System.out.println("Digite um número:");
		num = teclado.nextInt();
		
		while (num > 0) {
			if (num % 2 == 0) {
				somaPares += num;
			} else {
				multImpares *= num;
			}
			
			System.out.println("Digite um número:");
			num = teclado.nextInt();
		}
		
		System.out.println("A soma dos números pares digitados é " + somaPares);
		System.out.println("A multiplicação dos números ímpares digitados é " + multImpares);
	}

}

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int inicio;
		int fim;
		int intervalo;
		
		System.out.println("Informe o primeiro n�mero (in�cio do intervalo):");
		inicio = teclado.nextInt();
		
		System.out.println("Informe o segundo n�mero (fim do intervalo):");
		fim = teclado.nextInt();
		
		System.out.println("Informe o terceiro n�mero:");
		intervalo = teclado.nextInt();
		
		if (intervalo > inicio && intervalo < fim) {
			System.out.printf("%d encontra-se no intervalo entre %d e %d", intervalo, inicio, fim);
		} else {
			System.out.printf("%d não encontra-se no intervalo entre %d e %d", intervalo, inicio, fim);
		}
	}

}

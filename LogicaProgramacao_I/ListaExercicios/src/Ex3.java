import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valor;
		int antecessor;
		int sucessor;
		int quadrado;
		
		System.out.println("Informe um valor:");
		valor = teclado.nextInt();
		
		antecessor = valor - 1;
		sucessor = valor + 1;
		quadrado = valor * valor;
		
		System.out.println("O antecessor de " + valor + " é " + antecessor);
		System.out.println("O sucessor de " + valor + " é " + sucessor);
		System.out.println("O quadrado de " + valor + " é " + quadrado);
	}

}

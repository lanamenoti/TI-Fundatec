import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valor;
		int antecessor;
		
		System.out.println("Informe um valor:");
		valor = teclado.nextInt();
		
		antecessor = valor - 1;
		
		System.out.println("O antecessor de " + valor +  " é " + antecessor);
		
	}

}

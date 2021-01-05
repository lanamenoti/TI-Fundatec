import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		char letra;
		
		
		System.out.println("Informe uma letra:");
		letra = teclado.next().charAt(0);
		
		switch (letra) {
		case 'a':
			System.out.println("A letra digitada é uma vogal");
			break;
		case 'e':
			System.out.println("A letra digitada é uma vogal");
			break;
		case 'i':
			System.out.println("A letra digitada é uma vogal");
			break;
		case 'o':
			System.out.println("A letra digitada é uma vogal");
			break;
		case 'u':
			System.out.println("A letra digitada é uma vogal");
			break;
		default:
			System.out.println("A letra digitada é uma consoante");
			break;
		}
	}

}

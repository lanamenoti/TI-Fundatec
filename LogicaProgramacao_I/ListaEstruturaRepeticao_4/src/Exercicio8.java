import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero, cont = 0;
		
		System.out.println("Digite um n�mero:");
		numero = teclado.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				cont++;
			}
		}
		
		if (cont == 2) {
			System.out.println( numero + " � primo");
		} else {
			System.out.println(numero + " n�o � primo");
		}
	}

}

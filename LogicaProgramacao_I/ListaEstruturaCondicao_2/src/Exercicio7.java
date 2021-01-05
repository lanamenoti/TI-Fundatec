import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Informe um valor: ");
		valor = teclado.nextInt();
		
		if (valor > 10) {
			System.out.println("O valor digitado é maior que 10.");
		} else if (valor < 10){
			System.out.println("O valor digitado é menor que 10.");
		} else {
			System.out.println("O número digitado é igual a 10.");
		}
		
	}

}

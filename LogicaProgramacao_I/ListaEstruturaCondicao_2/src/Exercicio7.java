import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Informe um valor: ");
		valor = teclado.nextInt();
		
		if (valor > 10) {
			System.out.println("O valor digitado � maior que 10.");
		} else if (valor < 10){
			System.out.println("O valor digitado � menor que 10.");
		} else {
			System.out.println("O n�mero digitado � igual a 10.");
		}
		
	}

}

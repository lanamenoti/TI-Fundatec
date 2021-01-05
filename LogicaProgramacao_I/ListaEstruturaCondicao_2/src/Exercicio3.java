import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Informe sua idade:");
		idade = teclado.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("Você se encontra na categoria 'infantil'");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("Você se encontra na categoria 'juvenil'");
		} else if (idade >= 18 && idade <= 59) {
			System.out.println("Você se encontra na categoria 'adulto'");
		} else if (idade >= 60) {
			System.out.println("Você se encontra na categoria 'terceira idade'");
		}
	}

}

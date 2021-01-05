import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int anoAtual;
		int anoNasc;
		int idade;
		
		System.out.println("Informe o ano atual:");
		anoAtual = teclado.nextInt();
		
		System.out.println("Informe o ano do seu nascimento:");
		anoNasc = teclado.nextInt();
		
		idade = anoAtual - anoNasc;
		
		if (idade < 18) {
			System.out.println("Você não pode votar esse ano.");
		} else {
			System.out.println("Você pode votar esse ano.");
		}
		
		
	}

}

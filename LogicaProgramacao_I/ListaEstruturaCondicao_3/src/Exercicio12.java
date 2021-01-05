import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numeroDiarias;
		double total;
		String nome;
		
		System.out.println("Informe o número de diárias: ");
		numeroDiarias = teclado.nextInt();
		
		System.out.println("Informe o nome do cliente:");
		nome = teclado.next();
		
		if (numeroDiarias > 15) {
			total = numeroDiarias * 60 + (numeroDiarias * 5.5);
			System.out.println("O total da conta do cliente" + nome + " é: " + total );
		} else if (numeroDiarias == 15) {
			total = numeroDiarias * 60 + (numeroDiarias * 6);
			System.out.println("O total da conta do cliente" + nome + " é: " + total );
		} else {
			total = numeroDiarias * 60 + (numeroDiarias * 8);
			System.out.println("O total da conta do cliente" + nome + " é: " + total );
		}
	}

}

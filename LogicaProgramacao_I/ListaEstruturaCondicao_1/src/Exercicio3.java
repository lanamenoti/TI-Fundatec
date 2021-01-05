import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Informe sua idade:");
		idade = teclado.nextInt();
		
		if (idade >= 18) {
			System.out.println("Você pode tirar carteira de motorista");
		} else {
			System.out.println("Você ainda não pode tirar carteira de motorista");
		}
	}

}

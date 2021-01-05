import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Informe uma idade:");
		idade = teclado.nextInt();
		
		while (idade >= 0) {
			if (idade < 16) {
				System.out.println("Não votante!");
			} else if (idade >= 18 && idade <= 65) {
				System.out.println("Eleitor obrigatório!");
			} else if (idade >= 16 && idade < 18 || idade > 65) {
				System.out.println("Eleitor facultativo!");
			}
			
			
			System.out.println("Informe uma idade:");
			idade = teclado.nextInt();
		}
	}

}

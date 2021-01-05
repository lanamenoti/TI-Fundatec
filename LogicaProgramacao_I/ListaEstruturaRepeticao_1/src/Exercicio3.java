import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int idade, maior18 = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite uma idade:");
			idade = teclado.nextInt();
			
			if (idade > 18) {
				maior18++;
			}
		}
		System.out.println("A quantidade de pessoas com idade maior que 18 é: " + maior18);
	}

}

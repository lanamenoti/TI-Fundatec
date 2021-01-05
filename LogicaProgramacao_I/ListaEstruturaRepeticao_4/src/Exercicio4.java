import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int idade = 0, quant21 = 0, quant50 = 0;
		
		while (idade >= 0) {
			if (idade < 21 && idade > 0) {
				quant21++;
			}
			
			if (idade > 50) {
				quant50++;
			}
			
			System.out.println("Digite uma idade:");
			idade = teclado.nextInt();
		}
		
		System.out.println("A quantidade de pessoas com menos de 21 anos é " + quant21);
		System.out.println("A quantidade de pessoas com mais de 50 anos é " + quant50);
	}

}

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double media = 0, maiorM = 0, menorM = 1000, somaM = 0, mediaArit, cont = 0;
		
		while (media >= 0) {
			System.out.println("Digite a m�dia do aluno:");
			media = teclado.nextDouble();
			
			if (media >= 0) {
				if (media > maiorM) {
					maiorM = media;
				}
				
				if (media < menorM) {
					menorM = media;
				}
				
				somaM += media;
				cont++;
			}
		}
		
		mediaArit = somaM / cont;
		
		System.out.println("A maior m�dia digitada �: " + maiorM);
		System.out.println("A menor m�dia digitada �: " + menorM);
		System.out.println("A m�dia aritm�tica das m�dias digitadas �: " + mediaArit);
	}

}

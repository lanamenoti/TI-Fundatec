import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double mediaF;
		int faltas;
		
		for (int i = 0; i < 50; i++) {
			System.out.printf("Digite a média final do aluno %d:", i + 1);
			mediaF = teclado.nextDouble();
			
			System.out.println("Digite o número de faltas do aluno:");
			faltas = teclado.nextInt();
			
			if (mediaF >= 7 && faltas <= 15) {
				System.out.println("O aluno foi aprovado por média e por frequência");
			} else if (mediaF >= 7 && faltas > 15) {
				System.out.println("O aluno foi aprovado por média e reprovado frequência");
			} else if (mediaF < 7 && faltas <= 15) {
				System.out.println("O aluno foi aprovado por frequência e reprovado média");
			} else {
				System.out.println("O aluno foi reprovado por média e por frequência");
			}
		}
		
	}

}

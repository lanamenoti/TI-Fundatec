import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double mediaF;
		int faltas;
		
		for (int i = 0; i < 50; i++) {
			System.out.printf("Digite a m�dia final do aluno %d:", i + 1);
			mediaF = teclado.nextDouble();
			
			System.out.println("Digite o n�mero de faltas do aluno:");
			faltas = teclado.nextInt();
			
			if (mediaF >= 7 && faltas <= 15) {
				System.out.println("O aluno foi aprovado por m�dia e por frequ�ncia");
			} else if (mediaF >= 7 && faltas > 15) {
				System.out.println("O aluno foi aprovado por m�dia e reprovado frequ�ncia");
			} else if (mediaF < 7 && faltas <= 15) {
				System.out.println("O aluno foi aprovado por frequ�ncia e reprovado m�dia");
			} else {
				System.out.println("O aluno foi reprovado por m�dia e por frequ�ncia");
			}
		}
		
	}

}

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		char entrarDados = 'S';
		double velocidade, velocidadeMax;
		
		while (entrarDados == 'S') {
			System.out.println("Informe a velocidade do carro:");
			velocidade = teclado.nextDouble();
			
			System.out.println("Informe a velocidade máxima da via:");
			velocidadeMax = teclado.nextDouble();
			
			double limite = velocidade- velocidadeMax;
			
			if (limite > 0 && limite <= 10) {
				System.out.println("A sua multa é de 50 reais");
			} else if (limite >= 11 && limite <= 30 ) {
				System.out.println("A sua multa é de 100 reais");
			} else if (limite >= 31){
				System.out.println("A sua multa é de 300 reais");
			} else {
				System.out.println("Você não levará multa");
			}
			
			
			System.out.println("Deseja entrar com mais dados (S ou N):");
			entrarDados = teclado.next().charAt(0);
		}
	}

}

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num, maior = 0, menor = 10000000;
		
		for (int i = 0; i < 15; i++) {
			System.out.println("Informe um n�mero: ");
			num = teclado.nextInt();
			
			if (num > maior) {
				maior = num;
			} 
			
			if (num < menor) {
				menor = num;
			}
		}
		
		System.out.println("Maior n�mero digitado: " + maior);
		System.out.println("Menor n�mero digitado: " + menor);
	}

}

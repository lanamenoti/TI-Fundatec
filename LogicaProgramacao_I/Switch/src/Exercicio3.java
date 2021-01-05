import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int horario;
		
		System.out.println("Informe um horário:");
		horario = teclado.nextInt();
		
		if ( horario <= 6 || horario < 12) {
			System.out.println("Bom dia!");
		} else if (horario <= 12 || horario < 18 ) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");
		}
		
		
	}

}

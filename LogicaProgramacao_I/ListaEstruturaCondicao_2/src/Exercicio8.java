import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nome1;
		String nome2;
		int idade1;
		int idade2;
		int difIdades;
		
		System.out.println("Informe o nome da primeira pessoa:");
		nome1 = teclado.next();
		
		System.out.println("Informe o nome da segunda pessoa:");
		nome2 = teclado.next();
		
		System.out.println("Informe a idade da primeira pessoa:");
		idade1 = teclado.nextInt();
		
		System.out.println("Informe a idade da segunda pessoa:");
		idade2 = teclado.nextInt();
		
		if (idade1 > idade2) {
			difIdades = idade1 - idade2;
			System.out.println(nome1 + " � mais velho(a) e a diferen�a entre as idades � " + difIdades + " anos");
		} else {
			difIdades = idade2 - idade1;
			System.out.println(nome2 + " � mais velho(a) e a diferen�a entre as idades � " + difIdades + " anos");
		}
		
		
		
		
	}

}

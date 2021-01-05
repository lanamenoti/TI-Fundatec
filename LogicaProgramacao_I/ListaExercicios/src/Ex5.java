import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double nota3;
		double media;
		
		System.out.println("Informe a primeira nota:");
		nota1 = teclado.nextDouble();
		
		System.out.println("Informe a segunda nota:");
		nota2 = teclado.nextDouble();
		
		System.out.println("Informe a terceira nota:");
		nota3 = teclado.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("A média final é: " + media);
		
	}

}

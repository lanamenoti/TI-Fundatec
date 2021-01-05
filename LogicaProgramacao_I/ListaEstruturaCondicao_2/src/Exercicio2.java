import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		double nota1;
		double nota2;
		double nota3;
		double media;
		
		System.out.println("Informe seu nome:");
		nome = teclado.next();
		
		System.out.println("Informe sua primeira nota:");
		nota1 = teclado.nextDouble();
		
		System.out.println("Informe sua segunda nota:");
		nota2 = teclado.nextDouble();
		
		System.out.println("Informe sua terceira nota:");
		nota3 = teclado.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		if (media < 5) {
			System.out.println("Você está reprovado(a), " +  nome);	
		} else if (media > 5.1 && media < 6.9) {
			System.out.println("Você está em recuperação, " +  nome);
		} else {
			System.out.println("Você está aprovado(a), " + nome);
		}
	}

}

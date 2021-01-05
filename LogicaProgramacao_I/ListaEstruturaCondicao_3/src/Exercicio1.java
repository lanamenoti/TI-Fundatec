import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double quantMacas;
		double totalCompras;
		
		System.out.println("Escreva a quantidade de maças contadas: ");
		quantMacas = teclado.nextDouble();
		
		if (quantMacas < 12) {
			totalCompras = 1.30 * quantMacas;
			System.out.println("O custo total da compra é: " +  totalCompras);
		} else {
			totalCompras = 1 * quantMacas;
			System.out.println("O custo total da compra é: " +  totalCompras);
		}
	}

}

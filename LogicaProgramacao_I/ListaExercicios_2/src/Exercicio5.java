import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double custoFinal;
		double custoFabrica;
		double porcRevendedor;
		double porcImpostos;
		
		System.out.println("Informe o custo de f�brica do ve�culo:");
		custoFabrica = teclado.nextDouble();
		
		System.out.println("Informe a porcentagem de lucro do revendedor:");
		porcRevendedor = teclado.nextDouble();
		
		System.out.println("Informe a porcentagem de impostos sobre o ve�culo:");
		porcImpostos = teclado.nextDouble();
		
		custoFinal = custoFabrica + ((custoFabrica * porcRevendedor) / 100) + ((custoFabrica * porcImpostos) / 100);
		
		System.out.println("O custo final do ve�culo �: " +  custoFinal);
	}

}

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double custoFinal;
		double custoFabrica;
		double percVendedor;
		double percImpostos;
		
		System.out.println("Informe o custo de fábrica da moto:");
		custoFabrica = teclado.nextDouble();
		
		percVendedor = custoFabrica * 0.30;
		percImpostos = custoFabrica * 0.47;
		
		custoFinal = custoFabrica + percVendedor + percImpostos;
		
		System.out.println("O custo final da moto é: " + custoFinal);
		
	}

}

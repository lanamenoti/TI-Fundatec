import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double velocidadeCarro;
		double velocidadeRua;
		double limiteVelocidade;
		
		System.out.println("Informe a velocidade do carro:");
		velocidadeCarro = teclado.nextDouble();
		
		System.out.println("Informe a velocidade máxima da rua:");
		velocidadeRua = teclado.nextDouble();
		
		limiteVelocidade = velocidadeCarro - velocidadeRua;
		
		if (limiteVelocidade <= 10) {
			System.out.println("A multa a ser aplicada é de 50 reais");
		} else if (11 >= limiteVelocidade || limiteVelocidade <= 50) {
			System.out.println("A multa a ser aplicada é de 100 reais");
		} else { 
			System.out.println("A multa a ser aplicada é de 300 reais");
		}
		
		
	}

}

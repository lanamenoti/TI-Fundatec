import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int kmViagem;
		int litrosGasolina;
		
		System.out.println("Informe a quantidade de km a serem percorridos:");
		kmViagem = teclado.nextInt();
		
		litrosGasolina = (kmViagem * 2) / 24;
		
		System.out.println("Você vai utilizar " + litrosGasolina + " litros de gasolina para percorrer " + kmViagem + " km");
	}

}

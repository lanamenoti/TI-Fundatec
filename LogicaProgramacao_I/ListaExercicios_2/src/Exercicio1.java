import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int horasTrabalhadas;
		int paesProduzidos;
		
		System.out.println("Informe a quantidade de horas trabalhadas:");
		horasTrabalhadas = teclado.nextInt();
		
		paesProduzidos = (horasTrabalhadas * 100) / 4;
		
		System.out.println("A quantidade de pães produzidos em " + horasTrabalhadas + " horas é: " + paesProduzidos);
	}

}

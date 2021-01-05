import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double idadeAnos;
		double idadeDiasAnos;
		double idadeMeses;
		double idadeDiasMeses;
		double idadeDias;
		
		System.out.println("Informe sua idade em anos:");
		idadeAnos = teclado.nextDouble();
		
		System.out.println("Informe sua idade em meses:");
		idadeMeses = teclado.nextDouble();
		
		System.out.println("Informe sua idade em dias:");
		idadeDias = teclado.nextDouble();
		
		idadeDiasAnos = idadeAnos * 365;
		idadeDiasMeses = idadeMeses * 30;
		
		idadeDias = idadeDias + idadeDiasAnos + idadeDiasMeses;
		
		System.out.println("A sua idade em dias é: " + idadeDias);
		
	}

}

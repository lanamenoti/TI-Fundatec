import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		char sexo;
		int tempoCasa;
		
		System.out.println("Informe o sexo do funcionário:");
		sexo = teclado.next().charAt(0);
		
		System.out.println("Informe o tempo de casa do funcionário:");
		tempoCasa = teclado.nextInt();
		
		if (sexo == 'F' && tempoCasa >= 10) {
			System.out.println("Esse funcionário terá direito a 25% do seu salário de bônus de natal");
		} else if (sexo == 'M' && tempoCasa >= 15) {
			System.out.println("Esse funcionário terá direito a 20% do seu salário de bônus de natal");
		} else {
			System.out.println("Esse funcionário terá direito a 5000 de bônus de natal no seu salário");
		}
	}

}

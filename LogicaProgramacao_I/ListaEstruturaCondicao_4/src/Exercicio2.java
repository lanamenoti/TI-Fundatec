import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		char sexo;
		int tempoCasa;
		
		System.out.println("Informe o sexo do funcion�rio:");
		sexo = teclado.next().charAt(0);
		
		System.out.println("Informe o tempo de casa do funcion�rio:");
		tempoCasa = teclado.nextInt();
		
		if (sexo == 'F' && tempoCasa >= 10) {
			System.out.println("Esse funcion�rio ter� direito a 25% do seu sal�rio de b�nus de natal");
		} else if (sexo == 'M' && tempoCasa >= 15) {
			System.out.println("Esse funcion�rio ter� direito a 20% do seu sal�rio de b�nus de natal");
		} else {
			System.out.println("Esse funcion�rio ter� direito a 5000 de b�nus de natal no seu sal�rio");
		}
	}

}

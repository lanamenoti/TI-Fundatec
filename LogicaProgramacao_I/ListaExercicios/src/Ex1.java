import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double base;
		double altura;
		double area;
		
		System.out.println("Informe a base do ret�ngulo:");
		base = teclado.nextDouble();
		
		System.out.println("Informe a altura do ret�ngulo:");
		altura = teclado.nextDouble();
		
		area = base * altura; 
		
		System.out.println("A �rea do ret�ngulo �:" + area);
	}

}

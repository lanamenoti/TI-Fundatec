import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int codigo;
		int quantComprada;
		double precoTotal;
		String comprarMais;
		
		System.out.println("Informe o código do produto que desja comprar:");
		codigo = teclado.nextInt();
		
		System.out.println("Informe a quantidade de produto comprada:");
		quantComprada = teclado.nextInt();
		
		if (codigo == 1001) {
			precoTotal = quantComprada * 5.32;
			
			System.out.println("Deseja comprar mais alguma coisa?");
			comprarMais = teclado.next();
		} else if (codigo == 1002) {
			precoTotal = quantComprada * 63.89;
			
			System.out.println("Deseja comprar mais alguma coisa?");
			comprarMais = teclado.next();
		} else if (codigo == 1003) {
			precoTotal = quantComprada * 9.87;
			
			System.out.println("Deseja comprar mais alguma coisa?");
			comprarMais = teclado.next();
		} else {
			precoTotal = quantComprada * 53;
			
			System.out.println("Deseja comprar mais alguma coisa?");
			comprarMais = teclado.next();
		}
		
		if (comprarMais.equals("Sim")) {
			System.out.println("Informe o código do produto que desja comprar:");
			codigo = teclado.nextInt();
			
			System.out.println("Informe a quantidade de produto comprada:");
			quantComprada = teclado.nextInt();
			
			if (codigo == 1001) {
				precoTotal = precoTotal + (quantComprada * 5.32);
				
				System.out.println("Você comprou " + precoTotal + " reais");
			} else if (codigo == 1002) {
				precoTotal =precoTotal + (quantComprada * 63.89);
				
				System.out.println("Você comprou " + precoTotal + " reais");
			} else if (codigo == 1003) {
				precoTotal = precoTotal + (quantComprada * 9.87);
				
				System.out.println("Você comprou " + precoTotal + " reais");
			} else {
				precoTotal = precoTotal + (quantComprada * 53);
				
				System.out.println("Você comprou " + precoTotal + " reais");
			}
		} else {
			System.out.println("Você comprou " + precoTotal + " reais");
		}
		
	}

}

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double salarioAtual;
		double vendaMes;
		
		System.out.println("Informe o seu sal�rio atual:");
		salarioAtual = teclado.nextDouble();
		
		System.out.println("Informe o valor total de suas vendas no m�s:");
		vendaMes= teclado.nextDouble();
		
		//Forma errada: Precisa de um teto
		
		//if (vendaMes > 1000) {
			//salarioAtual = salarioAtual + 200;
			//System.out.println("Voc� recebeu uma bonifica��o de 200 reais e seu sal�rio ficou: " + salarioAtual);
		//} else if (vendaMes > 5000){
			//salarioAtual = salarioAtual + 700;
			//System.out.println("Voc� recebeu uma bonifica��o de 700 reais e seu sal�rio ficou: " + salarioAtual);
		//} else if (vendaMes > 10000) {
			//salarioAtual = salarioAtual + 1200;
			//System.out.println("Voc� recebeu uma bonifica��o de 1200 reais e seu sal�rio ficou: " + salarioAtual);
		//}
		
		if (vendaMes > 10000) {
			salarioAtual = salarioAtual + 1200;
			System.out.println("Voc� recebeu uma bonifica��o de 200 reais e seu sal�rio ficou: " + salarioAtual);
		} else if (vendaMes > 5000){
			salarioAtual = salarioAtual + 700;
			System.out.println("Voc� recebeu uma bonifica��o de 700 reais e seu sal�rio ficou: " + salarioAtual);
		} else if (vendaMes > 1000) {
			salarioAtual = salarioAtual + 200;
			System.out.println("Voc� recebeu uma bonifica��o de 1200 reais e seu sal�rio ficou: " + salarioAtual);
		}
		
	}

}

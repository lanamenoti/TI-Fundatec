
public class Exercicio2 {
	public static void main(String[] args) {
		double alturaJoao = 1.37 ;
		double alturaPedro = 1.20;
		int meses = 0;
		
		while (alturaPedro <= alturaJoao) {
			meses++;
			alturaPedro += .03;
			alturaJoao += .02;
		}
		 System.out.printf("Pedro est� com %.2f de altura e Jo�o est� com %.2f de altura. Pedro passou Jo�o em altura em %d meses.", alturaPedro, alturaJoao, meses);
	}

}


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
		 System.out.printf("Pedro está com %.2f de altura e João está com %.2f de altura. Pedro passou João em altura em %d meses.", alturaPedro, alturaJoao, meses);
	}

}

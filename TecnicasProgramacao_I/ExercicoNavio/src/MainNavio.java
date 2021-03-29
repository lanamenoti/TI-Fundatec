
public class MainNavio {
	public static void main(String[] args) {
		
		Container container1 = new Container(25);
		Container container2 = new Container(50);
		Container container3 = new Container(50);
		Container container4 = new Container(80);
		
		Navio navio = new Navio(new Tipo("Navio de carga"), new Modelo("Vou saber"), new Navegacao("S�o Paulo", "Fernando de Noronha"), "Navio Tal", 2018, 180, 175, 32.3, 295, 200, 0);
		
		System.out.println("Informa��es do navio antes da manipula��o:");
		navio.imprimirDadosNavio();
		
		navio.deveAdicionarContainer(container1);
		navio.deveAdicionarContainer(container2);
		navio.deveAdicionarContainer(container3);
		
		// Tentativa de adi��o de container que exceder� a capacidade m�xima
		navio.deveAdicionarContainer(container4);
		//navio.deveAdicionarContainer(container4);
		
		System.out.println("Informa��es do navio depois da adi��o de carga:");
		navio.imprimirDadosNavio();
		
		navio.deveRemoverContainer(container2);
		
		System.out.println("Informa��es do navio depois da remo��o de carga:");
		navio.imprimirDadosNavio();
		
		navio.acelerar();
		navio.acelerar();
		navio.acelerar();
		navio.acelerar();
		navio.acelerar();
		
		//Tentando acelerar a mais que a velocidade m�xima permitida 
		navio.acelerar();
		
		System.out.println("Informa��es do navio depois da acelera��o:");
		navio.imprimirDadosNavio();
		
		
		navio.desacelerar();
		navio.desacelerar();
		navio.desacelerar();
		navio.desacelerar();
		navio.desacelerar();
		
		System.out.println("Informa��es do navio depois da desacelera��o:");
		navio.imprimirDadosNavio();
		
	}
}

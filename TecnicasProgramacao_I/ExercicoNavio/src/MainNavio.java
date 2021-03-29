
public class MainNavio {
	public static void main(String[] args) {
		
		Container container1 = new Container(25);
		Container container2 = new Container(50);
		Container container3 = new Container(50);
		Container container4 = new Container(80);
		
		Navio navio = new Navio(new Tipo("Navio de carga"), new Modelo("Vou saber"), new Navegacao("São Paulo", "Fernando de Noronha"), "Navio Tal", 2018, 180, 175, 32.3, 295, 200, 0);
		
		System.out.println("Informações do navio antes da manipulação:");
		navio.imprimirDadosNavio();
		
		navio.deveAdicionarContainer(container1);
		navio.deveAdicionarContainer(container2);
		navio.deveAdicionarContainer(container3);
		
		// Tentativa de adição de container que excederá a capacidade máxima
		navio.deveAdicionarContainer(container4);
		//navio.deveAdicionarContainer(container4);
		
		System.out.println("Informações do navio depois da adição de carga:");
		navio.imprimirDadosNavio();
		
		navio.deveRemoverContainer(container2);
		
		System.out.println("Informações do navio depois da remoção de carga:");
		navio.imprimirDadosNavio();
		
		navio.acelerar();
		navio.acelerar();
		navio.acelerar();
		navio.acelerar();
		navio.acelerar();
		
		//Tentando acelerar a mais que a velocidade máxima permitida 
		navio.acelerar();
		
		System.out.println("Informações do navio depois da aceleração:");
		navio.imprimirDadosNavio();
		
		
		navio.desacelerar();
		navio.desacelerar();
		navio.desacelerar();
		navio.desacelerar();
		navio.desacelerar();
		
		System.out.println("Informações do navio depois da desaceleração:");
		navio.imprimirDadosNavio();
		
	}
}

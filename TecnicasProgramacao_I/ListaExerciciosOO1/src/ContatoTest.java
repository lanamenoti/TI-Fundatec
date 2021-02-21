
public class ContatoTest {
	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setEmail("fulanodetal@hotmail.com");
		contato.setCelular("99999-9999");
		contato.setTelefone("3333-3333");
		contato.setVoip("00000000");
		
		System.out.println("Email: " + contato.getEmail());
		System.out.println("Celular: " + contato.getCelular());
		System.out.println("Telefone: " + contato.getTelefone());
		System.out.println("Voip: " + contato.getVoip());
	}
}


public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa pai = new Pessoa();
		pai.setNome("Jos�");
		pai.setCpf("000000000-00");
		
		Pessoa mae = new Pessoa();
		mae.setNome("Maria");
		mae.setCpf("000000000-00");
		
		Pessoa filha = new Pessoa();
		filha.setNome("Amanda");
		filha.setCpf("000000000-00");
		filha.setM�e(mae);
		filha.setPai(pai);
		
		
		System.out.println("Nome Pessoa: " + filha.getNome());
		System.out.println("Cpf Pessoa: " + filha.getCpf());
		System.out.println("Nome Pai: " + filha.getPai().getNome());
		System.out.println("Cpf Pai: " + filha.getPai().getCpf());
		System.out.println("Nome M�e: " + filha.getM�e().getNome());
		System.out.println("Cpf M�e: " + filha.getM�e().getCpf());
		
	}

}


public class ClienteTeste {
	public static void main(String[] args) {
		Estado rs = new Estado();
		rs.setNome("Rio Grande do Sul");
		rs.setSigla("RS");
		
		Cidade poa = new Cidade();
		poa.setNome("Porto Alegre");
		poa.setEstado(rs);
		
		Endereco endereco = new Endereco();
		endereco.setRua("Barão de Itaqui");
		endereco.setNumero(165);
		endereco.setBairro("Passo da areia");
		endereco.setComplemento(302);
		endereco.setCep("000.000-00");
		endereco.setCidade(poa);
		
		Contato contato = new Contato();
		contato.setEmail("fulanodetal@hotmail.com");
		contato.setCelular("99999-9999");
		contato.setTelefone("3333-3333");
		contato.setVoip("00000000");
		
		Cliente cliente = new Cliente();
		cliente.setNome("Fulano");
		cliente.setSobreNome("de Tal");
		cliente.setNomeFantasia("Tal tal tal");
		cliente.setRazaoSocial("tal tal");
		cliente.setCpf("000.000.000-00");
		cliente.setRg("0000000000");
		cliente.setCnpj("00000000000000");
		cliente.setInscricaoEstadual("296258");
		cliente.setEndereco(endereco);
		cliente.setContato(contato);
		
		
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Sobrenome: " + cliente.getSobreNome());
		System.out.println("Nome Fantasia: " + cliente.getNomeFantasia());
		System.out.println("Razão Social: " + cliente.getRazaoSocial());
		System.out.println("Cpf: " + cliente.getCpf());
		System.out.println("Rg: " + cliente.getRg());
		System.out.println("Cnpj: " + cliente.getCnpj());
		System.out.println("Inscrição estadual: " + cliente.getInscricaoEstadual());
		

		System.out.println("Rua:" + cliente.getEndereco().getRua());
		System.out.println("Número:" + cliente.getEndereco().getNumero());
		System.out.println("Complemento:" + cliente.getEndereco().getComplemento());
		System.out.println("Bairro:" + cliente.getEndereco().getBairro());
		System.out.println("Cep:" + cliente.getEndereco().getCep());
		System.out.println("Nome Cidade:" + cliente.getEndereco().getCidade().getNome());
		System.out.println("Nome Estado:" + cliente.getEndereco().getCidade().getEstado().getNome());
		System.out.println("Sigla Estado:" + cliente.getEndereco().getCidade().getEstado().getSigla());
		System.out.println("Email: " + cliente.getContato().getEmail());
		System.out.println("Celular: " + cliente.getContato().getCelular());
		System.out.println("Telefone: " + cliente.getContato().getTelefone());
		System.out.println("Voip: " + cliente.getContato().getVoip());
	}
}

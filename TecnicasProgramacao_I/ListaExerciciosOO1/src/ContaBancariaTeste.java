
public class ContaBancariaTeste {
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
		
		ContaBancaria conta = new ContaBancaria();
		conta.setNumero("00000000");
		conta.setAgencia("0000");
		conta.setCliente(cliente);
		
		System.out.println("Numero Conta: " + conta.getNumero());
		System.out.println("Agencia: " + conta.getAgencia());
		
		System.out.println("Nome: " + conta.getCliente().getNome());
		System.out.println("Sobrenome: " + conta.getCliente().getSobreNome());
		System.out.println("Nome Fantasia: " + conta.getCliente().getNomeFantasia());
		System.out.println("Razão Social: " + conta.getCliente().getRazaoSocial());
		System.out.println("Cpf: " + conta.getCliente().getCpf());
		System.out.println("Rg: " + conta.getCliente().getRg());
		System.out.println("Cnpj: " + conta.getCliente().getCnpj());
		System.out.println("Inscrição estadual: " + conta.getCliente().getInscricaoEstadual());
		

		System.out.println("Rua:" + conta.getCliente().getEndereco().getRua());
		System.out.println("Número:" + conta.getCliente().getEndereco().getNumero());
		System.out.println("Complemento:" + conta.getCliente().getEndereco().getComplemento());
		System.out.println("Bairro:" + conta.getCliente().getEndereco().getBairro());
		System.out.println("Cep:" + conta.getCliente().getEndereco().getCep());
		System.out.println("Nome Cidade:" + conta.getCliente().getEndereco().getCidade().getNome());
		System.out.println("Nome Estado:" + conta.getCliente().getEndereco().getCidade().getEstado().getNome());
		System.out.println("Sigla Estado:" + conta.getCliente().getEndereco().getCidade().getEstado().getSigla());
		System.out.println("Email: " + conta.getCliente().getContato().getEmail());
		System.out.println("Celular: " + conta.getCliente().getContato().getCelular());
		System.out.println("Telefone: " + conta.getCliente().getContato().getTelefone());
		System.out.println("Voip: " + conta.getCliente().getContato().getVoip());
	}

}

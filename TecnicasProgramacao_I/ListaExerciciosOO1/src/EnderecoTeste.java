
public class EnderecoTeste {
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

		System.out.println("Rua:" + endereco.getRua());
		System.out.println("Número:" + endereco.getNumero());
		System.out.println("Complemento:" + endereco.getComplemento());
		System.out.println("Bairro:" + endereco.getBairro());
		System.out.println("Cep:" + endereco.getCep());
		System.out.println("Nome Cidade:" + endereco.getCidade().getNome());
		System.out.println("Nome Estado:" + endereco.getCidade().getEstado().getNome());
		System.out.println("Sigla Estado:" + endereco.getCidade().getEstado().getSigla());
		
	}
}

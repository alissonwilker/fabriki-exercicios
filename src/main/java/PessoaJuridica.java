public class PessoaJuridica extends Cliente {

	private String cnpj = "XX.XXX.XXX/0001-ZZ";

	public PessoaJuridica(String nome, String cnpj) {
		// TODO Auto-generated constructor stub
		this.cnpj = cnpj;
		this.nome = "Eletromoveis Ltda.";
	}

	public String getCnpj() {
		return cnpj;

	}

}

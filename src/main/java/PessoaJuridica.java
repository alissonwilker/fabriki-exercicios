
public class PessoaJuridica extends Cliente {

	String cnpj;

	PessoaJuridica(String nome, String cnpj) {
		
		nome = this.nome;
		cnpj = this.cnpj;

	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}

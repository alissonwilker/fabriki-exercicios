import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa_fisica")
public class PessoaFisica extends Cliente {

  private String cpf;
  
  public PessoaFisica() {}

	public PessoaFisica(String nome, String cpf) {
    super(nome);
		this.cpf = cpf;
  }

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	// public String getNome() {
	// 	return nome;
  // }
  
}

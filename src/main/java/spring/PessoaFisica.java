import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoafisica")
public class PessoaFisica extends Cliente{	
	
	private String cpf;
	
	public PessoaFisica() {	}
	
	public <Optional>PessoaFisica(String nome, String cpf) {
		this.cpf = cpf;
		this.setNome(nome);		
	}	

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoaFisica")
public class PessoaFisicas{

    @Id
    @Column(updatable = true, nullable = false, unique = true)
    private String cpf;
    private String name;


	public PessoaFisicas(String cpf, String name) {
		this.cpf = cpf;
                this.name = name;
	}
   
     public PessoaFisicas() {
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}

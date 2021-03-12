import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoaFisica")
public class PessoaFisica extends Cliente {
	
    @Id
    @Column(updatable = true, nullable = false, unique = true)
    private String cpf;


	public PessoaFisica(String cpf, String name) {
		super(name);
		this.cpf = cpf;
        this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public String setCpf(Integer cpf) {
		this.cpf = cpf;
	}

}

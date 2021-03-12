import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "tb_pessoaFisica")
public class PessoaFisica extends Cliente {
	
    @Id
    @Column(nullable = false)
    private String cpf;


	public PessoaFisica(String cpf, String name) {
		super(name);
		this.cpf = cpf;
        this.name = name;
	}

	public String getCpf() {
			return cpf;
	}

}

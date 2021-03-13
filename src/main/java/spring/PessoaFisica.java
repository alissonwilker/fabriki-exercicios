@Entity
@Table(name = "tb_pessoaFisica")
public class {
	
    @Id
    @Column(updatable = true, nullable = false, unique = true)
    private String cpf;
    private String name;


	public PessoaFisica(String cpf, String name) {
		this.cpf = cpf;
                this.name = name;
	}
   
     public PessoaFisica() {
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}

package spring;

public class PessoaFisica extends Cliente {
	
	
    @Column
    private String cpf; 

    protected PessoaFisica() {}


    protected PessoaFisica(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}

   
    public String getCpf() {
        return cpf;
    }

  
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    

}

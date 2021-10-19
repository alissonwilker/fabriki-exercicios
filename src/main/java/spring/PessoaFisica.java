package spring;

public class PessoaFisica extends Cliente {
    
    private String cpf;
    
    public PessoaFisica() {}

    public PessoaFisica (String cpf, String id){

        super(id);
        setCpf(cpf);
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

}

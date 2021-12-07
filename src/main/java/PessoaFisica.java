public class PessoaFisica extends Cliente {
    //atributos
    private java.lang.String cpf;
    
    //métodos especiais
    public PessoaFisica(java.lang.String nome, java.lang.String cpf) {
        super(nome);
        
        this.setCpf(cpf);
    }

    public java.lang.String getCpf(){
        return this.cpf;
    }
    public void setCpf(java.lang.String cpf){
        this.cpf = cpf;
    }
}

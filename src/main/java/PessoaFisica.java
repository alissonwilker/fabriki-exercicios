public class PessoaFisica extends Cliente {
    //atributos
    private java.lang.String CPF;
    
    //métodos especiais
    public PessoaFisica(java.lang.String nome, java.lang.String CPF) {
        super(nome);
        
        this.setCPF(CPF);
    }

    public java.lang.String getCPF(){
        return CPF;
    }
    public void setCPF(java.lang.String CPF){
        this.CPF = CPF;
    }
}

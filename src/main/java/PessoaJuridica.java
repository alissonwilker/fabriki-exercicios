public class PessoaJuridica extends Cliente {
    //atributos
    private java.lang.String CNPJ;
    
    //métodos especiais
    public PessoaJuridica(java.lang.String nome, java.lang.String CNPJ) {   
        super(nome);
        
        this.setCNPJ(CNPJ);
    }

    public java.lang.String getCNPJ(){
        return CNPJ;
    }
    public void setCNPJ(java.lang.String CNPJ){
        this.CNPJ = CNPJ;
    }
}

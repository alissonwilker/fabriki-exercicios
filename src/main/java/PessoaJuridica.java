
public class PessoaJuridica extends Cliente {
    //atributos
    private java.lang.String cnpj;

    //métodos especiais
    public PessoaJuridica(java.lang.String nome, java.lang.String cnpj) {   
        super(nome);

        this.cnpj = cnpj;
    }

    public java.lang.String getCnpj(){
        return this.cnpj;
    }
}

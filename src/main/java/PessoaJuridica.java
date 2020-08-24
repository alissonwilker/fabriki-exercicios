public class PessoaJuridica extends Cliente {
    //Declaração das variavéis
    private String cnpj;
    
    //Método construtor
    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }
    
    //Métodos Getter
    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String getNome() {
        return super.getNome(); //To change body of generated methods, choose Tools | Templates.
    }
}

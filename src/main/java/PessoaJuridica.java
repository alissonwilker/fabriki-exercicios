public class PessoaJuridica extends Cliente {
    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    private final String cnpj;

    public String getCnpj() {
        return cnpj;
    }
}

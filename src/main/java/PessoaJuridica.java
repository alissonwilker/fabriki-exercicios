public class PessoaJuridica extends Cliente {
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}

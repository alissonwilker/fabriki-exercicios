public class PessoaFisica extends Cliente {
  private String cpf;

  public PessoaFisica(String nome, String cpf) {
    this.nome = nome;
    this.cpf  = cpf;
  }

  public String getCpf() {
    return this.cpf;
  }

  public String getNome() {
    return this.nome;
  }
}

public class PessoaJuridica extends Cliente {
    private String cnpj;

    
    public PessoaJuridica(String nome, String cnpj){
      super(nome);
  }
    
    public String getCnpj(){
        return cnpj;
    }
    
}

public class PessoaJuridica extends Cliente {
	private java.lang.String cnpj;
    public PessoaJuridica(java.lang.String nome, java.lang.String cnpj) {
    	super(nome);
    	this.cnpj = cnpj;

	}
    public java.lang.String getCnpj(){
    	return cnpj;
    }

	

}

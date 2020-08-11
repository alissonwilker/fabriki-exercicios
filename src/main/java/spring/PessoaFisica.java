public class PessoaFisica extends Cliente {
	private String cpf;
	
	
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}
	
	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}
	
	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}
	
	@Override
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}
	
	public PessoaFisica(String nome, String cpf) {
		
		setNome(nome);
		setCpf(cpf);
	 
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}

public class ContaBancaria {
	private int saldo;
	private Cliente cliente;
	private int id;
	private static int contador = 1; 

	public ContaBancaria(Cliente cliente) {
		// TODO Auto-generated constructor stub
		this.cliente = cliente;
		id = contador++;
	}

	public Object getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	public void depositar(int valorDeposito) {
		// TODO Auto-generated method stub
		if(valorDeposito > 0) {
			saldo += valorDeposito;
		}
	}

	public void sacar(int valorSaque) {
		// TODO Auto-generated method stub
		if(valorSaque > 0 && valorSaque <= saldo) {
			saldo -= valorSaque;
		}

	}

	public Object getCliente() {
		// TODO Auto-generated method stub
		return cliente;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

}

------------------------------------------------------------------------------------------------------------------
pessoajuridica

public class PessoaJuridica extends Cliente {
private String cnpj;
	public PessoaJuridica(String nome, String cnpj) {
		// TODO Auto-generated constructor stub
		super(nome);
		this.cnpj = cnpj;
	}
	public String getCnpj() {
		return cnpj;
	}

}
------------------------------------------------------------------------------

clinte.java

public class Cliente {
	private String nome;

	protected Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}

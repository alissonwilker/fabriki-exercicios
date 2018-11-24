public class ContaBancaria {
	
	private int saldo;
	private Cliente cliente;
	private int id;
	private static int contador;
	
	public ContaBancaria(Cliente pessoaFisica) {
		// TODO Auto-generated constructor stub
			
	}
		
	public Object getSaldo() {
		// TODO Auto-generated method stub
		
		return saldo;
	}

	public void depositar(int valorDeposito) {
		// TODO Auto-generated method stub
		if(valorDeposito >=0){
			saldo+=valorDeposito;
		}
		
		}
			

	public void sacar(int valorSaque) {
		// TODO Auto-generated method stub
		if(valorSaque>=saldo){
			saldo+=valorSaque;
		
		}else{
			if(valorSaque< saldo){
				saldo--;
			}
		}
			 
		}
		
	

	public Object getCliente() {
		// TODO Auto-generated method stub
		return cliente;
	}

	public int getId() {
		// TODO Auto-generated method stub
		
      return id;
		}	

	
}

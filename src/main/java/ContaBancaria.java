public class ContaBancaria {
	
	private int saldo;
	private Cliente cliente;
	private int id;
	private static int contador;
	
	public ContaBancaria(Cliente pessoaFisica) {
		// TODO Auto-generated constructor stub
		
		id = contador++;

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
		if(valorSaque < 20 ){ 
	  		saldo+=valorSaque;
	  		
	  		if(valorSaque>=20){
	  			saldo-= valorSaque;
	  		}
		
		}else{
			if(saldo >=20){
				saldo+=valorSaque;
				if(saldo<=5){
					saldo-=valorSaque;
				}
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

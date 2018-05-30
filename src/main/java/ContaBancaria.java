package lpoo2905;




	/**
	 * Classe de teste para a classe ContaBancaria.
	 *
	 */
	public class ContaBancaria {

	   
	 
	    private int saldo;
	    Cliente cliente;

	    public Cliente getCliente() {
			return cliente;
		}
		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}
		public ContaBancaria(Cliente pessoaFisica) {
			setCliente(pessoaFisica);
			
		}	 
	    public int getSaldo() {
			return saldo;
		}

		public void setSaldo(int saldo) {
			this.saldo = saldo;
			
		}
      public void depositar(int valorDeposito){
    	  if (valorDeposito > 0)
    		  this.saldo=getSaldo() + valorDeposito;
    	  
      }
      public void sacar(int valorSaque){
    	  if (getSaldo() > valorSaque)
    		  this.saldo=getSaldo()-valorSaque;
    	  
      }
      
	}
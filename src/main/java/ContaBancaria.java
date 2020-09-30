// arquivo ContaBancaria.java (Camada Model)


/**
 *
 * @author Elizeu Neto
 */
public class ContaBancaria extends Object {
    //Declaração das variavéis
    private int saldo;
    private int id;
    private static int contador;
    private Cliente cliente;

    //Método construtor
    public ContaBancaria(Cliente cliente) {
        this.cliente = cliente;
        ContaBancaria.contador++;
        this.id = ContaBancaria.contador;
    }
    
    public String realizar(String paramNome, String paramTipo, String paramDeposito, String paramSaque, String paramOperacao) {
    	String out = "";
    	if(paramOperacao.equals("recuperarNomeCliente")) {
    		out = cliente.getNome();
    	} else if (paramOperacao.equals("recuperarCpfCliente")){
    		out = ((PessoaFisica)cliente).getCpf();
    	} else if (paramOperacao.equals("recuperarCnpjCliente")){
    		out = ((PessoaJuridica)cliente).getCnpj();
    	} else if (paramOperacao.equals("recuperarSaldo")){
    		out = "Aqui está o seu saldo: "+ getSaldo();
    	} else if (paramOperacao.equals("depositarValor")){
    		out = "Você realizou um depósito de: "+depositar(Integer.parseInt(paramDeposito));
    	} else if (paramOperacao.equals("sacarValor")){
    		out = "Você realizou um saque de: "+depositar(Integer.parseInt(paramSaque));
    	} else if (paramOperacao.equals("depositarSacarValor")) {
    		out = "Você realizou um depósito de: "+depositar(Integer.parseInt(paramDeposito))+". E um saque de: "+depositar(Integer.parseInt(paramSaque));
    	}
    	return out;
    	
    }
    
    //Método Getter
    public int getSaldo() {
        return saldo;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public int depositar(int valorDeposito){
        if(valorDeposito>0){
            //saída de dados
            this.saldo += valorDeposito;
            return this.saldo;
        }else{
            //saída de dados
            
        }
        return this.saldo;
    }
    
    public int sacar(int valorSaque){
        if(valorSaque>0 && valorSaque<=this.saldo){
            //saída de dados
            this.saldo -= valorSaque;
            return this.saldo;
        }else{
            //saída de dados
            
        }
        return this.saldo;
    }
    
    
}

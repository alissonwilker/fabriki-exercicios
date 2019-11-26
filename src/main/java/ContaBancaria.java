public class ContaBancaria {

	private int saldo;
	private Cliente cliente;
	private int id;
	private static int contador;

	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		id = contador++;
	}

	public int getSaldo() {
		this.saldo = saldo;
		return saldo;
	}

	public int depositar(int valorDep) {
		if (valorDep > 0) {
			saldo = saldo + valorDep;
		} else {
			System.out.println("valor negativo. Deposito negado");
		}
		return saldo;
	}

	public int sacar(int valorSaq) {
		if (valorSaq > 0 && (valorSaq <= saldo)) {
			saldo = saldo - valorSaq;
		} else {
			System.out.println("saque negado");
		}
		return saldo;
	}

	public Cliente getCliente() {

		return cliente;
	}

	public int getId() {

		return id;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public String buscar(String paramnome, String paramtipocliente, String paramcpfcnpj, String paramOperacao,
			String paramdepvalor, String paramsacvalor, String paramdepsacvalor, String paramvalordeposito,
			String paramvalorsaque) {

		String nome = paramnome;
		String tipocliente = paramtipocliente;
		String cpfcnpj = paramcpfcnpj;

		String Operacao = paramOperacao;
		String depvalor = paramdepvalor;
		String sacvalor = paramsacvalor;
		String valordepsac = paramdepsacvalor;

		String valordeposito = paramvalordeposito;
		String valorsaque = paramvalorsaque;
		int valorDep = 0;
		int valorSaq = 0;
		String retorno = " ";

		if (Operacao.equalsIgnoreCase("recuperarNomeCliente")) {
			retorno = nome;

		}

		if (Operacao.equalsIgnoreCase("recuperarCpfCliente") || (Operacao.equalsIgnoreCase("recuperarCnpjCliente"))) {
			retorno = cpfcnpj;
		}

		if (Operacao.equalsIgnoreCase("recuperarSaldo")) {

			if (valordeposito.isEmpty() && valorsaque.isEmpty()) {
				retorno = "saldo inalterado" + getSaldo();
			} else {
				// this.getSaldo();
				// setSaldo(300);
				valorSaq = Integer.parseInt(valorsaque);
				valorDep = Integer.parseInt(valordeposito);
				depositar(valorDep);
				sacar(valorSaq);
				// setSaldo(valorDep - valorSaq);
				// saldo = saldo + valorDep;
				// setSaldo(saldo);
				retorno = Integer.toString(this.getSaldo());

			}
		}
		/*
		 * if( valordeposito.equals(valordeposito) || valorsaque.equals(valorsaque)){
		 * //valord =Integer.parseInt(valordeposito); //valors =
		 * Integer.parseInt(valorsaque); if(valord >= 0) { saldo=+valord;
		 * this.setSaldo(saldo); retorno = Integer.toString(this.getSaldo()); } if(
		 * valors >= 0) {
		 * 
		 * saldo=-valors; this.setSaldo(saldo); retorno =
		 * Integer.toString(this.getSaldo()); }else { retorno = "saldo insuficiente"; }
		 * } }
		 */

		if (Operacao.equalsIgnoreCase("depositarValor")) {
			if (valordeposito.isEmpty()) {
				retorno = "preencha o valor de depósito";
			} else {
				valorDep = Integer.parseInt(valordeposito);
				depositar(valorDep);
				// saldo=+valorDep;
				// setSaldo(valorDep);
				retorno = "valor do depósito" + Integer.toString(valorDep) + getSaldo();
			}

		}

		if (Operacao.equalsIgnoreCase("sacarValor")) {
			if (valorsaque.isEmpty()) {
				retorno = "preencha o valor do saque.";
			} else {
				valorSaq = Integer.parseInt(valorsaque);
				sacar(valorSaq);
				// sacar(valorSaq);
				/*
				 * saldo=-valors; this.setSaldo(saldo);
				 */
				retorno = "valor do saque:" + Integer.toString(valorSaq);
			}
		}

		if (Operacao.equalsIgnoreCase("depositarSacarValor")) {
			if (valordeposito.isEmpty() || valorsaque.isEmpty()) {
				retorno = "preencha os dois campos.";
			} else {
				valorDep = Integer.parseInt(valordeposito);
				valorSaq = Integer.parseInt(valorsaque);
				saldo = valorDep - valorSaq;
				setSaldo(saldo);
				retorno = "valor do depósito" + Integer.toString(valorDep) + "valor do saque:"
						+ Integer.toString(valorSaq) + "valor do saldo" + Integer.toString(getSaldo());
			}
		}

		return retorno;

	}

	// return retorno;
}

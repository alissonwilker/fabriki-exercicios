public class BancoBusiness {
	private TipoCliente tipoCliente;

	public static enum TipoCliente {
		pessoaFisica, pessoaJuridica
	}

	/**
	 * Deposita um valor e em seguida saca outro valor, retornando o novo saldo.
	 * 
	 * @param contaBancaria
	 *            A conta bancaria na qual deve ser realizada a operacao.
	 * @param valorDeposito
	 *            O valor a ser depositado na conta.
	 * @param valorSaque
	 *            O valor a ser sacado da conta.
	 * @return O novo saldo apos as operacoes de deposito e saque.
	 */
	public Integer depositarSacarValor(ContaBancaria contaBancaria, int valorDeposito, int valorSaque) {
		if (contaBancaria != null) {
			contaBancaria.depositar(valorDeposito);
			int saldo = contaBancaria.sacar(valorSaque);
			return saldo;
		}
		return null;
	}

	public Integer sacarValor(ContaBancaria contaBancaria, int valorSaque) {
		if (contaBancaria != null) {
			int saldo = contaBancaria.sacar(valorSaque);
			return saldo;
		}
		return null;
	}

	public Integer depositarValor(ContaBancaria contaBancaria, int valorDeposito) {
		if (contaBancaria != null) {
			contaBancaria.depositar(valorDeposito);
			return contaBancaria.getSaldo();
		}
		return null;
	}

	public Integer recuperarSaldo(ContaBancaria contaBancaria) {
		if (contaBancaria != null) {
			int saldo = contaBancaria.getSaldo();
			return saldo;
		}
		return null;
	}

	public String recuperarCnpjCliente(ContaBancaria contaBancaria) {
		if (contaBancaria != null) {
			Cliente cliente = contaBancaria.getCliente();
			if (cliente instanceof PessoaJuridica) {
				return ((PessoaJuridica) cliente).getCnpj();
			}
		}
		return null;
	}

	/**
	 * Recupera o CPF do cliente (dono) da conta bancaria.
	 * 
	 * @param contaBancaria
	 *            A conta bancaria cujo CPF do cliente (dono) deve ser recuperado.
	 * @return O CPF do cliente (dono) da conta bancaria.
	 */
	public String recuperarCpfCliente(ContaBancaria contaBancaria) {
		if (contaBancaria != null) {
			Cliente cliente = contaBancaria.getCliente();
			if (cliente instanceof PessoaFisica) {
				return ((PessoaFisica) cliente).getCpf();
			}
		}
		return null;
	}

	public String recuperarNomeCliente(ContaBancaria contaBancaria) {
		if (contaBancaria != null) {
			return contaBancaria.getCliente().getNome();
		}
		return null;
	}

	/**
	 * Cria uma conta bancaria de Pessoa Fisica ou de Pessoa Juridica, de acordo com
	 * o tipo de cliente.
	 * 
	 * @param nomeCliente
	 *            O nome do cliente (dono) da conta bancaria.
	 * @param cpfCnpj
	 *            O CPF ou CNPJ do cliente (dono) da conta bancaria.
	 * @param tipoCliente
	 *            O tipo de cliente (Pessoa Fisica ou Pessoa Juridica).
	 * @return A nova conta bancaria do cliente.
	 */
	public ContaBancaria criarContaBancaria(String nomeCliente, String cpfCnpj, TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;

		ContaBancaria contaBancaria = null;
		Cliente cliente = null;
		switch (this.tipoCliente) {
		case pessoaFisica:
			PessoaFisica clientePessoaFisica = new PessoaFisica(nomeCliente, cpfCnpj);
			cliente = clientePessoaFisica;
			break;
		case pessoaJuridica:
			PessoaJuridica clientePessoaJuridica = new PessoaJuridica(nomeCliente, cpfCnpj);
			cliente = clientePessoaJuridica;
			break;
		}
		contaBancaria = new ContaBancaria(cliente);
		return contaBancaria;
	}
}

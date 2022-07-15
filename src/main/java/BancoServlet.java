public class BancoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		String paramTipoCliente = request.getParameter("tipoCliente");
		String paramOperacao = request.getParameter("operacao");
		String paramNome = request.getParameter("nomeCliente");
		String paramCpfCnpj = request.getParameter("cpfCnpj");
		String paramvalorDeposito = request.getParameter("valorDeposito");
		String paramValorSaque = request.getParameter("valorSaque");

		Object resposta = null;
		
		if (paramTipoCliente.equals("pessoaFisica")) {
			PessoaFisica pessoaFisica = new PessoaFisica(paramNome, paramCpfCnpj);
			ContaBancaria contaBancaria = new ContaBancaria(pessoaFisica);

			if (paramOperacao.equals("recuperarNomeCliente")) {
				resposta = pessoaFisica.getNome();
			} else if (paramOperacao.equals("recuperarCpfCliente")) {
				resposta = pessoaFisica.getCpf();
			} else if (paramOperacao.equals("recuperarSaldo")) {
				resposta = contaBancaria.getSaldo();
			} else if (paramOperacao.equals("depositarValor")) {
				resposta = contaBancaria.depositar(Integer.parseInt(paramvalorDeposito));
			} else if (paramOperacao.equals("sacarValor")) {
				resposta = contaBancaria.sacar(Integer.parseInt(paramValorSaque));
			} else if (paramOperacao.equals("depositarSacarValor")) {
				contaBancaria.depositar(Integer.parseInt(paramvalorDeposito));
				resposta = contaBancaria.sacar(Integer.parseInt(paramValorSaque));
			}
		} else {
			PessoaJuridica pessoaJuridica = new PessoaJuridica(paramNome, paramCpfCnpj);
			ContaBancaria contaBancaria = new ContaBancaria(pessoaJuridica);

			if (paramOperacao.equals("recuperarNomeCliente")) {
				resposta = pessoaJuridica.getNome();
			} else if (paramOperacao.equals("recuperarCnpjCliente")) {
				resposta = pessoaJuridica.getCnpj();
			} else if (paramOperacao.equals("recuperarSaldo")) {
				resposta = contaBancaria.getSaldo();
			} else if (paramOperacao.equals("depositarValor")) {
				resposta = contaBancaria.depositar(Integer.parseInt(paramvalorDeposito));
			} else if (paramOperacao.equals("sacarValor")) {
				resposta = contaBancaria.sacar(Integer.parseInt(paramValorSaque));
			} else if (paramOperacao.equals("depositarSacarValor")) {
				contaBancaria.depositar(Integer.parseInt(paramvalorDeposito));
				resposta = contaBancaria.sacar(Integer.parseInt(paramValorSaque));
			}

		}

		request.setAttribute("resposta", resposta);
		request.getRequestDispatcher("resposta.jsp").forward(request, response); 
	}

}

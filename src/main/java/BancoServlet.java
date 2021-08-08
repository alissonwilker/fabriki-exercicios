import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		String pOperacao = request.getParameter("operacao");
		String pTipoCliente = request.getParameter("tipoCliente");
		String pNome = request.getParameter("nomeCliente");
		String pCpfCnpj = request.getParameter("cpfCnpj");
		String pValorSaque = request.getParameter("valorSaque");
		String pValorDeposito = request.getParameter("valorDeposito");

		Object resposta = null;
		
		if (pTipoCliente.equals("pessoaFisica")) {
			PessoaFisica pessoaFisica = new PessoaFisica(pNome, pCpfCnpj);
			ContaBancaria contaBancaria = new ContaBancaria(pessoaFisica);

			if (pOperacao.equals("recuperarNomeCliente")) {
				resposta = pessoaFisica.getNome();
			} else if (pOperacao.equals("recuperarCpfCliente")) {
				resposta = pessoaFisica.getCpf();
			} else if (pOperacao.equals("recuperarSaldo")) {
				resposta = contaBancaria.getSaldo();
			} else if (pOperacao.equals("depositarValor")) {
				resposta = contaBancaria.depositar(Integer.parseInt(pValorDeposito));
			} else if (pOperacao.equals("sacarValor")) {
				resposta = contaBancaria.sacar(Integer.parseInt(pValorSaque));
			} else if (pOperacao.equals("depositarSacarValor")) {
				contaBancaria.depositar(Integer.parseInt(pValorDeposito));
				resposta = contaBancaria.sacar(Integer.parseInt(pValorSaque));
			}
		} else {
			PessoaJuridica pessoaJuridica = new PessoaJuridica(pNome, pCpfCnpj);
			ContaBancaria contaBancaria = new ContaBancaria(pessoaJuridica);

			if (pOperacao.equals("recuperarNomeCliente")) {
				resposta = pessoaJuridica.getNome();
			} else if (pOperacao.equals("recuperarCnpjCliente")) {
				resposta = pessoaJuridica.getCnpj();
			} else if (pOperacao.equals("recuperarSaldo")) {
				resposta = contaBancaria.getSaldo();
			} else if (pOperacao.equals("depositarValor")) {
				resposta = contaBancaria.depositar(Integer.parseInt(pValorDeposito));
			} else if (pOperacao.equals("sacarValor")) {
				resposta = contaBancaria.sacar(Integer.parseInt(pValorSaque));
			} else if (pOperacao.equals("depositarSacarValor")) {
				contaBancaria.depositar(Integer.parseInt(pValorDeposito));
				resposta = contaBancaria.sacar(Integer.parseInt(pValorSaque));
			}

		}

		request.setAttribute("resposta", resposta);
		request.getRequestDispatcher("resposta.jsp").forward(request, response); 
	}

}

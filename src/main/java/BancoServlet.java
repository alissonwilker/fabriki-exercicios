import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String paramNomeCliente = request.getParameter("nomeCliente");
		String paramTipoCliente = request.getParameter("tipoCliente");
		String paramCpfCnpj = request.getParameter("cpfCnpj");
		String paramOperacao = request.getParameter("operacao");

		Cliente cliente;
		if (paramTipoCliente.equals("pessoaFisica")) {
			cliente = new PessoaFisica(paramNomeCliente, paramCpfCnpj);
		} else {
			cliente = new PessoaJuridica(paramNomeCliente, paramCpfCnpj);
		}
				
		String resposta = "";
		switch (paramOperacao) {
		case "recuperarNomeCliente":
			resposta = cliente.getNome();
			break;
		case "recuperarCpfCliente":
			if (paramTipoCliente.equals("pessoaFisica")) {
				resposta = ((PessoaFisica)cliente).getCpf();
			}
			break;
		case "recuperarCnpjCliente":
			if (paramTipoCliente.equals("pessoaJuridica")) {
				resposta = ((PessoaJuridica)cliente).getCnpj();
			}
			break;
		case "operacaoRecuperarSaldo":
			if (paramOperacao.equals("recuperarSaldo")) {
				ContaBancaria conta = new ContaBancaria(cliente);
				resposta = conta.getSaldo();
			}
			break;	
		case "operacaoDepositarValor":
			if (paramOperacao.equals("recuperarSaldo")) {
				ContaBancaria conta = new ContaBancaria(cliente);
				resposta = conta.depositar(valor)();
			}
			break;
		case "operacaoSacarValor":
			if (paramOperacao.equals("recuperarSaldo")) {
				ContaBancaria conta = new ContaBancaria(cliente);
				resposta = conta.sacar(valor);
			}
			break;
		case "operacaoDepositarSacarValor":
			if (paramOperacao.equals("depositarSacarValor")) {
				resposta = ;
			}
			break;
		}
				
		request.setAttribute("resposta", resposta);
		RequestDispatcher reqDispatcher = request.getRequestDispatcher("resposta.jsp");
		reqDispatcher.forward(request, response);
	}
}

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
		String valorDeposito = request.getParameter("valorDeposito");
		String valorSaque = request.getParameter("valorSaque");
		//int paramValorDeposito = Integer.parseInt(valorDeposito);
		//int paramValorSaque = Integer.parseInt(valorSaque);
		Cliente cliente;
		if (paramTipoCliente.equals("pessoaFisica")) {
			cliente = new PessoaFisica(paramNomeCliente, paramCpfCnpj);
		} else {
			cliente = new PessoaJuridica(paramNomeCliente, paramCpfCnpj);
		}
		ContaBancaria conta = new ContaBancaria(cliente);

		String resposta = "";
		//int valor = 0;
		switch (paramOperacao) {
		case "recuperarNomeCliente":
			resposta = cliente.getNome();
			break;
		case "recuperarCpfCliente":
			if (paramTipoCliente.equals("pessoaFisica")) {
				resposta = ((PessoaFisica) cliente).getCpf();
			}
			break;
		case "recuperarCnpjCliente":
			if (paramTipoCliente.equals("pessoaJuridica")) {
				resposta = ((PessoaJuridica) cliente).getCnpj();
			}
			break;
		case "recuperarSaldo":
			resposta = Integer.toString(conta.getSaldo());
			break;
		case "depositarValor":
			conta.depositar(Integer.parseInt(valorDeposito));
			resposta = "Você depositou "+valorDeposito;
			break;
		case "sacarValor":
			conta.sacar(Integer.parseInt(valorSaque));
			break;
		case "depositarSacarValor":
			conta.depositar(Integer.parseInt(valorDeposito));
			conta.sacar(Integer.parseInt(valorSaque));
			break;
		}

		request.setAttribute("resposta", resposta);
		RequestDispatcher reqDispatcher = request.getRequestDispatcher("resposta.jsp");
		reqDispatcher.forward(request, response);

	}
}

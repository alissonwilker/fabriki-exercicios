import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BancoServlet") // associando xml
public class BancoServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String paramNomeCliente = request.getParameter("nomeCliente");
		String paramTipoCliente = request.getParameter("tipoCliente");
		String paramCpfCnpj = request.getParameter("cpfCnpj");
		String paramOperacao = request.getParameter("operacao");

		String paramDeposito = request.getParameter("ValorDeposito");
		String paramSaque = request.getParameter("ValorSaque");

		Cliente cliente;
		if (paramTipoCliente.equals("pessoaFisica")) {
			cliente = new PessoaFisica(paramNomeCliente, paramCpfCnpj);
		} else {
			cliente = new PessoaJuridica(paramNomeCliente, paramCpfCnpj);
		}
		ContaBancaria contabancaria = new ContaBancaria(cliente);

		String resposta = "";
		int resposta1 = 0;
		switch (paramOperacao) {
		case "recuperarNomeCliente":
			resposta = cliente.getNome();
			break;
		case "recuperarCpfCliente":
			if (cliente instanceof PessoaFisica) {
				resposta = ((PessoaFisica) cliente).getCpf(); // parêntese p/conversão de cliente p/PessoaFisica
			} else {
				resposta = "Não é Pessoa Física, selecione CNPJ";
			}
			break;
		case "recuperarCnpjCliente":
			if (cliente instanceof PessoaJuridica) {
				resposta = ((PessoaJuridica) cliente).getCnpj(); // parêntese p/conversão de cliente p/PessoaJuridica
			} else {
				resposta = "Não é Pessoa Jurídica, selecione CPF";
			}
			break;

		case "recuperarSaldo":
			resposta1 = contabancaria.getSaldo();
			request.setAttribute("resposta", resposta1);
			RequestDispatcher requestDispatcher1 = request.getRequestDispatcher("resposta.jsp");
			requestDispatcher1.forward(request, response);
		case "depositarValor":
			int intParamDeposito = Integer.parseInt(paramDeposito);
			resposta1 = contabancaria.depositar(intParamDeposito);
			request.setAttribute("resposta", resposta1);
			RequestDispatcher requestDispatcher2 = request.getRequestDispatcher("resposta.jsp");
			requestDispatcher2.forward(request, response);
		case "sacarValor":
			int intParamSaque = Integer.parseInt(paramSaque);
			resposta1 = contabancaria.depositar(intParamSaque);
			request.setAttribute("resposta", resposta1);
			RequestDispatcher requestDispatcher3 = request.getRequestDispatcher("resposta.jsp");
			requestDispatcher3.forward(request, response);
		case "depositaSsacarValor":
			int intParamDeposito1 = Integer.parseInt(paramDeposito);
			int intParamSaque1 = Integer.parseInt(paramSaque);
			int depositando = contabancaria.depositar(intParamDeposito1);
			int sacando = contabancaria.sacar(intParamSaque1);
			request.setAttribute("resposta", depositando);
			request.setAttribute("resposta", sacando);
			RequestDispatcher requestDispatcher4 = request.getRequestDispatcher("resposta.jsp");
			requestDispatcher4.forward(request, response);
		}

		request.setAttribute("resposta", resposta);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("resposta.jsp");
		requestDispatcher.forward(request, response);

	}
}

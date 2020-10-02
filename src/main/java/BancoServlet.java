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
		String paramDeposito = request.getParameter("valorDeposito");
		String paramSaque = request.getParameter("valorSaque");

		Cliente cliente;
		if (paramTipoCliente.equals("pessoaFisica")) {
			cliente = new PessoaFisica(paramNomeCliente, paramCpfCnpj);
		} else {
			cliente = new PessoaJuridica(paramNomeCliente, paramCpfCnpj);
		}

		ContaBancaria contabancaria = new ContaBancaria(cliente);

		String resposta = "";

		int valorDeposito = 0;
		int valorSaque = 0;
		if (paramOperacao.equals("depositarValor") || paramOperacao.equals("sacarValor")
				|| paramOperacao.equals("depositarSacarValor")) {
			
			if (paramDeposito.isEmpty() == false) {
				valorDeposito = Integer.parseInt(paramDeposito);
			}
			if (paramSaque.isEmpty() == false) {
				valorSaque = Integer.parseInt(paramSaque);
			}
		}
		

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
			resposta = Integer.toString(contabancaria.getSaldo());
			break;

		case "depositarValor":
			contabancaria.depositar(valorDeposito);
			resposta = Integer.toString(contabancaria.getSaldo());
			break;

		case "sacarValor":
			contabancaria.sacar(valorSaque);
			resposta = Integer.toString(contabancaria.getSaldo());
			break;

		case "depositarSacarValor":
			contabancaria.depositar(valorDeposito);
			contabancaria.sacar(valorSaque);
			resposta = Integer.toString(contabancaria.getSaldo());
			break;
		}

		request.setAttribute("resposta", resposta);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("resposta.jsp");
		requestDispatcher.forward(request, response);
	}
}

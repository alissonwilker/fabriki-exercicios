import java.io.IOException;
import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	String paramNomeCliente = request.getParameter("nomeCliente");
	String paramValorDeposito = request.getParameter("valorDeposito");
	String paramValorSaque = request.getParameter("valorSaque");
	String paramTipoOperacao = request.getParameter("operacao");
	String paramTipoCliente = request.getParameter("tipoCliente");
	String cpfCnpj= request.getParameter("cpfCnpj");

	if(paramValorSaque.equals("")) {
		paramValorSaque = "0";
	}

	if(paramValorDeposito.equals("")) {
		paramValorDeposito = "0";
	}

	Integer deposito = Integer.parseInt(paramValorDeposito);
	Integer saque = Integer.parseInt(paramValorSaque);

	if(paramTipoCliente.equals("pessoaFisica")) {
		PessoaFisica cliente = new PessoaFisica(paramNomeCliente, cpfCnpj);
		ContaBancaria contaBancaria = new ContaBancaria(cliente);

		executarOperacao(
      cliente,
      new PessoaJuridica("", ""),
      contaBancaria,
      paramTipoOperacao,
			saque,
      deposito,
      request,
      paramTipoCliente
    );
	} else {
		PessoaJuridica cliente = new PessoaJuridica(paramNomeCliente, cpfCnpj);
		ContaBancaria contaBancaria = new ContaBancaria(cliente);
		executarOperacao(
      new PessoaFisica(" ", ""),
      cliente,
      contaBancaria,
      paramTipoOperacao,
			saque,
      deposito,
      request,
      paramTipoCliente
    );
	}

	RequestDispatcher reqDispatcher = request.getRequestDispatcher("resposta.jsp");
	 reqDispatcher.forward(request, response); 
	}

	protected void executarOperacao(PessoaFisica pessoaFisica, PessoaJuridica pessoaJuridica, ContaBancaria contaBancaria,
    String tipoOperacao, Integer saque, Integer deposito, HttpServletRequest request, String tipoCliente) {
		switch (tipoOperacao) {
		case "recuperarNomeCliente":
			if(tipoCliente.equals("pessoaFisica")) {
				request.setAttribute("resposta", pessoaFisica.getNome());
			} else {
				request.setAttribute("resposta", pessoaJuridica.getNome());
			}
			break;

		case "recuperarCpfCliente":

			request.setAttribute("resposta", pessoaFisica.getCpf());
			break;	
		case "recuperarCnpjCliente":

			request.setAttribute("resposta", pessoaJuridica.getCnpj());
			break;		

		case "recuperarSaldo":
			request.setAttribute("resposta", contaBancaria.getSaldo());
			break;

		case "depositarValor":

			contaBancaria.depositar(deposito);
			request.setAttribute("resposta", contaBancaria.getSaldo());
			break;

		case "sacarValor":
			contaBancaria.sacar(saque);
			request.setAttribute("resposta", contaBancaria.getSaldo());
			break;

		case "depositarSacarValor":
			contaBancaria.depositar(deposito);
			contaBancaria.sacar(saque);
			request.setAttribute("resposta", contaBancaria.getSaldo());
			break;
		}
	}
}

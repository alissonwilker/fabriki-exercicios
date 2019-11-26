import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BancoServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String paramnome = request.getParameter("nomeCliente");
		String paramtipocliente = request.getParameter("tipoCliente");
		// String paramIdPF = request.getParameter("tipoClientePessoaFisica");
		// String paramIdPJ = request.getParameter("tipoClientePessoaJuridica");
		String paramcpfcnpj = request.getParameter("cpfCnpj");
		String paramOperacao = request.getParameter("operacao");

		String paramdepvalor = request.getParameter("depositarValor");
		String paramsacvalor = request.getParameter("sacarValor");
		String paramdepsacvalor = request.getParameter("depositarSacarValor");
		String paramvalordeposito = request.getParameter("valorDeposito");
		String paramvalorsaque = request.getParameter("valorSaque");

		ContaBancaria contabancaria = new ContaBancaria(null);
		String retorno = contabancaria.buscar(paramnome, paramtipocliente, paramcpfcnpj, paramOperacao, paramdepvalor,
				paramsacvalor, paramdepsacvalor, paramvalordeposito, paramvalorsaque);
		request.setAttribute("resposta", retorno);

		RequestDispatcher reqDispatcher = request.getRequestDispatcher("resposta.jsp");
		reqDispatcher.forward(request, response);

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}

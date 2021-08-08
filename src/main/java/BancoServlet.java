import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		java.lang.String paramNome = request.getParameter("nomeCliente");
		java.lang.String paramTipoCliente = request.getParameter("tipoCliente");
		java.lang.String paramCpfCnpj = request.getParameter("cpfCnpj");
		java.lang.String paramOperacao = request.getParameter("operacao");
		java.lang.String paramDeposito = request.getParameter("valorDeposito");
		java.lang.String paramSaque = request.getParameter("valorSaque");

		ContaBancaria conta1 = new ContaBancaria(null);

		if (paramOperacao.equals("recuperarNomeCliente")) {
			request.setAttribute("resposta", paramNome);
		} else if (paramOperacao.equals("recuperarCpfCliente") && paramTipoCliente.equals("pessoaFisica")) {
			request.setAttribute("resposta", paramCpfCnpj);
		} else if (paramOperacao.equals("recuperarCnpjCliente") && paramTipoCliente.equals("pessoaJuridica")) {
			request.setAttribute("resposta", paramCpfCnpj);
		} else if (paramOperacao.equals("recuperarSaldo")) {
			request.setAttribute("resposta", conta1.getSaldo());
		} else if (paramOperacao.equals("depositarValor")) {
			int inversao = Integer.parseInt(paramDeposito);
			request.setAttribute("resposta", conta1.depositar(inversao));
		} else if (paramOperacao.equals("sacarValor")) {
			int inversao = Integer.parseInt(paramSaque);
			request.setAttribute("resposta", conta1.sacar(inversao));
		} else if (paramOperacao.equals("depositarSacarValor")) {
			int inversao = Integer.parseInt(paramDeposito) - Integer.parseInt(paramSaque);
			request.setAttribute("resposta", inversao);
		}
		request.getRequestDispatcher("resposta.jsp").forward(request, response);
	}

}

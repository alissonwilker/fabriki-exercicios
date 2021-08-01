
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String pNome = request.getParameter("nomeCliente");

		String pTipoCliente = request.getParameter("tipoCliente");

		String pCpfCnpj = request.getParameter("cpfCnpj");

		String pOperacao = request.getParameter("operacao");

		String pDeposito = request.getParameter("valorDeposito");

		String pSaque = request.getParameter("valorSaque");

		ContaBancaria cb = new ContaBancaria(null);
		if (pOperacao.equals("recuperarNomeCliente")) {
			request.setAttribute("resposta", pNome);
		} else if (pOperacao.equals("recuperarCpfCliente") && pTipoCliente.equals("pessoaFisica")) {
			request.setAttribute("resposta", pCpfCnpj);
		} else if (pOperacao.equals("recuperarCnpjCliente") && pTipoCliente.equals("pessoaJuridica")) {
			request.setAttribute("resposta", pCpfCnpj);
		} else if (pOperacao.equals("recuperarSaldo")) {
			request.setAttribute("resposta", cb.getSaldo());
		} else if (pOperacao.equals("depositarValor")) {
			int valor = Integer.parseInt(pDeposito);
			request.setAttribute("resposta", cb.depositar(valor));
		} else if (pOperacao.equals("sacarValor")) {
			int valor = Integer.parseInt(pSaque);
			request.setAttribute("resposta", cb.sacar(valor));
		} else if (pOperacao.equals("depositarSacarValor")) {
			int total = Integer.parseInt(pDeposito) - Integer.parseInt(pSaque);
			request.setAttribute("resposta", total);
		}

		request.getRequestDispatcher("resposta.jsp").forward(request, response);
	}
}

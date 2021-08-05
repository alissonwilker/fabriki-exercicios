import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Collections;

/**
 * Servlet implementation class BancoServlet
 */
@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		final String nomeCliente = request.getParameter("nomeCliente");
		final String tipoCliente = request.getParameter("tipoCliente");
		final String cpfCnpj = request.getParameter("cpfCnpj");


		final Cliente cliente = tipoCliente.equals("pessoaFisica")
				? new PessoaFisica(nomeCliente, cpfCnpj)
				: new PessoaJuridica(nomeCliente, cpfCnpj);


		final String operacao = request.getParameter("operacao");

		if (operacao.equals("recuperarNomeCliente")) {
			request.setAttribute("resposta", cliente.getNome());
		} else if (operacao.equals("recuperarCpfCliente")) {
			if (cliente instanceof PessoaFisica) {
				final PessoaFisica pessoaFisica = (PessoaFisica) cliente;
				request.setAttribute("resposta", pessoaFisica.getCpf());
			}
		} else if (operacao.equals("recuperarCnpjCliente")) {
			if (cliente instanceof PessoaJuridica) {
				final PessoaJuridica pessoaJuridica = (PessoaJuridica) cliente;
				request.setAttribute("resposta", pessoaJuridica.getCnpj());
			}
		} else {
			final ContaBancaria contaBancaria = new ContaBancaria(cliente);

			if (operacao.equals("recuperarSaldo")) {
				request.setAttribute("resposta", contaBancaria.getSaldo());
			} else if (operacao.equals("depositarValor")) {
				contaBancaria.depositar(Integer.parseInt(request.getParameter("valorDeposito")));
				request.setAttribute("resposta", contaBancaria.getSaldo());
			} else if (operacao.equals("sacarValor")) {
				contaBancaria.sacar(Integer.parseInt(request.getParameter("valorSaque")));
				request.setAttribute("resposta", contaBancaria.getSaldo());
			} else if (operacao.equals("depositarSacarValor")) {
				contaBancaria.depositar(Integer.parseInt(request.getParameter("valorDeposito")));
				contaBancaria.sacar(Integer.parseInt(request.getParameter("valorSaque")));
				request.setAttribute("resposta", contaBancaria.getSaldo());
			}
		}

		request.getRequestDispatcher("resposta.jsp").forward(request, response);;
	}

}

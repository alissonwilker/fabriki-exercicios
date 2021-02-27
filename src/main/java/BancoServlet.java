
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {

	enum Operacao {
		recuperarNomeCliente, recuperarCpfCliente, recuperarCnpjCliente, recuperarSaldo, depositarValor, sacarValor,
		depositarSacarValor
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nomeCliente = request.getParameter("nomeCliente");
		String cpfCnpj = request.getParameter("cpfCnpj");
		String valorDeposito = request.getParameter("valorDeposito");
		String valorSaque = request.getParameter("valorSaque");
		String tipoCliente = request.getParameter("tipoCliente");
		String operacao = request.getParameter("operacao");

		Operacao tOperacao = Enum.valueOf(Operacao.class, operacao);

		ContaBancaria conta = new ContaBancaria(null);

		if (tipoCliente.equals("pessoaFisica")) {
			conta = new ContaBancaria(new PessoaFisica(nomeCliente, cpfCnpj));
		} else {
			conta = new ContaBancaria(new PessoaJuridica(nomeCliente, cpfCnpj));
		}

		Object resposta = null;
		switch (tOperacao) {
		case recuperarNomeCliente:
			resposta = conta.getCliente().getNome();
			break;
		case recuperarCpfCliente:
			if (tipoCliente.equals("pessoaFisica")) {
				resposta = ((PessoaFisica) conta.getCliente()).getCpf();
			}
			break;
		case recuperarCnpjCliente:
			if (tipoCliente.equals("pessoaJuridica")) {
				resposta = ((PessoaJuridica) conta.getCliente()).getCnpj();
			}
			break;
		case recuperarSaldo:
			resposta = conta.getSaldo();
			break;
		case depositarValor:
			conta.depositar(Integer.parseInt(valorDeposito));
			resposta = conta.getSaldo();
			break;
		case sacarValor:
			resposta = conta.sacar(Integer.parseInt(valorSaque));
			break;
		case depositarSacarValor:
			conta.depositar(Integer.parseInt(valorDeposito));
			resposta = conta.sacar(Integer.parseInt(valorSaque));
			break;
		}

		request.setAttribute("resposta", resposta);
		request.getRequestDispatcher("resposta.jsp").forward(request, response);
	}

}

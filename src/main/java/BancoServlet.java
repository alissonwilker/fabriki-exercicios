import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String tipoCliente = request.getParameter("tipoCliente");

		if (tipoCliente.equals("pessoaFisica")) {
			String nomePessoaFisica = request.getParameter("nomeCliente");
			String CPFpessoaFisica = request.getParameter("cpfCnpj");
			PessoaFisica pessoaFisica = new PessoaFisica(nomePessoaFisica, CPFpessoaFisica);

			String operacao = request.getParameter("operacao");

			if (operacao.equals("recuperarNomeCliente")) {
				request.setAttribute("resposta", pessoaFisica.getNome());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}

			if (operacao.equals("recuperarCpfCliente")) {
				request.setAttribute("resposta",pessoaFisica.getCpf());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}

			if (operacao.equals("recuperarSaldo")) {
				ContaBancaria conta = new ContaBancaria(pessoaFisica);
				request.setAttribute("resposta",conta.getSaldo());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}

			if (operacao.equals("depositarValor")) {

				ContaBancaria conta = new ContaBancaria(pessoaFisica);
				int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
				conta.depositar(valorDeposito);
				request.setAttribute("resposta",conta.getSaldo());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}

			if (operacao.equals("sacarValor")) {
				ContaBancaria conta = new ContaBancaria(pessoaFisica);
				int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));
		        conta.sacar(valorSaque);		
				request.setAttribute("resposta", conta.getSaldo());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}

			if (operacao.equals("depositarSacarValor")) {
				ContaBancaria conta = new ContaBancaria(pessoaFisica);
				int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
				int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));
				conta.depositar(valorDeposito);
				conta.sacar(valorSaque);						
				request.setAttribute("resposta",conta.getSaldo());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}


		}


		if (tipoCliente.equals("pessoaJuridica")) {
			String nomePessoaJuridica = request.getParameter("nomeCliente");
			String CNPJpessoaJuridica = request.getParameter("cpfCnpj");
			PessoaJuridica pessoaJuridica = new PessoaJuridica(nomePessoaJuridica, CNPJpessoaJuridica);

			String operacao = request.getParameter("operacao");

			if (operacao.equals("recuperarNomeCliente")) {
				request.setAttribute("resposta", pessoaJuridica.getNome());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}

			if (operacao.equals("recuperarCnpjCliente")) {
				request.setAttribute("resposta",pessoaJuridica.getCnpj());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}

			if (operacao.equals("recuperarSaldo")) {
				ContaBancaria conta = new ContaBancaria(pessoaJuridica);
				request.setAttribute("resposta",conta.getSaldo());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}

			if (operacao.equals("depositarValor")) {
				ContaBancaria conta = new ContaBancaria(pessoaJuridica);
				int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
				conta.depositar(valorDeposito);
				request.setAttribute("resposta",conta.getSaldo());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}

			if (operacao.equals("sacarValor")) {
				ContaBancaria conta = new ContaBancaria(pessoaJuridica);
				int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));
		        conta.sacar(valorSaque);		
				request.setAttribute("resposta", conta.getSaldo());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}

			if (operacao.equals("depositarSacarValor")) {
				ContaBancaria conta = new ContaBancaria(pessoaJuridica);
				int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
				int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));	
				conta.depositar(valorDeposito);
				conta.sacar(valorSaque);				
				request.setAttribute("resposta",conta.getSaldo());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}


		}


	}

}

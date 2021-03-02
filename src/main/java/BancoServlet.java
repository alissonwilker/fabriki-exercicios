

import java.io.IOException;
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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String nome = request.getParameter("nomeCliente");
		String tipoCliente = request.getParameter("tipoCliente");
		String cpfcnpj = request.getParameter("cpfCnpj");
		String operacao = request.getParameter("operacao");
		
		if(tipoCliente.equals("pessoaFisica")) {
			PessoaFisica pessoaFisica = new PessoaFisica(nome, cpfcnpj);
			
			if(operacao.equals("recuperarNomeCliente")) {
				ContaBancaria novaConta = new ContaBancaria(pessoaFisica);
				request.setAttribute("resposta", pessoaFisica.getNome());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}
			
			//CPF
			if(operacao.equals("recuperarCpfCliente")) {
				request.setAttribute("resposta", pessoaFisica.getCpf());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}
			//Recuperar Saldo 
			if(operacao.equals("recuperarSaldo")) {
				ContaBancaria novaConta = new ContaBancaria(pessoaFisica);
				request.setAttribute("resposta", novaConta.getSaldo());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}
			//Depositar valor
			if(operacao.equals("depositarValor")) {
				ContaBancaria novaConta = new ContaBancaria(pessoaFisica);
				int valor = Integer.parseInt(request.getParameter("valorDeposito"));
				novaConta.depositar(valor);
				request.setAttribute("resposta", novaConta.getSaldo());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}
			//Sacar valor
			if(operacao.equals("sacarValor")) {
				ContaBancaria novaConta = new ContaBancaria(pessoaFisica);
				int valor = Integer.parseInt(request.getParameter("valorSaque"));
				novaConta.sacar(valor);
				request.setAttribute("resposta", novaConta.getSaldo());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}
			//Depositar um valor e em seguida sacar outro valor da conta.
			if(operacao.equals("depositarSacarValor")) {
				ContaBancaria novaConta = new ContaBancaria(pessoaFisica);
				int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
				novaConta.depositar(valorDeposito);
				int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));
				request.setAttribute("resposta", novaConta.sacar(valorSaque));
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}
		}else {
			PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, cpfcnpj);
			
			if(operacao.equals("recuperarNomeCliente")) {
				ContaBancaria novaConta = new ContaBancaria(pessoaJuridica);
				request.setAttribute("resposta", pessoaJuridica.getNome());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}
			
			if(operacao.equals("recuperarCnpjCliente")) {
				request.setAttribute("resposta", pessoaJuridica.getCnpj());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}
			
			if(operacao.equals("recuperarSaldo")) {
				ContaBancaria novaConta = new ContaBancaria(pessoaJuridica);
				request.setAttribute("resposta", novaConta.getSaldo());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}
			//Depositar valor
			if(operacao.equals("depositarValor")) {
				ContaBancaria novaConta = new ContaBancaria(pessoaJuridica);
				int valor = Integer.parseInt(request.getParameter("valorDeposito"));
				novaConta.depositar(valor);
				request.setAttribute("resposta", novaConta.getSaldo());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}
			//Sacar valor
			if(operacao.equals("sacarValor")) {
				ContaBancaria novaConta = new ContaBancaria(pessoaJuridica);
				int valor = Integer.parseInt(request.getParameter("valorSaque"));
				novaConta.sacar(valor);
				request.setAttribute("resposta", novaConta.getSaldo());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}
			
			//Depositar um valor e em seguida sacar outro valor da conta.
			if(operacao.equals("depositarSacarValor")) {
				ContaBancaria novaConta = new ContaBancaria(pessoaJuridica);
				int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
				novaConta.depositar(valorDeposito);
				int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));
				novaConta.sacar(valorSaque);
				request.setAttribute("resposta", novaConta.getSaldo());
				request.getRequestDispatcher("resposta.jsp").forward(request, response);
			}
		}
				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

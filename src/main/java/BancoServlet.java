import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet ("/BancoServlet")

public class BancoServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		String nome = request.getParameter("nomeCliente");
		
		String tipoCliente = request.getParameter("tipoCliente");
		
		String cpfCnpj = request.getParameter("cpfCnpj");
		
		String operacao = request.getParameter("operacao");
		
		String valorDeposito = request.getParameter("valorDeposito");
	      
		String valorSaque = request.getParameter("valorSaque");
		
		ContaBancaria conta = new ContaBancaria();
		
		if (operacao.equals("recuperarNomeCliente")) {
			request.setAttribute("resposta", nome);
		}
		
		if (operacao.equals("recuperarCnpjCliente") && tipoCliente.equals("pessoaJuridica")) {
			request.setAttribute("resposta", cpfCnpj);
		}
		
		if (operacao.equals("recuperarCpfCliente") && tipoCliente.equals("pessoaFisica")) {
			request.setAttribute("resposta", cpfCnpj);
		}
		
		if (operacao.equals("recuperarSaldo")) {
			
			request.setAttribute("resposta", conta.getSaldo());
		}
		
		if (operacao.equals("depositarValor")) {
			int deposito = Integer.parseInt(valorDeposito);
			request.setAttribute("resposta", conta.depositar(deposito));
		}
		
		if (operacao.equals("sacarValor")) {
			int saque = Integer.parseInt(valorSaque);
			request.setAttribute("resposta", conta.sacar(saque));
		}
		
		if (operacao.equals("depositarSacarValor")) {
			int deposito = Integer.parseInt(valorDeposito);
			int saque = Integer.parseInt(valorSaque);
			request.setAttribute("resposta", conta.depositar(deposito));
			request.setAttribute("resposta", conta.sacar(saque));
		}
		
		
		
		
		request.getRequestDispatcher("resposta.jsp").forward(request, response);
		
	   }
}

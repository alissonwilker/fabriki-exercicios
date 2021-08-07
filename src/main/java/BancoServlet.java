

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String Nusuario = request.getParameter("nomeCliente");
		String Tipocl = request.getParameter("tipoCliente");
		String CpfCnpj = request.getParameter("cpfCnpj");
		String Operacao = request.getParameter("operacao");
		String ValorDP = request.getParameter("valorDeposito");
		String ValorSQ = request.getParameter("valorSaque");
		
		ContaBancaria conta1 = new ContaBancaria(null);
		
		if(Operacao.equals("recuperarNomeCliente")) {
			request.setAttribute("resposta", Nusuario);
		}
		else if(Operacao.equals("recuperarCpfCliente") && Tipocl.equals("pessoaFisica")) {
			request.setAttribute("resposta", CpfCnpj);
		}
		else if(Operacao.equals("recuperarCnpjCliente") && Tipocl.equals("pessoaJuridica")) {
			request.setAttribute("resposta", CpfCnpj);
		}
		else if(Operacao.equals("recuperarSaldo")) {
			request.setAttribute("resposta", conta1.getSaldo());
		}
		else if(Operacao.equals("depositarValor")){
			int numero = Integer.parseInt(ValorDP);
			request.setAttribute("resposta", conta1.depositar(numero));
		}
		else if(Operacao.equals("sacarValor")){
			int numero = Integer.parseInt(ValorSQ);
			request.setAttribute("resposta", conta1.sacar(numero));
		}
		else if(Operacao.equals("depositarSacarValor")){
			int numero = Integer.parseInt(ValorDP)- Integer.parseInt(ValorSQ);
			request.setAttribute("resposta", numero);
		}
		request.getRequestDispatcher("resposta.jsp").forward(request, response);
		
	}

	

}

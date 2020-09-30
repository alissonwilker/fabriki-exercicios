//arquivo BancoServlet.java  (camada Controller)


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

/**
 * Servlet implementation class BancoServlet
 */
@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {
 
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		meuMetodo(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		meuMetodo(request, response);
	}
	
	public void meuMetodo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramNome = request.getParameter("nomeCliente");
		String paramTipo = request.getParameter("tipoCliente");
		String paramCpfCnpj = request.getParameter("cpfCnpj");
		String paramDeposito = request.getParameter("valorDeposito");
		String paramSaque = request.getParameter("valorSaque");
		String paramOperacao = request.getParameter("operacao");
		Cliente cliente;
		ContaBancaria conta;
		String out = "";
		if(paramTipo.equals("pessoaFisica")) {
			cliente = new PessoaFisica(paramNome, paramCpfCnpj);
			conta = new ContaBancaria(cliente);
			out = conta.realizar(paramNome, paramTipo, paramDeposito, paramSaque, paramOperacao);
		} else if (paramTipo.equals("pessoaJuridica")) {
			cliente = new PessoaJuridica(paramNome, paramCpfCnpj);
			conta = new ContaBancaria(cliente);
			out = conta.realizar(paramNome, paramTipo, paramDeposito, paramSaque, paramOperacao);
		}
		//ContaBancaria conta = new ContaBancaria(cliente);
		//String out = conta.realizar(paramNome, paramTipo, paramDeposito, paramSaque, paramOperacao);
		request.setAttribute("resposta", out); // insere o atributo resposta  
		RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp"); // aponta para resposta.jsp
		dispatcher.forward(request, response); // encaminha p/ JSP
		//PrintWriter out = response.getWriter();
				//out.println("<html><head/><body>O nome digitado é "
				//+ paramNome + "</body></html>");
	}
}


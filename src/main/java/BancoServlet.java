
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;


/**
 * Servlet implementation class Controlador
 */
@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    // @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String nome = request.getParameter("nomeCliente");
		String tipoCliente = request.getParameter("tipoCliente");
		String cpfCnpj = request.getParameter("cpfCnpj");
		String operacao = request.getParameter("operacao");
		String stringValorDeposito = request.getParameter("valorDeposito");
		String stringValorSaque = request.getParameter("valorSaque");
		
		int valorDeposito = Integer.parseInt(stringValorDeposito);
		int valorSaque = Integer.parseInt(stringValorSaque);

		Cliente cliente = new Cliente(nome);
		
		ContaBancaria cb = new ContaBancaria(cliente);
		
		if (operacao ==  "recuperarNomeCliente") {
			out.println("<div id='resposta'>" + nome + "</div>");
		} else if(operacao == "recuperarCpfCliente" || operacao ==  "recuperarCnpjCliente"){
			out.println("<div id='resposta'>" +  cpfCnpj + "</div>");
		} else if(operacao == "recuperarSaldo"){
			out.println("<div id='resposta'>" + cb.getSaldo() + "</div>" );
		} else if(operacao == "depositarValor"){
			cb.depositar(valorDeposito);
			out.println("<div id='resposta'>" + cb.getSaldo()  + "</div>");
		} else if(operacao == "sacarValor") {
			cb.sacar(valorSaque);
			out.println("<div id='resposta'>" + cb.getSaldo() + "</div>");
		} else if(operacao == "depositarSacarValor"){
			cb.depositar(valorDeposito);
			cb.sacar(valorSaque);
			out.println("<div id='resposta'>" + cb.getSaldo() + "</div>");
		} else {
			out.println("<div id='resposta'>" + nome + "</div>");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

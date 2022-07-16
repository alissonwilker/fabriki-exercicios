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

		int valorDeposito = 0;
		if(stringValorDeposito != "") {
			valorDeposito= Integer.parseInt(stringValorDeposito);			
		}

		int valorSaque = 0;
		if(stringValorSaque != "") {
			valorSaque = Integer.parseInt(stringValorSaque);			
		}

		Cliente cliente = new Cliente(nome);

		ContaBancaria cb = new ContaBancaria(cliente);

		String resposta = "";
		switch (operacao) {
			case "recuperarNomeCliente":
				resposta = nome;
				// out.println("<div id='resposta'>" + nome + "</div>");
				break;
			case "recuperarCpfCliente":
				resposta = cpfCnpj;
				// out.println("<div id='resposta'>" +  cpfCnpj + "</div>");					
				break;
			case "recuperarCnpjCliente":
				resposta = cpfCnpj;
				// out.println("<div id='resposta'>" + cpfCnpj + "</div>");					
				break;
			case "recuperarSaldo":
				resposta = "" + cb.getSaldo() ;

				// out.println("<div id='resposta'>" + cb.getSaldo() + "</div>" );
				break;
			case "depositarValor":
				cb.depositar(valorDeposito);
				resposta = "" + cb.getSaldo() ;

				// out.println("<div id='resposta'>" + cb.getSaldo()  + "</div>");
				break;
			case "sacarValor":
				cb.sacar(valorSaque);
				resposta = "" + cb.getSaldo() ;

				// out.println("<div id='resposta'>" + cb.getSaldo() + "</div>");
				break;
			case "depositarSacarValor":
				cb.depositar(valorDeposito);
				cb.sacar(valorSaque);
				resposta = "" + cb.getSaldo() ;

				// out.println("<div id='resposta'>" + cb.getSaldo() + "</div>");
				break;

			default:

				break;
		}

		request.setAttribute("resposta", resposta);
		request.getRequestDispatcher("resposta.jsp").forward(request, response); 

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

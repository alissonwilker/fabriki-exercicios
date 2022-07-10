
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
		
		int valorDeposito = (int) stringValorDeposito;
		int valorSaque = (int) stringValorSaque;

		Cliente cliente;
		if(tipoCliente == "tipoClientePessoaFisica"){
			cliente = new PessoaFisica(nome, cpfCnpj);
		} else if(tipoCliente == "tipoClientePessoaJuridica"){
			cliente = new PessoaJuridica(nome, cpfCnpj);
		}

		ContaBancaria cb = new ContaBancaria(cliente);

		// RequestDispatcher rd = getServletContext().getRequestDispatcher("/fabriki-exercicios.jsp");
		switch (operacao) {
			case "recuperarNomeCliente":
								
				// request.setAttribute( "resposta",    cliente.getNome() );
				// rd.forward(request,response);
				out.println("<div id='resposta'>" + cliente.getNome() + "</div>");
				break;
			case "recuperarCpfCliente":
				try {
					// out.println("<div id='resposta'>" + cliente.getCpf() + "</div>");
					out.println("<div id='resposta'>" + cpfCnpj + "</div>");
					
					// request.setAttribute( "resposta",    cliente.getCpf() );
					// rd.forward(request,response);
				} catch (Exception e) {
				}
				break;
			case "recuperarCnpjCliente":
				try {
					// out.println("<div id='resposta'>" + cliente.getCnpj() + "</div>");
					out.println("<div id='resposta'>" + cpfCnpj + "</div>");
					
					// request.setAttribute( "resposta",    cliente.getCnpj() );
					// rd.forward(request,response);
				} catch (Exception e) {
				}
				break;
			case "recuperarSaldo":
			
				// request.setAttribute( "resposta",    cb.getSaldo() );
				// rd.forward(request,response);
				out.println("<div id='resposta'>" + cb.getSaldo() + "</div>" );
				break;
			case "depositarValor":
				cb.depositar(valorDeposito);
				
				// request.setAttribute( "resposta",    cb.getSaldo() );
				// rd.forward(request,response);
				out.println("<div id='resposta'>" + cb.getSaldo()  + "</div>");
				break;
			case "sacarValor":
				cb.sacar(valorSaque);
				
				// request.setAttribute( "resposta",    cb.getSaldo() );
				// rd.forward(request,response);
				out.println("<div id='resposta'>" + cb.getSaldo() + "</div>");
				break;
			case "depositarSacarValor":
				cb.depositar(valorDeposito);
				cb.sacar(valorSaque);
				
				// request.setAttribute( "resposta",    cb.getSaldo() );
				// rd.forward(request,response);
				out.println("<div id='resposta'>" + cb.getSaldo() + "</div>");
				break;
		
			default:
				break;
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

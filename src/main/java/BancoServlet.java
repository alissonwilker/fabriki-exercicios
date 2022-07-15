
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
		String nome = request.getParameter("nome");
		String tipoCliente = request.getParameter("tipoCliente");
		String cpfCnpj = request.getParameter("cpfCnpj");
		String operacao = request.getParameter("operacao");
		String stringValorDeposito = request.getParameter("valorDeposito");
		String stringValorSaque = request.getParameter("valorSaque");
		
		int valorDeposito = Integer.parseInt(stringValorDeposito);
		int valorSaque = Integer.parseInt(stringValorSaque);

		Cliente cliente = new Cliente(nome);
		
		ContaBancaria cb = new ContaBancaria(cliente);
		
		switch (operacao) {
			case "recuperarNomeCliente":
				// out.println("<div id='resposta'>" + cliente.getNome() + "</div>");
				out.println("<div id='resposta'>" + nome + "</div>");
				break;
			case "recuperarCpfCliente":
				// // PessoaFisica pf = new PessoaFisica(nome, cpfCnpj);
				if(tipoCliente == "pessoaFisica"){
				// 	// out.println("<div id='resposta'>" +  pf.getCpf() + "</div>");
					out.println("<div id='resposta'>" +  cpfCnpj + "</div>");
				} else {
				 	out.println("<div id='resposta'></div>");
				}
				break;
			case "recuperarCnpjCliente":
				// // PessoaJuridica pj = new PessoaJuridica(nome, cpfCnpj);
				if(tipoCliente == "pessoaJuridica"){
				// 	// out.println("<div id='resposta'>" + pj.getCnpj() + "</div>");
					out.println("<div id='resposta'>" + cpfCnpj + "</div>");
				} else {
					out.println("<div id='resposta'></div>");

				}
				break;
			case "recuperarSaldo":
				out.println("<div id='resposta'>" + cb.getSaldo() + "</div>" );
				break;
			case "depositarValor":
				cb.depositar(valorDeposito);
				out.println("<div id='resposta'>" + cb.getSaldo()  + "</div>");
				break;
			case "sacarValor":
				cb.sacar(valorSaque);
				out.println("<div id='resposta'>" + cb.getSaldo() + "</div>");
				break;
			case "depositarSacarValor":
				cb.depositar(valorDeposito);
				cb.sacar(valorSaque);
				out.println("<div id='resposta'>" + cb.getSaldo() + "</div>");
				break;
		
			default:
				out.println("<div id='resposta'>" + nome + "</div>");

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

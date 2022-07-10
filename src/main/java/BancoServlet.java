

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
// @WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String nome = request.getParameter("nome");
		String tipoCliente = request.getParameter("tipoCliente");
		String cpfCnpj = request.getParameter("cpfCnpj");
		String operacao = request.getParameter("operacao");
		String valorDeposito = request.getParameter("valorDeposito");
		String valorSaque = request.getParameter("valorSaque");
		
		if(tipoCliente == "tipoClientePessoaFisica"){
			Cliente cliente = new PessoaFisica(nome, cpfCnpj);
		} else if(tipoCliente == "tipoClientePessoaJuridica"){
			Cliente cliente = new PessoaJuridica(nome, cpfCnpj);
		}

		ContaBancaria cb = new ContaBancaria(cliente);

		switch (operacao) {
			case operacaoRecuperarNomeCliente:
				out.println(cliente.getNome());
				break;
			case operacaoRecuperarCpfCliente:
				try {
					out.println(cliente.getCpf());
				} catch (Exception e) {
				}
				break;
			case operacaoRecuperarCnpjCliente:
				try {
					out.println(cliente.getCnpj());
				} catch (Exception e) {
				}
				break;
			case operacaoRecuperarSaldo:
				out.println(cb.getSaldo());
				break;
			case operacaoDepositarValor:
				out.println(cb.depositar(valorDeposito));
				break;
			case operacaoSacarValor:
				out.println(cb.sacar(valorSaque));
				break;
			case operacaoDepositarSacarValor:
				out.println(cb.depositar(valorDeposito));
				out.println(cb.sacar(valorSaque));
				break;
		
			default:
				break;
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// out.println("AQI");
		doGet(request, response);
	}

}

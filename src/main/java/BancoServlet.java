package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cliente;
import model.ContaBancaria;
import model.PessoaFisica;
import model.PessoaJuridica;

@WebServlet(urlPatterns = "/BancoServlet")
public class BancoServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cliente cliente;
		PessoaJuridica pessoaJuridica = null;
		PessoaFisica pessoaFisica = null;
		
		
		String nomeCliente = req.getParameter("nomeCliente");
		String tipoCliente = req.getParameter("tipoCliente");
		String cpfCnpj = req.getParameter("cpfCnpj");
		Integer valorDeposito = 0;
		Integer valorSaque = 0;
		
		if(!req.getParameter("valorDeposito").isBlank()) {
			valorDeposito = Integer.valueOf(req.getParameter("valorDeposito"));	
		}
		if(!req.getParameter("valorSaque").isBlank()) {
			valorSaque = Integer.valueOf(req.getParameter("valorSaque"));	
		}
		 
		
		pessoaFisica = new PessoaFisica(nomeCliente, cpfCnpj);
		cliente = pessoaFisica;
		
		if (tipoCliente.equals("pessoaJuridica")) {
			pessoaJuridica = new PessoaJuridica(nomeCliente, cpfCnpj);
			cliente = pessoaJuridica;
		}
		
		ContaBancaria contaBancaria = new ContaBancaria(cliente);
		
		String operacao = req.getParameter("operacao");

		String resposta = "";

		switch (operacao) {

		case "recuperarNomeCliente":
			resposta = cliente.getNome();
			break;

		case "recuperarCpfCliente":
			if (tipoCliente.equals("pessoaFisica")) {
				resposta = pessoaFisica.getCpf();
			} else {
				resposta = "";
			}
			break;
		case "recuperarCnpjCliente":
			if (tipoCliente.equals("pessoaJuridica")) {
				resposta = pessoaJuridica.getCnpj();
			} else {
				resposta = "";
			}
			break;
		case "recuperarSaldo":
			resposta = String.valueOf(contaBancaria.getSaldo());
			break;
		case "depositarValor":
			
			contaBancaria.depositar(valorDeposito); 
			resposta = String.valueOf(contaBancaria.getSaldo());
			break;
		case "sacarValor":
			resposta = String.valueOf(contaBancaria.sacar(valorSaque));
			break;
		case "depositarSacarValor":
			contaBancaria.depositar(valorDeposito);
			resposta = String.valueOf(contaBancaria.sacar(valorSaque));
			break;

		default:
			break;
		}

		req.setAttribute("resposta", resposta);
		RequestDispatcher rd = req.getRequestDispatcher("/resposta.jsp");
		rd.forward(req, resp);
	}
}

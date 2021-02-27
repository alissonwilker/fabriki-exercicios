import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.servlet.http.*; 
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Contained;

@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String nomeCliente = request.getParameter("nomeCliente");
		
		String tipoCliente = request.getParameter("tipoCliente");
		
		String cpfCnpj = request.getParameter("cpfCnpj");
		
		String operacao = request.getParameter("operacao");
	
		
		String valorDeposito = request.getParameter("valorDeposito");
		int vade = Integer.valueOf(valorDeposito);
		
		
		
		String valorSaque = request.getParameter("valorSaque");
		int vasa = Integer.valueOf(valorSaque);
		
	
		
		
		HttpSession sessao = request.getSession();
		
			
			ContaBancaria pf = new ContaBancaria(new PessoaFisica(nomeCliente,cpfCnpj));
			ContaBancaria pj = new ContaBancaria(new PessoaJuridica(nomeCliente,cpfCnpj));
		
		switch (operacao) {
		case "recuperarNomeCliente":
			
				sessao.setAttribute("resposta", pf.getCliente().getNome() );

			break;
		case "recuperarCpfCliente":
			
			
				PessoaFisica p = new PessoaFisica(nomeCliente,cpfCnpj);
				sessao.setAttribute("resposta", p.getCpf() );
			
			
			break;
		case "recuperarCnpjCliente":
			
			
				PessoaJuridica pjj = new PessoaJuridica(nomeCliente,cpfCnpj);
				sessao.setAttribute("resposta", pjj.getCnpj() );
				
			
			
			
			break;
		case "recuperarSaldo":
			sessao.setAttribute("resposta", pj.getSaldo() );
			sessao.setAttribute("resposta", pf.getSaldo() );
			
			break;
		case "depositarValor":
			
			sessao.setAttribute("resposta", pj.depositar(vade));
		    sessao.setAttribute("resposta", pf.depositar(vade));
			
			break;
		case "sacarValor":
			
			sessao.setAttribute("resposta", pj.sacar(vasa));
			sessao.setAttribute("resposta", pf.sacar(vasa));
			
		break;
		case "depositarSacarValor":
			sessao.setAttribute("resposta", pj.depositar(vade));
			sessao.setAttribute("resposta", pf.depositar(vade));
			sessao.setAttribute("resposta", pj.sacar(vasa));
			sessao.setAttribute("resposta", pf.sacar(vasa));
			break;
			
		default:
			break;
		}
		
		
		
		
		
		
		
		request.getRequestDispatcher("resposta.jsp").forward(request, response);
	}
}

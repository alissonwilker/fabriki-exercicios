import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/BancoServlet")

public class BancoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String nome = request.getParameter("nomeCliente");
		String tipoCliente = request.getParameter("tipoCliente");
		String cpfCnpj = request.getParameter("cpfCnpj");
		String operacao = request.getParameter("operacao");
		String valorDeposito = request.getParameter("valorDeposito");
		String valorSaque = request.getParameter("valorSaque");
		
		String resposta = null;
		
		ContaBancaria contaBancaria;
		
        if (tipoCliente.equals("pessoaFisica")) {
            contaBancaria = new ContaBancaria(new PessoaFisica(nome, cpfCnpj));
        } else {
            contaBancaria = new ContaBancaria(new PessoaJuridica(nome, cpfCnpj));
        }
		
		switch (operacao) {
		
		case "recuperarNomeCliente":
            resposta = contaBancaria.getCliente().getNome();
			break;
			
		case "recuperarCpfCliente":
			if (tipoCliente.equals("pessoaFisica")) {
                
			resposta = ((PessoaFisica) contaBancaria.getCliente()).getCpf();
            }
			break;
			
		case "recuperarCnpjCliente":
			if (tipoCliente.equals("pessoaJuridica")) {
            
			resposta = ((PessoaJuridica) contaBancaria.getCliente()).getCnpj();
            }
			break;
			
		case "recuperarSaldo":
			resposta = Integer.toString(contaBancaria.getSaldo());
			break;
			
		case "depositarValor":
			contaBancaria.depositar(Integer.parseInt(valorDeposito));
			resposta = Integer.toString(contaBancaria.getSaldo());
			break;
			
		case "sacarValor":
			contaBancaria.sacar(Integer.parseInt(valorSaque));
			resposta = Integer.toString(contaBancaria.getSaldo());
			break;
			
		case "depositarSacarValor":
			contaBancaria.depositar(Integer.parseInt(valorDeposito));
			contaBancaria.sacar(Integer.parseInt(valorSaque));
			resposta = Integer.toString(contaBancaria.getSaldo());
			break;
			
			}
		request.setAttribute("resposta", resposta);
		request.getRequestDispatcher("resposta.jsp").forward(request, response);
		}
	}

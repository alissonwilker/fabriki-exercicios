import javax.servlet.*; 
import javax.servlet.http.*; 
import java.io.*; 
import javax.servlet.annotation.WebServlet;

	
@WebServlet("/BancoServlet")	
	public class BancoServlet extends HttpServlet {
	  
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	     
		Cliente cliente = null;
		String nome = request.getParameter("nomeCliente");
		String numcpfcnpj = request.getParameter("cpfCnpj");
		
		String tipocl = request.getParameter("tipoCliente");
		if (tipocl.equals("pessoaFisica")) {
			cliente = new PessoaFisica(nome, numcpfcnpj);
		} else {
			cliente = new PessoaJuridica(nome, numcpfcnpj);
		}
		
		String operacao = request.getParameter("operacao");
		ContaBancaria conta = new ContaBancaria(cliente);
		if (operacao.equals("recuperarNomeCliente")) {
			request.setAttribute("resposta", cliente.getNome()); 		
		} else if (operacao.equals("recuperarCpfCliente")) {
			request.setAttribute("resposta", ((PessoaFisica)cliente).getCpf()); 
		} else if (operacao.equals("recuperarCpfCliente")) {
			request.setAttribute("resposta", ((PessoaFisica)cliente).getCpf()); 			
		} else if (operacao.equals("recuperarCnpjCliente")) {
			request.setAttribute("resposta", ((PessoaJuridica)cliente).getCnpj()); 	
		} else if (operacao.equals("recuperarSaldo")) {
			request.setAttribute("resposta", conta.getSaldo()); 
		} else if (operacao.equals("depositarValor")) {
			int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
			request.setAttribute("resposta", conta.depositar(valorDeposito)); 
		} else if (operacao.equals("sacarValor")) {
			int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));
			request.setAttribute("resposta", conta.sacar(valorSaque));
		} else if (operacao.equals("depositarSacarValor")) {
			int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
			conta.depositar(valorDeposito); 
			int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));
			request.setAttribute("resposta", conta.sacar(valorSaque));
		}	
		
	
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp"); 
	    dispatcher.forward(request, response);   
	
	}
	}

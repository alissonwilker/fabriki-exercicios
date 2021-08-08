import javax.servlet.*; 
import javax.servlet.http.*; 
import java.io.*; 
import javax.servlet.annotation.WebServlet;

	
@WebServlet("/BancoServlet")	
	public class BancoServlet extends HttpServlet {
	  
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	     
		Cliente cliente = null;
		String respNome = request.getParameter("nomeCliente");
		String respID = request.getParameter("cpfCnpj");
		
		String tipoCliente = request.getParameter("tipoCliente");
		if (tipoCliente.equals("pessoaFisica")) {
			cliente = new PessoaFisica(respNome, respID);
		} else {
			cliente = new PessoaJuridica(respNome, respID);
		}
		
		String operacao = request.getParameter("operacao");
		ContaBancaria conta = new ContaBancaria(cliente);
		if (operacao.equals("recuperarNomeCliente")) {
			request.setAttribute("resposta", cliente.getNome()); // insere atributo na JPS			
		} else if (operacao.equals("recuperarCpfCliente")) {
			request.setAttribute("resposta", ((PessoaFisica)cliente).getCpf()); // insere atributo na JPS
		} else if (operacao.equals("recuperarCpfCliente")) {
			request.setAttribute("resposta", ((PessoaFisica)cliente).getCpf()); // insere atributo na JPS			
		} else if (operacao.equals("recuperarCnpjCliente")) {
			request.setAttribute("resposta", ((PessoaJuridica)cliente).getCnpj()); // insere atributo na JPS	
		} else if (operacao.equals("recuperarSaldo")) {
			request.setAttribute("resposta", conta.getSaldo()); // insere atributo na JPS	
		} else if (operacao.equals("depositarValor")) {
			int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
			request.setAttribute("resposta", conta.depositar(valorDeposito)); // insere atributo na JPS
		} else if (operacao.equals("sacarValor")) {
			int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));
			request.setAttribute("resposta", conta.sacar(valorSaque));
		} else if (operacao.equals("depositarSacarValor")) {
			int valorDeposito = Integer.parseInt(request.getParameter("valorDeposito"));
			conta.depositar(valorDeposito); 
			int valorSaque = Integer.parseInt(request.getParameter("valorSaque"));
			request.setAttribute("resposta", conta.sacar(valorSaque));
		}	
		
	
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp"); // aponta p/ hora.jsp
	    dispatcher.forward(request, response); // encaminha p/ JSP   
	
	}
	}

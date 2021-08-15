import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String tipocl = request.getParameter("tipoCliente");
		String nome = request.getParameter ("nomeCliente");
		String numcpfcnpj = request.getParameter ("cpfCnpj");
		String op = request.getParameter ("operacao");
		String dep = request.getParameter ("valorDeposito");
	    String saq = request.getParameter ("valorSaque");
	    
	    Cliente cliente;
	    ContaBancaria conta;
	    
	    if (tipocl.equals("pessoaFisica")) {
				cliente = new PessoaFisica(nome, numcpfcnpj);
				conta = new ContaBancaria(cliente);
			} else {
				cliente = new PessoaJuridica(nome, numcpfcnpj);
				conta = new ContaBancaria(cliente);
			}
		
	    if (op.equals("recuperarNomeCliente")) {
			request.setAttribute("resposta", cliente.getNome()); 
		} else if (op.equals("recuperarCpfCliente")) {
			request.setAttribute("resposta", ((PessoaFisica)cliente).getCpf()); 
		} else if (op.equals("recuperarCnpjCliente")) {
			request.setAttribute("resposta", ((PessoaJuridica)cliente).getCnpj()); 
		} else if (op.equals("recuperarSaldo")) {
			request.setAttribute("resposta", conta.getSaldo()); 
		} else if (op.equals("depositarValor")) {
			request.setAttribute("resposta",conta.depositar(Integer.parseInt(dep))); 
		} else if (op.equals("sacarValor")) {
			request.setAttribute("resposta", 
				conta.sacar(Integer.parseInt(saq)));
		} else {
			conta.depositar(conta.depositar(Integer.parseInt(dep))); 
			request.setAttribute("resposta", conta.sacar(Integer.parseInt(saq)));
		}	
	    
	    RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp");
	    dispatcher.forward(request, response);
	}

}

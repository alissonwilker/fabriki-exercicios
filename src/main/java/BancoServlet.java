import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {
	  
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
				
    String nome = request.getParameter("nomeCliente");
    String tipo = request.getParameter("tipoCliente");
    String cpfcnpj = request.getParameter("cpfCnpj");
    String op = request.getParameter("operacao");
    String valor = request.getParameter("valorDeposito");
    String saque = request.getParameter("valorSaque");
          
    Cliente pf = new PessoaFisica(nome, cpfcnpj);
    Cliente pj = new PessoaJuridica(nome, cpfcnpj);
    ContaBancaria contaPF = new ContaBancaria(pf);
    ContaBancaria contaPJ = new ContaBancaria(pj);
          
	    if("pessoaFisica".equals(tipo) && "recuperarNomeCliente".equals(op)) {
	    	
	    	request.setAttribute("resposta", pf.getNome()); 
	      
	    	RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp");
	      
	    	dispatcher.forward(request, response); 
		    	
	    }
	    
	    if("pessoaJuridica".equals(tipo) && "recuperarNomeCliente".equals(op)) {
	    	
	    	request.setAttribute("resposta", pj.getNome()); 
	      
	    	RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp");
	      
	    	dispatcher.forward(request, response); 
		    	
	    }
	    
	    if("recuperarCpfCliente".equals(op)) {
	    	
	    	request.setAttribute("resposta", cpfcnpj); 
	      
	    	RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp");
	      
	    	dispatcher.forward(request, response); 
		    	
	    }
	    
	    if("recuperarCnpjCliente".equals(op)) {
	    	
	    	request.setAttribute("resposta", cpfcnpj); 
	      
	    	RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp");
	      
	    	dispatcher.forward(request, response); 
		    	
	    }
	    
	    if("pessoaFisica".equals(tipo) && "recuperarSaldo".equals(op)) {
	    	
	    	request.setAttribute("resposta", contaPF.getSaldo()); 
	      
	    	RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp");
	      
	    	dispatcher.forward(request, response); 
		    	
	    }
	    
	    if("pessoaJuridica".equals(tipo) && "recuperarSaldo".equals(op)) {
	    	
	    	request.setAttribute("resposta", contaPJ.getSaldo()); 
	      
	    	RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp");
	      
	    	dispatcher.forward(request, response); 
		    	
	    }
	    
	    if("pessoaFisica".equals(tipo) && "depositarValor".equals(op)) {
	    	
	    	int resultadoValor = Integer.parseInt(valor);
	    	request.setAttribute("resposta", contaPF.depositar(resultadoValor)); 
	      
	    	RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp");
	      
	    	dispatcher.forward(request, response); 
		    	
	    }
	    
	    if("pessoaJuridica".equals(tipo) && "depositarValor".equals(op)) {

	    	int resultadoValor = Integer.parseInt(valor);
	    	
	    	request.setAttribute("resposta", contaPJ.depositar(resultadoValor)); 
	      
	    	RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp");
	      
	    	dispatcher.forward(request, response); 
		    	
	    }
	    
	    if("pessoaFisica".equals(tipo) && "sacarValor".equals(op)) {


	    	int resultadoSaque = Integer.parseInt(saque);
	    	
	    	request.setAttribute("resposta", contaPF.sacar(resultadoSaque)); 
	      
	    	RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp");
	      
	    	dispatcher.forward(request, response); 
		    	
	    }
	    
	    if("pessoaJuridica".equals(tipo) && "sacarValor".equals(op)) {
	    	

	    	int resultadoSaque = Integer.parseInt(saque);
	    	
	    	request.setAttribute("resposta", contaPJ.sacar(resultadoSaque)); 
	      
	    	RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp");
	      
	    	dispatcher.forward(request, response); 
		    	
	    }
	    
	    if("pessoaFisica".equals(tipo) && "depositarValor".equals(op) && "depositarSacarValor".equals(op)) {

	    	int resultadoValor = Integer.parseInt(valor);
	    	request.setAttribute("resposta", contaPF.depositar(resultadoValor)); 
	      
	    	RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp");
	      
	    	dispatcher.forward(request, response); 

	    	int resultadoSaque = Integer.parseInt(saque);
	    	
	    	request.setAttribute("resposta", contaPF.sacar(resultadoSaque)); 
	      
	    	RequestDispatcher dispatcher2 = request.getRequestDispatcher("resposta.jsp");
	      
	    	dispatcher2.forward(request, response); 
		    	
	    }
	    
	    if("pessoaJuridica".equals(tipo) && "depositarValor".equals(op) && "depositarSacarValor".equals(op)) {
	    	
	    	int resultadoValor = Integer.parseInt(valor);
	    	request.setAttribute("resposta", contaPJ.depositar(resultadoValor)); 
	      
	    	RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp");
	      
	    	dispatcher.forward(request, response); 

	    	int resultadoSaque = Integer.parseInt(saque);
	    	
	    	request.setAttribute("resposta", contaPJ.sacar(resultadoSaque)); 
	      
	    	RequestDispatcher dispatcher2 = request.getRequestDispatcher("resposta.jsp");
	      
	    	dispatcher2.forward(request, response); 
		    	
	    }

	}
}

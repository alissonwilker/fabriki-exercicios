import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import contaBancaria.*;

public class BancoServlet extends HttpServlet {
	  
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
				
    String nome = request.getParameter("nomeCliente");
    String tipoPF = request.getParameter("TipoClientePessoaFisica");
//    String tipoPJ = request.getParameter("tipoClientePessoaJuridica");
    String cpfcnpj = request.getParameter("cpfCnpj");
    String op = request.getParameter("operacao");
    
    Cliente pf = new PessoaFisica(nome, cpfcnpj);
    Cliente pj = new PessoaJuridica(nome, cpfcnpj);
   
    if(op == "RecuperarNomeCliente") {
    	
    	request.setAttribute("resposta", pf.getNome()); 
      
    	RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp");
      
    	dispatcher.forward(request, response); 
	    	
    }

//    if(!cpfcnpj.isEmpty()) {
//    	
//    	request.setAttribute("resposta", cpfcnpj); 
//      
//    	RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp");
//      
//    	dispatcher.forward(request, response); 
//	    	
//    }
//    
    
    
    
//    switch ("operacao") {
//    	case "recuperarNomeCliente":
//    		System.out.println();
//    }
//    
    
//	request.setAttribute("nomeCliente", nome); // insere atributo
//     
//    RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp");
//     
//    dispatcher.forward(request, response); // encaminha p/ JSP  
	}
}

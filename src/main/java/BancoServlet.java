import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class BancoServlet extends HttpServlet {
	  
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
				
    String nome = request.getParameter("nomeCliente");
    String cpf = request.getParameter("cpfcnpj");
    
    PessoaFisica pf = new PessoaFisica(nome, cpf);
    ContaBancaria conta = new ContaBancaria(pf);
    
    System.out.println(pf.getNome());
    System.out.println(pf.getCpf());
    System.out.println(conta.getId());
    System.out.println(conta.getCliente());
    
//    PrintWriter out = response.getWriter();
//    
//    out.println("<html><head/><body>O nome digitado � " + nome + "</body></html>");
    
    
    
	request.setAttribute("nomeCliente", nome); // insere atributo
     
    RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp");
     
    dispatcher.forward(request, response); // encaminha p/ JSP  
	}
}

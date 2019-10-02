// arquivo MinhaServlet.java contendo lógica da aplicação
import javax.servlet.*; import javax.servlet.http.*; import java.io.*;
public class BancoServlet extends HttpServlet {
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    
     RequestDispatcher dispatcher = request.getRequestDispatcher("hora.jsp"); // aponta p/ hora.jsp
     dispatcher.forward(request, response); // encaminha p/ JSP   
}}

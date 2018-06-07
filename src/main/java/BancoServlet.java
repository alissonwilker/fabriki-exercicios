
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BancoServlet
 */
@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BancoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String paramNome = request.getParameter("pNome");
		PrintWriter out = response.getWriter();
		out.println("<html><head><body>O nome digitado e" + paramNome +"</body></html>")
		
		String paramSaldo = request.getParameter("pSaldo");
		PrintWriter out = response.getWriter();
		out.println("<html><head><body>O saldo da conta e" + paramSaldo +"</body></html>")
		
		String paramCpf_Cnpj = request.getParameter("pCpf_Cnpj");
		PrintWriter out = response.getWriter();
		out.println("<html><head><body>O Cpf/Cnpj e" + paramCpf_Cnpj +"</body></html>")
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
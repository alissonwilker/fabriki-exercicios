// arquivo MinhaServlet.java contendo lógica da aplicação
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/BancoServlet")	
public class BancoServlet extends HttpServlet {
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	   String tipoCliente = request.getParameter("tipoCliente");
	   String nomeCliente = request.getParameter("nomeCliente");
	   String cpfCnpj = request.getParameter("cpfCnpj");
	   String operacao = request.getParameter("operacao");
	   String valorDeposito = request.getParameter("valorDeposito");
	   String valorSaque = request.getParameter("valorSaque");
	   
	   
	   if (tipoCliente.equals("pessoaJuridica")) {
		   PessoaJuridica clienteJuridico = new PessoaJuridica(nomeCliente, cpfCnpj);
		   ContaBancaria contaBancaria = new ContaBancaria(clienteJuridico);
		   
		   if (operacao.equals("recuperarNomeCliente")) {
				request.setAttribute("resposta", clienteJuridico.getNome());
			}  
		   else if (operacao.equals("recuperarCnpjCliente")) {
				request.setAttribute("resposta", clienteJuridico.getCnpj());
			}
					   
			else if (operacao.equals("recuperarSaldo")) 
				request.setAttribute("resposta", contaBancaria.getSaldo());
			
		   
			else if (operacao.equals("depositarValor")) 
				request.setAttribute("resposta", contaBancaria.depositar(Integer.parseInt(valorDeposito)));
		   
			else if(operacao.equals("sacarValor"))
				request.setAttribute("resposta", contaBancaria.sacar(Integer.parseInt(valorSaque)));
		   
			else if(operacao.equals("depositarSacarValor")) {
				contaBancaria.depositar(Integer.parseInt(valorDeposito));
				request.setAttribute("resposta",contaBancaria.sacar(Integer.parseInt(valorSaque)));
			}

		};
		
		if (tipoCliente.equals("pessoaFisica")) {
			   PessoaFisica clienteFisico = new PessoaFisica(nomeCliente, cpfCnpj);
			   ContaBancaria contaBancaria = new ContaBancaria(clienteFisico);
			   
			   if (operacao.equals("recuperarNomeCliente")) 
					request.setAttribute("resposta", clienteFisico.getNome());
					
				 else if (operacao.equals("recuperarCpfCliente")) 
					request.setAttribute("resposta", clienteFisico.getCpf());
				
			   
				else if (operacao.equals("recuperarSaldo")) 
					request.setAttribute("resposta", contaBancaria.getSaldo());
				
			   
				else if (operacao.equals("depositarValor")) 
					request.setAttribute("resposta", contaBancaria.depositar(Integer.parseInt(valorDeposito)));
			   
				else if(operacao.equals("sacarValor"))
					request.setAttribute("resposta", contaBancaria.sacar(Integer.parseInt(valorSaque)));
			   
				else if(operacao.equals("depositarSacarValor")) {
					contaBancaria.depositar(Integer.parseInt(valorDeposito));
					request.setAttribute("resposta",contaBancaria.sacar(Integer.parseInt(valorSaque)));
				}
					
				
		};
		
		
		   RequestDispatcher reqDispatcher = request.getRequestDispatcher("resposta.jsp");	   
			reqDispatcher.forward(request, response);
			
	   
	        

}}

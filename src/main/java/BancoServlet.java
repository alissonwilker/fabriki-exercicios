import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/BancoServlet")
public class BancoServlet extends HttpServlet {
	
	private PessoaFisica pf;
	private PessoaJuridica pj;
	private ContaBancaria conta;
	//private String resposta = "";
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
				
    String nome = req.getParameter("nomeCliente");
    String tipo = req.getParameter("tipoCliente");
    String cpfcnpj = req.getParameter("cpfCnpj");
    String op = req.getParameter("operacao");
    Integer valor = (req.getParameter("valorDeposito").equals(""))? 0 : Integer.parseInt(req.getParameter("valorDeposito"));
	Integer saque = (req.getParameter("valorSaque").equals(""))? 0 : Integer.parseInt(req.getParameter("valorSaque"));
        
    if(tipo.equals("pessoaFisica")) {
    	PessoaFisica pf = new PessoaFisica(nome, cpfcnpj);
    	ContaBancaria conta = new ContaBancaria(pf);
    	nome = pf.getNome();
    } else {
    	PessoaJuridica pj = new PessoaJuridica(nome, cpfcnpj);
        ContaBancaria conta = new ContaBancaria(pj);
        nome = pj.getNome();
    }
    
    switch (op) {
    
    	case "recuperarNomeCliente":
    	req.setAttribute("resposta", nome);
    	break;
    	
    	case "recuperarCpfCliente":
    	req.setAttribute("resposta", cpfcnpj);
    	break;
    	
    	case "recuperarCnpjCliente":
    	req.setAttribute("resposta", cpfcnpj);
    	break;
    	
    	case "recuperarSaldo":
    	int saldo = conta.getSaldo();
    	req.setAttribute("resposta", saldo);
    	break;
    	
    	case "depositarValor":
    	conta.depositar(valor);
    	int saldo2 = conta.getSaldo();
    	req.setAttribute("resposta", saldo2);
    	break;
    	
    	case "sacarValor":
    	conta.sacar(saque);
    	int saldo3 = conta.getSaldo();
    	req.setAttribute("resposta", saldo3);
    	break;
    	
    	case "depositarSacarValor":
    	conta.depositar(valor);
    	conta.sacar(saque);
    	int saldo4 = conta.getSaldo();
    	req.setAttribute("resposta", saldo4);
    	break;
    	
    }
          
	RequestDispatcher dispatcher = req.getRequestDispatcher("resposta.jsp");
	      
	dispatcher.forward(req, resp);
	
	}
}

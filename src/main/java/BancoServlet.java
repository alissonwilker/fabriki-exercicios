import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BancoServlet extends HttpServlet {
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        Cliente cliente = newCliente(httpServletRequest);
        String tipoPessoa = httpServletRequest.getParameter("tipoCliente");
        String op = httpServletRequest.getParameter("operacao");
        ContaBancaria conta = newConta(cliente);

        
        switch (op) {
            case "recuperarNomeCliente":
                httpServletRequest.setAttribute("resposta", cliente.getNome());
                break;
            case "recuperarCpfCliente":
                if (tipoPessoa.equalsIgnoreCase("pessoaFisica")) {
                    httpServletRequest.setAttribute("resposta", ((PessoaFisica)cliente).getCpf());
                }else {
                    httpServletRequest.setAttribute("resposta", "");
                }
                break;
            case "recuperarCnpjCliente":
                if (tipoPessoa.equalsIgnoreCase("pessoaJuridica")) {
                    httpServletRequest.setAttribute("resposta", ((PessoaJuridica) cliente).getCnpj());
                }else {
                    httpServletRequest.setAttribute("resposta", "");
                }
                break;
            case "recuperarSaldo":
                httpServletRequest.setAttribute("resposta", conta.getSaldo());
                break;
            case "depositarValor":
                try{
                    Integer valorDeposito = Integer.parseInt(httpServletRequest.getParameter("valorDeposito"));
                    httpServletRequest.setAttribute("resposta", conta.depositar(valorDeposito));
                }catch (Exception ex) {
                    httpServletRequest.setAttribute("resposta", conta.getSaldo());
                }
                break;
            case "sacarValor":
                try{
                    Integer valorSaque = Integer.parseInt(httpServletRequest.getParameter("valorSaque"));
                    httpServletRequest.setAttribute("resposta", conta.sacar(valorSaque));
                }catch (Exception ex) {
                    httpServletRequest.setAttribute("resposta", conta.getSaldo());
                }
                break;
            case "depositarSacarValor":
                try{
                    Integer valorDeposito = Integer.parseInt(httpServletRequest.getParameter("valorDeposito"));
                    Integer valorSacar = Integer.parseInt(httpServletRequest.getParameter("valorSaque"));
                    conta.depositar(valorDeposito);
                    httpServletRequest.setAttribute("resposta", conta.sacar(valorSacar));
                }catch (Exception ex) {
                    httpServletRequest.setAttribute("resposta", conta.getSaldo());
                }
                break;
        }
        RequestDispatcher dispatch = httpServletRequest.getRequestDispatcher("resposta.jsp");
        dispatch.forward(httpServletRequest, httpServletResponse);
    }

    private Cliente newCliente(HttpServletRequest request) {
        String tipoPessoa = request.getParameter("tipoCliente");
        Cliente cliente;
        if (tipoPessoa.equalsIgnoreCase("pessoaFisica")) {
            cliente = new PessoaFisica(
                    request.getParameter("nomeCliente"),
                    request.getParameter("cpfCnpj")
            );
        }else {
            cliente = new PessoaJuridica(
                    request.getParameter("nomeCliente"),
                    request.getParameter("cpfCnpj")
            );
        }

        return cliente;
    }

    private ContaBancaria newConta(Cliente cliente) {
        return new ContaBancaria(cliente);
    }
}

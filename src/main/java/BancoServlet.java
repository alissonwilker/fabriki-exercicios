/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BancoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String resposta = "";

            ContaBancaria conta = new ContaBancaria();

            String operacao = request.getParameter("operacao");

            switch (operacao) {
                case "recuperarNomeCliente":
                    resposta = conta.recuperaNome(request.getParameter("nomeCliente"));
                    break;
                case "recuperarCpfCliente":
                    if (request.getParameter("tipoCliente").equals("pessoaFisica")) {
                        resposta = conta.recuperaCPF(request.getParameter("cpfCnpj"));
                    }

                    break;
                case "recuperarCnpjCliente":
                    if (request.getParameter("tipoCliente").equals("pessoaJuridica")) {
                        resposta = conta.recuperaCNPJ(request.getParameter("cpfCnpj"));
                    }

                    break;
                case "recuperarSaldo":
                    resposta = conta.recuperaSaldo();
                    break;
                case "depositarValor":
                    resposta = conta.depositar(Integer.parseInt(request.getParameter("valorDeposito")));
                    break;
                case "sacarValor":
                    resposta = conta.sacar();
                    break;
                case "depositarSacarValor":
                    int deposito = Integer.parseInt(request.getParameter("valorDeposito"));
                    int saque = Integer.parseInt(request.getParameter("valorSaque"));
                    resposta = conta.depositarSacar(deposito, saque);
                    break;
            }

            getServletContext().setAttribute("resposta", resposta);
            getServletContext().getRequestDispatcher("/resposta.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

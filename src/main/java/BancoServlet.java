package controller;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;import java.io.*;import model.*; 

@WebServlet("/bancoServlet")
public class BancoServlet extends HttpServlet{
	
	    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String paramNome = req.getParameter("pNome");
		String paramTipoPessoa = req.getParameter("pTipo");
		Cliente cliente = new Cliente(paramNome);
		cliente.setNome(paramNome);
		
		// envia o objeto para a JSP
		req.setAttribute("cliente", cliente);
	    RequestDispatcher reqDispatcher = req.getRequestDispatcher("WEB-INF/resposta.jsp");
		reqDispatcher.forward(req, resp);
	}}

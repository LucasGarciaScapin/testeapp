package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//SERVLET
@WebServlet(urlPatterns="/listarEmpresas")
public class ListarEmpresas extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		List<Empresa> list = banco.getEmpresas();
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/listarEmpresas.jsp");
		request.setAttribute("listaEmpresa", list);
		requestDispatcher.forward(request, response);
		
	}
}

package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//SERVLET
@WebServlet(urlPatterns="/oi")
public class OiMundo extends HttpServlet {
	private static final long serialVersionUID = 2L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		PrintWriter out = resp.getWriter();
		out.println("<html><body>Hello World, parabens! - Dedicatoria a Bruno Nunes.</body></html>");

		System.out.println("o servlet OiMundoServlet foi chamado");
	}
}

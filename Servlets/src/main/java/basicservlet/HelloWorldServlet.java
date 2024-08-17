package basicservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloWorldServlet implements Servlet{

	@Override
	public void destroy() {
		System.out.println("in destroy");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("in getservletconfig");
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("in getServletInfo");
		return null;
	}

	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		System.out.println("in init");
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("in service");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<html><body>");
		out.print("<h3>Hello Basic Servlet</h3>");
		out.print("</body></html>");
		
	}

}

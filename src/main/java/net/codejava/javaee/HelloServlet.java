package net.codejava.javaee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet( value = "/helloServlet")

public class HelloServlet extends HttpServlet {
    public HelloServlet(){
        super();
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String yourName = request.getParameter("yourName");
        System.out.println(yourName);
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Hello " + yourName + "</h1>");
        writer.close();
    }

    public void destroy() {
    }
}

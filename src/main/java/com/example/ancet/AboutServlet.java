package com.example.ancet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class AboutServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Created by Mychailo Hrama!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
        String res = "<form action='index.jsp'><input type='submit' value='Go back'></form>";
        response.getWriter().println(String.format(res));
    }

    public void destroy() {
    }
}


package com.example.newdate;

import java.io.*;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/index")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        Date today = new Date();
        String message = "Nguy như Hùng";

        writer.println("<h1>" + today + "</h1>");
        writer.println("<h1>" + message + "</h1>");

        writer.println("</html>");
    }

    public void destroy() {
    }
}
package org.zerock.web1;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    private int count;

    public void init()/*한번*/{
        message = "Hello World!";
        count =0;
        System.out.println("HelloServlet init....");
    }

    public void doGet/*여러번*/(HttpServletRequest request, HttpServletResponse response) throws IOException {

        ++count;

        String str = count % 2 ==0 ? "짝수" : "홀수";

        response.setContentType("text/html;charset= UTF-8");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h1>" + count + "</h1>");
        out.println("<h1>" + str + "</h1>");
        out.println("</body></html>");

        out.close();

    }

    public void destroy() {
    }
}
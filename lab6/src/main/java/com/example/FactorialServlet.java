package com.example;

/*
Q6a. Build a servlet program to find the factorial of a number.
*/

import java.io.IOException;
import java.io.PrintWriter;


// URL mapping
@WebServlet("/factorial")
public class FactorialServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set response type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            // Get input from HTML form
            int num = Integer.parseInt(request.getParameter("num"));

            // Calculate factorial
            long fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }

            // Display result
            out.println("<html><body>");
            out.println("<h2>Factorial of " + num + " is: " + fact + "</h2>");
            out.println("<a href='index.html'>Back</a>");
            out.println("</body></html>");

        } catch (Exception e) {
            out.println("<h3>Invalid Input!</h3>");
        }
    }
}
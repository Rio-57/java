import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HttpDemo extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println("<h1>HttpServlet Example</h1>");
        out.println("<p>This servlet handles HTTP requests (GET method).</p>");
        out.println("</body></html>");
    }
    
    protected void doPost(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        doGet(req, res);
    }
}
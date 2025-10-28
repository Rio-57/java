import java.io.*;
import javax.servlet.*;

public class GenericDemo extends GenericServlet {
    public void service(ServletRequest req, ServletResponse res) 
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println("<h1>GenericServlet Example</h1>");
        out.println("<p>This servlet runs using GenericServlet class.</p>");
        out.println("</body></html>");
    }
}
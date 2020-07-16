import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ErrorGenerator extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String valueA = req.getParameter("valueA");
        String valueB = req.getParameter("valueB");

        Integer numberA = Integer.valueOf(valueA);
        Integer numberB = Integer.valueOf(valueB);

        Integer answer = numberA / numberB;

        resp.setContentType("text/html");
        try {
            PrintWriter out = resp.getWriter();
            out.println("<html><head></head><body>");
            out.println("<h1>Division of Two Numbers:</h1>");
            out.println("<br>");
            out.println("Answer=" + answer + "<br>");
            out.println("</body></html>");
            out.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

    }
}

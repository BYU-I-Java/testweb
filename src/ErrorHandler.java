import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ErrorHandler extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        Throwable throwable = (Throwable)
                req.getAttribute("javax.servlet.error.exception");

        Integer statusCode = (Integer) req.getAttribute("javax.servlet.error.status_code");
        String servletName = (String) req.getAttribute("javax.servlet.error.servlet_name");
        String requestUri = (String) req.getAttribute("javax.servlet.error.request_uri");

        if (servletName == null) {
            servletName = "Unknown";
        }
        if (requestUri == null) {
            requestUri = "Unknown";
        }

        try {
            PrintWriter out = resp.getWriter();
            out.println("<html><head></head><body>");
            out.println("<h1>Error/Exception Handler</h1>");
            out.println("<br>This is a 404 Error Page, details are: ");
            out.println("<br>   Servlet Name: " + servletName);
            out.println("<br>    Status Code: " + statusCode);
            out.println("<br>    Source  URL: " + requestUri);
            out.println("<br>Please return to Home Page.");

            out.println("</body></html>");
            out.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}

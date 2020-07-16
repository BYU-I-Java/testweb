import com.company.MySQL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class PermitsReport extends javax.servlet.http.HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String fileLocate = getServletContext().getRealPath("/")+"Permits.html";
        String newDocument = "<html><head></head><body><h1>Page Loaded</h1>Content loaded from MySQL<br>" +
                "<!-- TABLE:showRegions -->" +
                "</body></html>";//Controller.loadPageTemplage(fileLocate);

        System.err.println("HTML page generated");

        if (newDocument.contains("<!--")) {
            if (newDocument.contains("<!-- TABLE:showRegions -->"))
                newDocument = newDocument.replace("<!-- TABLE:showRegions -->", "REPLACED TEXT");
        }

        resp.setContentType("text/html");
        try {
            PrintWriter out = resp.getWriter();
            out.println(newDocument);
            out.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}

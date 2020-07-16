import com.company.Controller;
import com.company.MySQL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class PermitsSearch extends javax.servlet.http.HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String newDocument = "";

        String fileLocate = getServletContext().getRealPath("/") + "Permits.html";
        newDocument = Controller.loadPageTemplage(fileLocate);

        if (newDocument.contains("<!--")) {
            if (newDocument.contains("<!-- TABLE:showRegions -->"))
                newDocument = newDocument.replace("<!-- TABLE:showRegions -->", MySQL.showRegions());
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

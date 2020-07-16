import java.io.File;
import java.util.Scanner;

public class WebResource {
    public static String getHTML(String filename) {
        String result = "";
        try {
            Scanner fin = new Scanner(new File(filename));
            while (fin.hasNextLine())
                result += fin.nextLine();
            fin.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return result;
    }
}

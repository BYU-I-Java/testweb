package com.company;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {
    private static TestDAO testMySQL = null;

    public Controller() {
        testMySQL = TestDAO.getInstance();
    }

    public static String loadPageTemplage(String filename) {
        String result = "";
        try {
            BufferedReader fio = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
            String line;
            while ((line = fio.readLine()) != null) {
                result += line;
            }

        } catch (IOException ex) {
            result = "Unexpected IOException Accessing Page Template: " + filename;
        } catch (Exception ex) {
            result = "Unexpected Exception Accessing Page Template: " + filename + "<br>Error Message: " + ex.getLocalizedMessage();
        }
        return result;
    }

}

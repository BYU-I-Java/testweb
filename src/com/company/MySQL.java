package com.company;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class MySQL {
    private static TestDAO testMySQL = TestDAO.getInstance();

    public static String showRegions() {
        String result = "";
        result = "<h2>Table Content: Regions</h2>";

        List<Regions> regionsList = testMySQL.getRegions();
        if (regionsList.size() == 0) result += "Table Empty";
        for (Regions region : regionsList) {
            result += "<br>" + region.toString();
        }

        return result;
    }

    public static void editRegion(Regions region) {
        System.out.println("\nEditing Table Content: Region\n");

        try {
            SessionFactory factory = HibernateUtils.getSessionFactory();
            Session session = factory.openSession();

            Transaction transaction = session.beginTransaction();
            Session sessionInsert = factory.openSession();

            long ID = (Long) sessionInsert.save(region);
            transaction.commit();
            System.out.println("Committed to Table");

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
        } finally {
            testMySQL.factory.close();
        }
    }

    public static String showAOaths() {
        String result = "";
        result += "<br>Table Content: Authorized Officers";
        List<AOaths> listOfItems = testMySQL.getAOaths();
        if (listOfItems.size() == 0) result += "Table Empty";
        for (AOaths singleItem : listOfItems) {
            result += "<br>" + singleItem.toString();
        }
        return result;
    }

    public static String showSubclassing() {
        String result = "";
        result += "<br>Table Content: Issuing Officers - Demonstrating Oath Subclassing";
        List<IOaths> listOfItems = testMySQL.getIOaths();
        if (listOfItems.size() == 0) result += "Table Empty";
        for (IOaths singleItem : listOfItems) {
            result += "<br>" + singleItem.toString();
        }
        return result;
    }

    public static String showMoreComplexTableStruc() {
        String result = "";
        result += "<br>Table Content: Permits - Demonstrating More Complex Table Structure";
        List<Permits> listOfItems = testMySQL.getPermits();
        if (listOfItems.size() == 0) result += "Table Empty";
        for (Permits singleItem : listOfItems) {
            result += "<br>" + singleItem.toString();
        }
        return result;
    }
}

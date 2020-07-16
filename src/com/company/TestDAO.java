/* This program is a part of a simple hibernate example used for CIT-360
   It is written by Troy Tuckett.  BYUI.EDU
 */
package com.company;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * TestDAO implemented using a singleton pattern
 * Used to get customer data from my MYSQL database - Taken from Tuckett (study notes)
 */
public class TestDAO {

    SessionFactory factory = null;
    Session session = null;

    private static TestDAO single_instance = null;

    private TestDAO() {
        factory = HibernateUtils.getSessionFactory();
    }

    /**
     * This is what makes this class a singleton.  You use this
     * class to get an instance of the class.
     */
    public static TestDAO getInstance() {
        if (single_instance == null) {
            single_instance = new TestDAO();
        }

        return single_instance;
    }

    public List<Regions> getRegions() {
        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from com.company.Regions";
            List<Regions> cs = (List<Regions>) session.createQuery(sql).getResultList();
            session.getTransaction().commit();
            return cs;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }

    }

    public Regions getRegion(int id) {

        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from com.company.Regions where id=" + Integer.toString(id);
            Regions singleResult = (Regions) session.createQuery(sql).getSingleResult();
            session.getTransaction().commit();
            return singleResult;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }

    //************************************************************************************
    // Used to demonstrate the pulling of an AOath class
    //************************************************************************************
    public List<AOaths> getAOaths() {
        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from com.company.AOaths";
            List<AOaths> resultset = (List<AOaths>) session.createQuery(sql).getResultList();
            session.getTransaction().commit();
            return resultset;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }

    //************************************************************************************
    // Used to demonstrate the pulling of an Oath based class
    //************************************************************************************
    public List<IOaths> getIOaths() {
        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from com.company.IOaths";
            List<IOaths> resultset = (List<IOaths>) session.createQuery(sql).getResultList();
            session.getTransaction().commit();
            return resultset;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }

    // Used to demonstrate the pulling of an Oath based class
    //************************************************************************************
    public List<Permits> getPermits() {
        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from com.company.Permits";
            List<Permits> resultset = (List<Permits>) session.createQuery(sql).getResultList();
            session.getTransaction().commit();
            return resultset;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }

}
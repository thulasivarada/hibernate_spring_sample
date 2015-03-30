package com.test.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author t.varada.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory = new Configuration().configure("myapp.cfg.xml").buildSessionFactory();

    public static Session getSession(){
        return sessionFactory.openSession();
    }
}

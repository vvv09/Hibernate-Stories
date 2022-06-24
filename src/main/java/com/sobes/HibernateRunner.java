package com.sobes;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.SQLException;

public class HibernateRunner {

    public static void main(String[] args) throws SQLException {

        Configuration configuration = new Configuration();
        configuration.configure();

        try (SessionFactory sessionFactory = configuration.buildSessionFactory()) {
            sessionFactory.openSession();
            System.out.println("OK");
        }

    }
}

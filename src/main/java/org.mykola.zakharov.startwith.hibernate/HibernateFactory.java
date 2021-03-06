package org.mykola.zakharov.startwith.hibernate;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateFactory {

    private static SessionFactory sessionFactory = null;

    static {
        Configuration cfg = new Configuration().configure();
        sessionFactory = cfg.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

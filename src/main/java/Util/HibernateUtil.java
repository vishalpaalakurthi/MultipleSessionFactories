package Util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtil {
    public static SessionFactory buildSessionFactory(Configuration configuration){

        StandardServiceRegistryBuilder sg = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        return configuration.buildSessionFactory(sg.build());
    }

    public static Session openSession(Configuration configuration){
        SessionFactory sf = buildSessionFactory(configuration);
        return sf.openSession();
    }
}

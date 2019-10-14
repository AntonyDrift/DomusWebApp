package by.domus.app.controller.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

    private static EntityManagerFactory EM_FACTORY = null;

    public static EntityManager getEntityManager(String persistName) {
        if (EM_FACTORY == null) {
            EM_FACTORY = Persistence.createEntityManagerFactory(persistName);
        }
        return EM_FACTORY.createEntityManager();
    }
    private void dsds() {
    }
    public static void closeEmFactory() {
        EM_FACTORY.close();
    }
}

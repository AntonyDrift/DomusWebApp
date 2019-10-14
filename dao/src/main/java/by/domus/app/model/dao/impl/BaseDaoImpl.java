package by.domus.app.model.dao.impl;

import by.domus.app.controller.utils.HibernateUtil;
import by.domus.app.model.dao.BaseDao;
import lombok.Getter;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class BaseDaoImpl<T> implements BaseDao<T> {

    Class<T> clazz;
    private HibernateUtil util = new HibernateUtil();
    private EntityManager em = util.getEntityManager("by.domus.app");


    @Override
    public T add(T t) {
        try {
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }
        return t;
    }

    @Override
    public T get(Long id) {
        try {
            em.getTransaction().begin();
            T t = em.find(clazz, id);
            em.getTransaction().commit();
            return t;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            return null;
        }
    }

    @Override
    public T update(T t) {
        try {
            em.getTransaction().begin();
            em.merge(t);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        return t;
    }

    @Override
    public void delete(Long id) {
        try {
            em.getTransaction().begin();
            T t = em.find(clazz, id);
            em.remove(t);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }

    @Override
    public List<T> getAll() {
        try {
            em.getTransaction().begin();
            List<T> list = em
                    .createQuery("FROM " + clazz.getSimpleName().toLowerCase())
                    .getResultList();
            em.getTransaction().commit();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            return null;
        }
    }
}

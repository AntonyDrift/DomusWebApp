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

    private EntityManager getEM() {
        return util.getEntityManager("by.domus.app");
    }

    @Override
    public T add(T t) {
       getEM().getTransaction().begin();
        try {
            getEM().persist(t);
            getEM().getTransaction().commit();
            return t;
        } catch (Exception e) {
            util.closeEmFactory();
            return t;
        }
    }

    @Override
    public T get(Long id) {
        getEM().getTransaction().begin();
        try {
            T t = getEM().find(clazz, id);
            getEM().getTransaction().commit();
            return t;
        } catch (Exception e) {
            util.closeEmFactory();
            return null;
        }
    }

    @Override
    public T update(T t) {
        getEM().getTransaction().begin();
        try {
            getEM().merge(t);
            return t;
        } catch (Exception e) {
            util.closeEmFactory();
            return null;
        }
    }

    @Override
    public void delete(Long id) {
        getEM().getTransaction().begin();
        try {
            T t = getEM().find(clazz, id);
            getEM().remove(t);
        } catch (Exception e) {
            util.closeEmFactory();
        }
    }

    @Override
    public List<T> getAll() {
        getEM().getTransaction().begin();
        try {
            List<T> list = getEM()
                    .createQuery("FROM" + clazz.getSimpleName())
                    .getResultList();
            return list;
        } catch (Exception e) {
            util.closeEmFactory();
            return null;
        }
    }
}

package by.domus.app.model.dao.impl;

import by.domus.app.controller.utils.HibernateUtil;
import by.domus.app.model.beans.impl.orders.Basket;
import by.domus.app.model.beans.impl.orders.Order;
import by.domus.app.model.beans.impl.partners.Partner;
import by.domus.app.model.beans.impl.products.Product;

import javax.persistence.EntityManager;
import javax.servlet.http.Part;
import javax.swing.text.html.parser.Entity;
import java.sql.Timestamp;
import java.util.*;

public class Runner {

    public static void main(String[] args) {
//
//        Partner anton = new Partner(null, "anton", "anton zhurkov", 1,
//                1l, 1l, null);

        Product banan = new Product( null,"banan", 1l, null);

        Basket firstbasket = new Basket(null, null, banan, 99);
        banan.setBasket(firstbasket);

        Order order = new Order(null, null);
        firstbasket.setOrder(order);
        order.setBasketList(Arrays.asList(firstbasket));

        HibernateUtil util = new HibernateUtil();
        EntityManager em = util.getEntityManager("by.domus.app");
        em.getTransaction().begin();


        em.persist(order);
        em.persist(firstbasket);
        em.persist(banan);
        em.getTransaction().commit();
        em.getTransaction().begin();
        Order foudedOrder = em.find(Order.class, 1l);
        System.out.println(foudedOrder.toString());


    }
}

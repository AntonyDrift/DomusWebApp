package by.domus.app;

import by.domus.app.controller.utils.HibernateUtil;
import by.domus.app.model.beans.impl.orders.BasketItem;
import by.domus.app.model.beans.impl.products.Price;
import by.domus.app.model.beans.impl.products.Product;
import by.domus.app.model.beans.impl.products.Reserve;
import by.domus.app.model.beans.impl.products.Storage;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

public class Runn {
    public static void main(String[] args) {
        HibernateUtil util = new HibernateUtil();
        EntityManager em = util.getEntityManager("by.domus.app");

        Reserve bananaReserve = new Reserve(null, 3, null);
        Storage bananaStorage = new Storage(null, 100, 20, 80, bananaReserve, null);
        Price bananaPrice = new Price(null, BigDecimal.valueOf(100),BigDecimal.valueOf(200),
                BigDecimal.valueOf(150), BigDecimal.valueOf(120), null);
        Product banana = new Product(null, "banana", bananaStorage,bananaPrice,null);

//        BasketItem tmp = new BasketItem();
        bananaReserve.setStorage(bananaStorage);
        bananaStorage.setProduct(banana);
        bananaPrice.setProduct(banana);
//        banana.setBasketItem(tmp);


        em.getTransaction().begin();
        em.persist(bananaStorage);
        em.persist(bananaPrice);
        em.persist(banana);
        em.getTransaction().commit();


    }
}

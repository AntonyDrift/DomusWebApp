package by.domus.app;

import by.domus.app.model.beans.impl.orders.Basket;
import by.domus.app.model.beans.impl.orders.BasketItem;
import by.domus.app.model.beans.impl.products.Price;
import by.domus.app.model.beans.impl.products.Product;
import by.domus.app.model.beans.impl.products.Storage;
import by.domus.app.model.dao.impl.OrderDaoImpl;
import by.domus.app.model.dao.impl.ProductDaoImpl;

import java.math.BigDecimal;

public class BaseDaoTest {
    public static void main(String[] args) {
        //Reserve<->Storage<->!!!Product!!!<->Price
        Storage bananaStorage = new Storage(null, 103, 20, 80, 3, null);
        Price bananaPrice = new Price(null, BigDecimal.valueOf(100), BigDecimal.valueOf(200),
                BigDecimal.valueOf(150), BigDecimal.valueOf(120), null);
        Product banana = new Product(7l, "no banana", bananaStorage, bananaPrice, null);

        bananaStorage.setProduct(banana);
        bananaPrice.setProduct(banana);

        ProductDaoImpl productDaoImpl = new ProductDaoImpl();

//        productDaoImpl.add(banana);
//        productDaoImpl.getAll().forEach(e -> System.out.println(e));
//        Product tmp = productDaoImpl.get(10l);
//        tmp.setName("Another Fruit");
//        productDaoImpl.update(tmp);
//        productDaoImpl.delete(7l);
//        productDaoImpl.getAll().forEach(e -> System.out.println(e));

        // <-BasketItem<->!!!Basket!!!<->Order
        banana.s
        BasketItem basketItem = new BasketItem(null,13,null,null);

        Basket basket = new Basket(null, null, null, null);

        OrderDaoImpl orderDaoImpl = new OrderDaoImpl();

    }
}

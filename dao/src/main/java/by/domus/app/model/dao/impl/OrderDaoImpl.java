package by.domus.app.model.dao.impl;

import by.domus.app.model.beans.impl.orders.Order;

public class OrderDaoImpl extends BaseDaoImpl<Order> {

   public OrderDaoImpl() {
       this.clazz = Order.class;
   }
}

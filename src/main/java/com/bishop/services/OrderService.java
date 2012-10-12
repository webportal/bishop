package com.bishop.services;

import com.bishop.domain.Order;
import java.util.List;

/**
 * User: dmytro
 * Date: 10/6/12
 * Time: 4:38 PM
 */
public interface OrderService {


    /**
     * add order
     * @param order
     */
    void addOrder(Order order);

    /**
     * delete order
     * @param order
     */
    void deleteOrder(Order order);

    /**
     * get order by id
     * @param id
     * @return order
     */
    Order findById(int id);

}

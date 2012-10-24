package com.bishop.services;

import com.bishop.domain.Order;

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

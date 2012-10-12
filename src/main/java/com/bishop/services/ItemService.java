package com.bishop.services;

import com.bishop.domain.Item;
import com.bishop.domain.User;

/**
 * User: dmytro
 * Date: 10/6/12
 * Time: 4:16 PM
 */

public interface ItemService {

    /**
     * add item
     * @param item
     */
    void addItem(Item item);

    /**
     * delete item
     * @param item
     */
    void deleteItem(Item item);

    /**
     * get item by id
     * @return item
     */
    Item findById(int id);

    /**
     * get item by id
     * @param name
     * @return item
     */
    Item findByTitle(String name);

}

package com.bishop.repository;

import com.bishop.domain.Item;
import com.bishop.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * User: dmytro
 * Date: 10/7/12
 * Time: 9:30 AM
 */

public interface ItemRepository extends CrudRepository<Item, Integer>{

    /**
     * get item by id
     * @param name
     * @return item
     */
    Item findByName(String name);

    /**
     * get owner of this item
     * @return user
     */
    User getOwnerOfThisItem();
}

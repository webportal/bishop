package com.bishop.repository;

import com.bishop.domain.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer>{

    /**
     * get item by id
     * @param name
     * @return item
     */
    Item findByTitle(String name);

}

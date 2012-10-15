package com.bishop.repository;

import com.bishop.domain.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;

/**
 * User: dmytro
 * Date: 10/6/12
 * Time: 10:20 PM
 */
public interface CategoryRepository extends CrudRepository<Category, Integer> {

    /**
     * find by name
     * @param name
     * @return category
     */
    Category findByName(String name);

    List<Category> findAll();

    @Query("SELECT c from Category c WHERE c.parentCategory IS null ")
    List<Category> findAllRootCategories();
}

package com.bishop.repository;

import com.bishop.domain.Category;
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
     * get root categories
     * @return
     */
    List<Category> getRootCategories();

    /**
     * find by name
     * @param name
     * @return category
     */
    Category findByName(String name);

    /**
     * get subcategories
     * @param
     * @return list of categories
     */
    List<Category> getSubCategories();

    /**
     * get parent categories
     * @return list of categories
     */
    List<Category> getParentCategory();
}

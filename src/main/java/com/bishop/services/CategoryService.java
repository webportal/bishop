package com.bishop.services;

import com.bishop.domain.Category;
import java.util.List;
/**
 * User: dmytro
 * Date: 10/6/12
 * Time: 3:48 PM
 */
public interface CategoryService {

    /**
     * add category
     * @param category
     */
    void addCategory(Category category);

    /**
     * delete category
     * @param category
     */
    void deleteCategory(Category category);

    /**
     * find by id
     * @param id
     * @return category
     */
    Category findById(int id);

    /**
     * find by name
     * @param name
     * @return category
     */
    Category findByName(String name);

    /**
     * get root categories
     * @return list of categories
     */
    List<Category> getRootCategories();

    /**
     * get subcategories
     * @return list of categories
     */
    List<Category> getSubCategories();

    /**
     * get parent categories
     * @return list of categories
     */
    List<Category> getParentCategory();

}

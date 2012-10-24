package com.bishop.services;

import com.bishop.domain.Category;
import java.util.List;

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
     *
     * @return all categories
     */
    List<Category> findAll();


    /**
     *
     * @return all root categories(without parent category)
     */
    List<Category> findAllRootCategories();


    /**
     *
     * @param parentCategoryId
     * @return all elements for the parent
     */
    List<Category> findAllSubCategories(int parentCategoryId);

}

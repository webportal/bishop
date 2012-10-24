package com.bishop.repository;

import com.bishop.domain.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

    /**
     * find by name
     * @param name
     * @return category
     */
    Category findByName(String name);

    List<Category> findAll();

    @Query("SELECT c from Category c WHERE c.parentCategory IS NULL")
    List<Category> findAllRootCategories();

    @Query("SELECT c from Category c WHERE c.parentCategory.id = :parentCategoryId")
    List<Category> findAllSubCategories(@Param("parentCategoryId") int parentCategoryId);
}

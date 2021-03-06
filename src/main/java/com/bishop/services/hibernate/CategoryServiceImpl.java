package com.bishop.services.hibernate;

import com.bishop.domain.Category;
import com.bishop.repository.CategoryRepository;
import com.bishop.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service("categoryService")
@Repository
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(Category category) {
        categoryRepository.delete(category);
    }

    @Override
    public Category findById(int id) {
        return categoryRepository.findOne(id);
    }

    @Override
    public Category findByName(String name) {
        return categoryRepository.findByName(name);
    }

    @Override
    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    @Override
    public List<Category> findAllRootCategories(){
        return categoryRepository.findAllRootCategories();
    }
    @Override
    public List<Category> findAllSubCategories(int parentCategoryId){
        return categoryRepository.findAllSubCategories(parentCategoryId);
    }
}

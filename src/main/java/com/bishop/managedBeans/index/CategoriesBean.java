package com.bishop.managedBeans.index;

import com.bishop.domain.Category;
import com.bishop.services.CategoryService;
import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Named
@SessionScoped
public class CategoriesBean {
    Logger logger = Logger.getLogger(CategoriesBean.class.getName());
    @Inject
    private CategoryService categoryService;
    private String selectedCategory;
    private String currentParent;
    private List<Category> categories = new ArrayList<>();
    private List<Category> allCategories = new ArrayList<>();
    @PostConstruct
    public void findAllRootCategories(){
        this.setCategories(categoryService.findAllRootCategories());
        this.setCurrentParent("NULL");
        this.setAllCategories(categoryService.findAll());
    }

    public void findAllSubCategories(){
        Category find = categoryService.findById(Integer.parseInt(getSelectedCategory()));
        if(find.hasChildren()){
            this.setCategories(categoryService.findAllSubCategories(Integer.parseInt(getSelectedCategory())));
            this.setCurrentParent(String.valueOf(find.getId()));
        }
        logger.info("set current parent to " + getCurrentParent());
    }

    public void findAllInferiors(){
        logger.info(getCurrentParent() + " current parent");
        Category parent = categoryService.findById(Integer.parseInt(getCurrentParent()));
        // if Parent is Root then return all the root categories
        if(parent.isRootCategory()){
            this.setCategories(categoryService.findAllRootCategories());
        }
        // otherwise find all categories one level up
        else{
            this.setCategories(categoryService.findAllSubCategories(parent.getParentCategory().getId()));
        }
    }


    public void deleteCategory(){
        Category category = categoryService.findById(Integer.parseInt(getSelectedCategory()));
        categoryService.deleteCategory(category);
        this.setAllCategories(categoryService.findAll());
    }
    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public String getSelectedCategory() {
        return selectedCategory;
    }

    public void setSelectedCategory(String selectedCategory) {
        this.selectedCategory = selectedCategory;
    }

    public String getCurrentParent() {
        return currentParent;
    }

    public void setCurrentParent(String currentParent) {
        this.currentParent = currentParent;
    }

    public List<Category> getAllCategories() {
        return allCategories;
    }

    public void setAllCategories(List<Category> allCategories) {
        this.allCategories = allCategories;
    }
}
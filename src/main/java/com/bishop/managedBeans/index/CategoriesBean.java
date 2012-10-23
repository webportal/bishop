package com.bishop.managedBeans.index;

import com.bishop.domain.Category;
import com.bishop.services.CategoryService;
import com.google.common.collect.Lists;

import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Scope;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: shevchik
 * Date: 14.10.12
 * Time: 19:53
 * To change this template use File | Settings | File Templates.
 */
@Named
@SessionScoped
public class CategoriesBean {
    Logger logger = Logger.getLogger(CategoriesBean.class.getName());
    @Inject
    private CategoryService categoryService;
    private String selectedCategory;
    private String currentParent;
    private List<Category> categories = new ArrayList<>();

    @PostConstruct
    public void findAllRootCategories(){
        this.setCategories(categoryService.findAllRootCategories());
        this.setCurrentParent("NULL");
    }

    public void findAllSubCategories(){
        Category find = categoryService.findById(Integer.parseInt(getSelectedCategory()));
        if(find.hasChildren()){
            this.setCategories(categoryService.findAllSubCategories(Integer.parseInt(getSelectedCategory())));
            this.setCurrentParent(String.valueOf(find.getId()));
        }
        logger.info("set current parent to "+ getCurrentParent());
    }

    public void findAllInferiors(){
        logger.info(getCurrentParent() + " current parent");
        Category parent = categoryService.findById(Integer.parseInt(getCurrentParent()));
        // if Parent is
        if(parent.isRootCategory()){
            this.setCategories(categoryService.findAllRootCategories());
        }
        else{
            this.setCategories(categoryService.findAllSubCategories(parent.getParentCategory().getId()));
        }
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
}
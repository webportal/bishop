package com.bishop.managedBeans.index;

import com.bishop.domain.Category;
import com.bishop.services.CategoryService;
import com.google.common.collect.Lists;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
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
public class CategoriesBean {
    Logger logger = Logger.getLogger(CategoriesBean.class.getName());

    private int selectedCategory=0;

    @Inject
    private CategoryService categoryService;
    private List<Category> categoriesToDisplay = new LinkedList<Category>();

    public List<Category> getCategoriesToDisplay() {
        return categoriesToDisplay;
    }

    @PostConstruct
    void init(){
        this.categoriesToDisplay = categoryService.findAllRootCategories();
    }

    public void setCategoriesToDisplay(List<Category> categoriesToDisplay) {
        this.categoriesToDisplay = categoriesToDisplay;
    }

    public void getSubCategories(){
        logger.info("+++++ "+selectedCategory + " id were selected ++++++");
        Category selected;
        List<Category> categories;
        if((selected = this.categoryService.findById(selectedCategory)) != null){
            if((categories = selected.getSubCategories()).size()!=0){
                this.categoriesToDisplay = selected.getSubCategories();
            }
        }
    }
    public int getSelectedCategory() {
        return selectedCategory;
    }

    public void setSelectedCategory(int selectedCategory) {
        this.selectedCategory = selectedCategory;
    }
}

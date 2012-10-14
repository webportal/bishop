package com.bishop.managedBeans.index;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shevchik
 * Date: 14.10.12
 * Time: 19:53
 * To change this template use File | Settings | File Templates.
 */
@Named
public class CategoriesBean {
    private List<String> categoryImages = new ArrayList<String>();

    public List<String> getCategoryImages() {
        return categoryImages;
    }

    @PostConstruct
    void init(){
        this.categoryImages.add("/resources/images/bus.png");
        this.categoryImages.add("/resources/images/globe.png");
        this.categoryImages.add("/resources/images/apple.png");
        this.categoryImages.add("/resources/images/bmw.png");
        this.categoryImages.add("/resources/images/bear_user.png");
        this.categoryImages.add("/resources/images/ipod_noir.png");
        this.categoryImages.add("/resources/images/apple_tv_logo.png");
        this.categoryImages.add("/resources/images/dvd.png");
        this.categoryImages.add("/resources/images/documents.png");
        this.categoryImages.add("/resources/images/fish.png");
        this.categoryImages.add("/resources/images/help.png");
        this.categoryImages.add("/resources/images/grumpy_bear.png");
    }

    public void setCategoryImages(List<String> categoryImages) {
        this.categoryImages = categoryImages;
    }
}

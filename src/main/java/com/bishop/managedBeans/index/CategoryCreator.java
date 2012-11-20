package com.bishop.managedBeans.index;

import com.bishop.domain.Category;
import com.bishop.services.CategoryService;
import org.primefaces.model.UploadedFile;

import javax.imageio.ImageIO;
import javax.inject.Inject;
import javax.inject.Named;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@Named
public class CategoryCreator {

    private UploadedFile uploadedFile;

    private Category category;

    @Inject
    private CategoryService categoryService;


    public void create(){

        if(uploadedFile != null){
            File image = new File()
            try {

                BufferedImage bufferedImage = ImageIO.read(uploadedFile.getInputstream());
                bufferedImage.
            } catch (IOException e) {
                System.out.println("ERROR");
            }
        }
        category.setIcon();
        categoryService.addCategory();
    }

    public UploadedFile getUploadedFile() {
        return uploadedFile;
    }

    public void setUploadedFile(UploadedFile uploadedFile) {
        this.uploadedFile = uploadedFile;
    }

    public CategoryService getCategoryService() {
        return categoryService;
    }

    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}

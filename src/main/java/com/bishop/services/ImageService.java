package com.bishop.services;

import com.bishop.domain.Image;

public interface ImageService {

    /**
     * add image
     * @param image
     */
    void addImage(Image image);

    /**
     * delete image
     * @param image
     */
    void deleteImage(Image image);

    /**
     * get by id
     * @param id
     * @return image
     */
    Image findById(int id);
}

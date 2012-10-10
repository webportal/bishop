package com.bishop.repository;

import com.bishop.domain.Image;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

/**
 * User: dmytro
 * Date: 10/7/12
 * Time: 9:17 AM
 */

public interface ImageRepository extends CrudRepository<Image, Integer> {

    /**
     * get all images for given item
     * @return list of images
     */
    List<Image> getImagesForItem();
}

package com.bishop.services;

import com.bishop.domain.User;
import java.util.List;

public interface UserService {

    /**
     * add user
     * @param user
     */
    void addUser(User user);

    /**
     * delete by id
     * @param id
     */
    void deleteById(int id);

    /**
     * get by id
     * @param id
     * @return user
     */
    User findById(int id);

    /**
     * get user by id
     * @param name
     * @return user
     */
    User findByFirstName(String name);


    /**
     * get all users
      * @return List<User>
     */

    List<User> findAll();

}

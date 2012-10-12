package com.bishop.repository;

import com.bishop.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * User: dmytro
 * Date: 10/7/12
 * Time: 10:15 AM
 */

public interface UserRepository extends CrudRepository<User, Integer> {

    /**
     * get user by id
     * @param name
     * @return user
     */
    User findByFirstName(String name);

    List<User> findAll();
}

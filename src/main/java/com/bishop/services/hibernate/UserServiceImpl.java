package com.bishop.services.hibernate;

import com.bishop.domain.User;
import com.bishop.repository.UserRepository;
import com.bishop.services.UserService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Repository
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteById(int id) {
        userRepository.delete(id);
    }

    @Override
    public User findById(int id) {
        return userRepository.findOne(id);
    }

    @Override
    public User findByFirstName(String name) {
        return userRepository.findByFirstName(name);
    }

    @Override
    public List<User> findAll(){
        return userRepository.findAll();
    }
}

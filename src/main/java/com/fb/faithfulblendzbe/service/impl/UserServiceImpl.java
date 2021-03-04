package com.fb.faithfulblendzbe.service.impl;

import com.fb.faithfulblendzbe.domain.User;
import com.fb.faithfulblendzbe.repository.UserRepository;
import com.fb.faithfulblendzbe.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save( user );
    }

    @Override
    public User findUserById(Integer id) {
        return userRepository.findById( id ).orElse(null);
    }

    @Override
    public Iterable<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById( id );
    }

    @Override
    public User findUserByName(String name) {
        return userRepository.findByUserName( name );
    }
}

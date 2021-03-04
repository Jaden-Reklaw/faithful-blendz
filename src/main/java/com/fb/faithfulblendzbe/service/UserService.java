package com.fb.faithfulblendzbe.service;

import com.fb.faithfulblendzbe.domain.User;
import com.fb.faithfulblendzbe.domain.VolunteerEvent;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    User findUserById(Integer id);

    Iterable<User> findAllUsers();

    void deleteUser(Integer id);

    User findUserByName(String name);
}

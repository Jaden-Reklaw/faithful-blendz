package com.fb.faithfulblendzbe.repository;

import com.fb.faithfulblendzbe.domain.User;
import com.fb.faithfulblendzbe.domain.VolunteerEvent;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUserName(String name);
}
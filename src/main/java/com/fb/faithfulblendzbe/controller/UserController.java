package com.fb.faithfulblendzbe.controller;

import com.fb.faithfulblendzbe.exception.ResourceNotFoundException;
import com.fb.faithfulblendzbe.model.User;
import com.fb.faithfulblendzbe.repository.UserRepository;
import com.fb.faithfulblendzbe.security.CurrentUser;
import com.fb.faithfulblendzbe.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
}

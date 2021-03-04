package com.fb.faithfulblendzbe.service;

import com.fb.faithfulblendzbe.domain.Email;
import com.fb.faithfulblendzbe.domain.VolunteerEvent;

import java.util.List;

public interface EmailService {

    Email saveEmail(Email email);

    Email findEmailById(Integer id);

    Iterable<Email> findAllEmails();

    void deleteEmail(Integer id);

    Email findEmailByName(String name);
}

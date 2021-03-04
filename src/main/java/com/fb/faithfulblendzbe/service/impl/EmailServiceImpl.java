package com.fb.faithfulblendzbe.service.impl;

import com.fb.faithfulblendzbe.domain.Email;
import com.fb.faithfulblendzbe.repository.EmailRepository;
import com.fb.faithfulblendzbe.service.EmailService;

import java.util.List;

public class EmailServiceImpl implements EmailService {

    private EmailRepository emailRepository;

    public EmailServiceImpl(EmailRepository emailRepository){ this.emailRepository = emailRepository;}

    @Override
    public Email saveEmail(Email email) {
        return emailRepository.save(email);
    }

    @Override
    public Email findEmailById(Integer id) {
        return emailRepository.findById( id ).orElse( null );
    }

    @Override
    public Iterable<Email> findAllEmails() {
        return emailRepository.findAll();
    }

    @Override
    public void deleteEmail(Integer id) {
         emailRepository.deleteById( id );
    }

    @Override
    public Email findEmailByName(String name) {
        return emailRepository.findEmailByName( name );
    }
}

package com.fb.faithfulblendzbe.service.impl;

import com.fb.faithfulblendzbe.domain.Contact;
import com.fb.faithfulblendzbe.repository.ContactRepository;
import com.fb.faithfulblendzbe.service.ContactService;

public class ContactServiceImpl implements ContactService {

    private ContactRepository contactRepository;

    public ContactServiceImpl(ContactRepository contactRepository) {this.contactRepository = contactRepository ;}

    @Override
    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public Contact findContactById(Integer id) {
        return contactRepository.findById( id ).orElse(null);
    }

    @Override
    public Iterable<Contact> findAllContacts() {
        return contactRepository.findAll();
    }

    @Override
    public void deleteContact(Integer id) {
        contactRepository.deleteById( id );
    }

    @Override
    public Contact findContactByName(String name) {
        return contactRepository.findContactByName( name );
    }
}

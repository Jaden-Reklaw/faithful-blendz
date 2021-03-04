package com.fb.faithfulblendzbe.service;

import com.fb.faithfulblendzbe.domain.Contact;
import com.fb.faithfulblendzbe.domain.VolunteerEvent;

import java.util.List;

public interface ContactService {

    Contact saveContact(Contact contact);

    Contact findContactById(Integer id);

    Iterable<Contact> findAllContacts();

    void deleteContact(Integer id);

    Contact findContactByName(String name);
}

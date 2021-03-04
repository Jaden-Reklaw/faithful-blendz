package com.fb.faithfulblendzbe.repository;

import com.fb.faithfulblendzbe.domain.Contact;
import com.fb.faithfulblendzbe.domain.VolunteerEvent;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Integer> {
}

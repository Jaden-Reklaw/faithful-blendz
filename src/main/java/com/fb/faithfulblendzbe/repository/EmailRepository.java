package com.fb.faithfulblendzbe.repository;

import com.fb.faithfulblendzbe.domain.Email;
import com.fb.faithfulblendzbe.domain.VolunteerEvent;
import org.springframework.data.repository.CrudRepository;

public interface EmailRepository extends CrudRepository<Email, Integer> {
}
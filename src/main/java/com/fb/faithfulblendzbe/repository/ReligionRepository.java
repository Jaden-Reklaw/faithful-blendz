package com.fb.faithfulblendzbe.repository;

import com.fb.faithfulblendzbe.domain.Religion;
import com.fb.faithfulblendzbe.domain.VolunteerEvent;
import org.springframework.data.repository.CrudRepository;

public interface ReligionRepository extends CrudRepository<Religion, Integer> {
}

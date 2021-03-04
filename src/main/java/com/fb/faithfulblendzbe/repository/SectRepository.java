package com.fb.faithfulblendzbe.repository;

import com.fb.faithfulblendzbe.domain.Sect;
import com.fb.faithfulblendzbe.domain.VolunteerEvent;
import org.springframework.data.repository.CrudRepository;

public interface SectRepository extends CrudRepository<Sect, Integer> {

    Sect findBySectName(String name);
}
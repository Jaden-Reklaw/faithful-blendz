package com.fb.faithfulblendzbe.repository;

import com.fb.faithfulblendzbe.domain.VolunteerEvent;
import org.springframework.data.repository.CrudRepository;

public interface VolunteerEventRepository extends CrudRepository<VolunteerEvent, Integer> {

    VolunteerEvent findByVolunteerEventName(String name);
}

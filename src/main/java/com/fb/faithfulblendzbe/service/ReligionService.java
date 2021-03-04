package com.fb.faithfulblendzbe.service;

import com.fb.faithfulblendzbe.domain.Religion;
import com.fb.faithfulblendzbe.domain.VolunteerEvent;
import com.fb.faithfulblendzbe.repository.ReligionRepository;

import java.util.List;

public interface ReligionService {

    Religion saveReligion(Religion religion);

    Religion findReligionById(Integer id);

    Iterable<Religion> findAllReligions();

    void deleteReligion(Integer id);

    Religion findReligionByName(String name);
}

package com.fb.faithfulblendzbe.service;

import com.fb.faithfulblendzbe.model.Religion;

public interface ReligionService {
    Iterable<Religion> getAllReligions();
    Religion getReligionById(Integer id);
    Religion saveReligion(Religion religion);
    Iterable<Religion> saveReligionList(Iterable<Religion> religionIterable);
    void deleteReligion(Integer id);
}

package com.fb.faithfulblendzbe.service;

import com.fb.faithfulblendzbe.domain.Sect;
import com.fb.faithfulblendzbe.domain.VolunteerEvent;

import java.util.List;

public interface SectService {

    Sect saveSect(Sect sect);

    Sect findSectById(Integer id);

    Iterable<Sect> findAllSects();

    void deleteSect(Integer id);

    Sect findSectByName(String name);
}

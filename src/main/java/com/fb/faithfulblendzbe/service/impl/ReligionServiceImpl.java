package com.fb.faithfulblendzbe.service.impl;

import com.fb.faithfulblendzbe.model.Religion;
import com.fb.faithfulblendzbe.repository.ReligionRepository;
import com.fb.faithfulblendzbe.service.ReligionService;
import org.springframework.stereotype.Service;

@Service
public class ReligionServiceImpl implements ReligionService {
    private ReligionRepository religionRepository;

    public ReligionServiceImpl(ReligionRepository religionRepository) {
        this.religionRepository = religionRepository;
    }

    @Override
    public Iterable<Religion> getAllReligions() {
        return religionRepository.findAll();
    }

    @Override
    public Religion getReligionById(Integer id) {
        return religionRepository.findById(id).orElse(null);
    }

    @Override
    public Religion saveReligion(Religion religion) {
        return religionRepository.save(religion);
    }

    @Override
    public Iterable<Religion> saveReligionList(Iterable<Religion> religionIterable) {
        return religionRepository.saveAll(religionIterable);
    }

    @Override
    public void deleteReligion(Integer id) {
        religionRepository.deleteById(id);
    }
}

package com.fb.faithfulblendzbe.service.impl;

import com.fb.faithfulblendzbe.domain.Religion;
import com.fb.faithfulblendzbe.repository.ReligionRepository;
import com.fb.faithfulblendzbe.service.ReligionService;

import java.util.List;

public class ReligionServiceImpl implements ReligionService{

    private ReligionRepository religionRepository;

    public ReligionServiceImpl(ReligionRepository religionRepository) {
        this.religionRepository = religionRepository;
    }

    @Override
    public Religion saveReligion(Religion volunteerEvent) {
        return religionRepository.save( volunteerEvent );
    }

    @Override
    public Religion findReligionById(Integer id) {
        return religionRepository.findById( id ).orElse( null );
    }

    @Override
    public Iterable<Religion> findAllReligions() {
        return religionRepository.findAll();
    }

    @Override
    public void deleteReligion(Integer id) {
        religionRepository.deleteById( id );
    }

    @Override
    public Religion findReligionByName(String name) {
        return religionRepository.findByReligionName( name );
    }
}

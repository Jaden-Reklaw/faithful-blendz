package com.fb.faithfulblendzbe.service.impl;

import com.fb.faithfulblendzbe.domain.Sect;
import com.fb.faithfulblendzbe.repository.SectRepository;
import com.fb.faithfulblendzbe.service.SectService;

import java.util.List;

public class SectServiceImpl implements SectService {

    private SectRepository sectRepository;


    public SectServiceImpl(SectRepository sectRepository) {
        this.sectRepository = sectRepository;
    }

    @Override
    public Sect saveSect(Sect sect) {
        return sectRepository.save(sect);
    }

    @Override
    public Sect findSectById(Integer id) {
        return sectRepository.findById( id ).orElse( null );
    }

    @Override
    public Iterable<Sect> findAllSects() {
        return sectRepository.findAll();
    }

    @Override
    public void deleteSect(Integer id) {
        sectRepository.deleteById( id );
    }

    @Override
    public Sect findSectByName(String name) {
        return sectRepository.findBySectName( name );
    }
}

package com.fb.faithfulblendzbe.service.impl;

import com.fb.faithfulblendzbe.domain.VolunteerEvent;
import com.fb.faithfulblendzbe.repository.VolunteerEventRepository;
import com.fb.faithfulblendzbe.service.VolunteerEventService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolunteerEventServiceImpl implements VolunteerEventService {

    private VolunteerEventRepository volunteerEventRepository;

    public VolunteerEventServiceImpl(VolunteerEventRepository volunteerEventRepository) {
        this.volunteerEventRepository = volunteerEventRepository;
    }

    @Override
    public VolunteerEvent saveVolunteerEvent(VolunteerEvent volunteerEvent) {
        return volunteerEventRepository.save(volunteerEvent);
    }

    @Override
    public VolunteerEvent findVolunteerEventById(Integer id) {
        return volunteerEventRepository.findById( id ).orElse( null );
    }

    @Override
    public Iterable<VolunteerEvent> findAllVolunteerEvents() {
        return volunteerEventRepository.findAll();
    }

    @Override
    public void deleteVolunteerEvent(Integer id) {
        volunteerEventRepository.deleteById( id );
    }

    @Override
    public VolunteerEvent findVolunteerEventByName(String name) {
        return volunteerEventRepository.findByVolunteerEventName( name );
    }
}

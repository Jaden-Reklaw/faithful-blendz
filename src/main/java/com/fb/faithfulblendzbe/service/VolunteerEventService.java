package com.fb.faithfulblendzbe.service;

import com.fb.faithfulblendzbe.domain.VolunteerEvent;

import java.util.List;

public interface VolunteerEventService {

    VolunteerEvent saveVolunteerEvent(VolunteerEvent volunteerEvent);

    VolunteerEvent findVolunteerEventById(Integer id);

    Iterable<VolunteerEvent> findAllVolunteerEvents();

    void deleteVolunteerEvent(Integer id);

    VolunteerEvent findVolunteerEventByName(String name);
}

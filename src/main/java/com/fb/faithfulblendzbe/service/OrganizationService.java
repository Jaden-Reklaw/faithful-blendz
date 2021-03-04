package com.fb.faithfulblendzbe.service;

import com.fb.faithfulblendzbe.domain.Organization;
import com.fb.faithfulblendzbe.domain.VolunteerEvent;

import java.util.List;

public interface OrganizationService {

    Organization saveOrganization(Organization organization);

    Organization findOrganizationById(Integer id);

    Iterable<Organization> findAllOrganizations();

    void deleteOrganization(Integer id);

    Organization findOrganizationByName(String name);
}

package com.fb.faithfulblendzbe.repository;

import com.fb.faithfulblendzbe.domain.Organization;
import com.fb.faithfulblendzbe.domain.VolunteerEvent;
import org.springframework.data.repository.CrudRepository;

public interface OrganizationRepository extends CrudRepository<Organization, Integer> {

    Organization findOrganizationByName(String name);
}

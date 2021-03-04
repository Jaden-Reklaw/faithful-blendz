package com.fb.faithfulblendzbe.service.impl;

import com.fb.faithfulblendzbe.domain.Organization;
import com.fb.faithfulblendzbe.repository.OrganizationRepository;
import com.fb.faithfulblendzbe.service.OrganizationService;

import java.util.List;

public class OrganizationServiceImpl implements OrganizationService {

    private OrganizationRepository organizationRepository;

    public OrganizationServiceImpl(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    @Override
    public Organization saveOrganization(Organization organization) {
        return organizationRepository.save( organization );
    }

    @Override
    public Organization findOrganizationById(Integer id) {
        return organizationRepository.findById( id ).orElse( null );
    }

    @Override
    public Iterable<Organization> findAllOrganizations() {
        return organizationRepository.findAll();
    }

    @Override
    public void deleteOrganization(Integer id) {
        organizationRepository.deleteById( id );
    }

    @Override
    public Organization findOrganizationByName(String name) {
        return organizationRepository.findOrganizationByName( name );
    }
}

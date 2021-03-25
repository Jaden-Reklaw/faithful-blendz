package com.fb.faithfulblendzbe;

import com.fb.faithfulblendzbe.configuration.RepositoryConfiguration;
import com.fb.faithfulblendzbe.model.Organization;
import com.fb.faithfulblendzbe.repository.OrganizationRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RepositoryConfiguration.class)
public class OrganizationRepositoryTests {

    @Autowired
    OrganizationRepository organizationRepository;

    @Test
    public void testSaveAndRetrieveOrganization() {
        Organization org = new Organization();
        org.setOrganizationName("Holy Name Church");
        assertNull(org.getId());
        organizationRepository.save(org);
        assertNotNull(org.getId());

        Organization fetchedOrg = organizationRepository.findById(org.getId()).get();
        assertEquals(org.getId(), fetchedOrg.getId());
    }

    @Test
    public void testDeleteOrganization() {
        Organization org = new Organization();
        org.setOrganizationName("Holy Name Church");
        organizationRepository.save(org);
        Integer id = org.getId();
        organizationRepository.deleteById(id);
        assertTrue(organizationRepository.findById(id).isEmpty());
    }

    @Test
    public void testSaveListAndRetrieveListOrganizations() {
        for(Organization org : organizationRepository.findAll()) {
            organizationRepository.deleteById(org.getId());
        }
        ArrayList<Organization> orgs = new ArrayList<>();
        IntStream.range(0, 5).forEach( i -> {
            Organization org = new Organization();
            org.setOrganizationName("org"+i);
            orgs.add(org);
        });
        organizationRepository.saveAll(orgs);
        for (Organization org : orgs) {
            assertNotNull(org.getId());
        }
        Iterable<Organization> fetchedOrgs = organizationRepository.findAll();
        fetchedOrgs.forEach(org -> {
            assertNotNull(organizationRepository.findById(org.getId()));
        });
    }
}

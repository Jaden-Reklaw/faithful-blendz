package com.fb.faithfulblendzbe;

import com.fb.faithfulblendzbe.model.Organization;
import com.fb.faithfulblendzbe.repository.OrganizationRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.repository.config.RepositoryConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
}

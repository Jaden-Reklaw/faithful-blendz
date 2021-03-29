package com.fb.faithfulblendzbe;

import com.fb.faithfulblendzbe.configuration.RepositoryConfiguration;
import com.fb.faithfulblendzbe.model.Religion;
import com.fb.faithfulblendzbe.repository.ReligionRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RepositoryConfiguration.class)

public class ReligionRepositoryTests {

    @Autowired
    ReligionRepository religionRepository;

    @Test
    public void testSaveAndRetrieveReligion() {
        Religion religion = new Religion();
        religion.setReligion_name("Holy Name Church");
        assertNull(religion.getId());
        religionRepository.save(religion);
        assertNotNull(religion.getId());

        Religion fetchedReligion = religionRepository.findById(religion.getId()).get();
        assertEquals(religion.getId(), fetchedReligion.getId());
    }

    @Test
    public void testDeleteReligion() {
        Religion religion = new Religion();
        religion.setReligion_name("Holy Name Church");
        religionRepository.save(religion);
        Integer id = religion.getId();
        religionRepository.deleteById(id);
        assertTrue(religionRepository.findById(id).isEmpty());
    }

    @Test
    public void testSaveListAndRetrieveListReligions() {
        for(Religion religion : religionRepository.findAll()) {
            religionRepository.deleteById(religion.getId());
        }
        ArrayList<Religion> rel = new ArrayList<>();
        IntStream.range(0, 5).forEach( i -> {
            Religion religion = new Religion();
            religion.setReligion_name("religion"+i);
            rel.add(religion);
        });

        religionRepository.saveAll(rel);
        for (Religion religion : rel) {
            assertNotNull(religion.getId());
        }
        Iterable<Religion> fetchedReligions = religionRepository.findAll();
        fetchedReligions.forEach(religion -> {
            assertNotNull(religionRepository.findById(religion.getId()));
        });
    }
}

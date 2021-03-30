package com.fb.faithfulblendzbe;

import com.fb.faithfulblendzbe.configuration.RepositoryConfiguration;
import com.fb.faithfulblendzbe.model.Sect;
import com.fb.faithfulblendzbe.repository.SectRepository;
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
public class SectRepositoryTest {

    @Autowired
    SectRepository sectRepository;

    @Test
    public void testSaveAndRetrieveSect() {
        Sect sect = new Sect();
        sect.setSectName("Lutheran");
        assertNull(sect.getId());
        sectRepository.save(sect);
        assertNotNull(sect.getId());

        Sect fetchedSect = sectRepository.findById(sect.getId()).get();
        assertEquals(sect.getId(), fetchedSect.getId());
    }

    @Test
    public void testDeleteSect() {
        Sect sect = new Sect();
        sect.setSectName("Lutheran");
        sectRepository.save(sect);
        Integer id = sect.getId();
        sectRepository.deleteById(id);
        assertTrue(sectRepository.findById(id).isEmpty());
    }

    @Test
    public void testSaveListAndRetrieveListSects() {
        for(Sect sect : sectRepository.findAll()) {
            sectRepository.deleteById(sect.getId());
        }
        ArrayList<Sect> sec = new ArrayList<>();
        IntStream.range(0, 5).forEach( i -> {
            Sect sect = new Sect();
            sect.setSectName("sect"+i);
            sec.add(sect);
        });

        sectRepository.saveAll(sec);
        for (Sect sect : sec) {
            assertNotNull(sect.getId());
        }
        Iterable<Sect> fetchedSect = sectRepository.findAll();
        fetchedSect.forEach(sect -> {
            assertNotNull(sectRepository.findById(sect.getId()));
        });
    }
}

package com.fb.faithfulblendzbe.repositories;

import com.fb.faithfulblendzbe.configuration.RepositoryConfiguration;
import com.fb.faithfulblendzbe.model.Lesson;
import com.fb.faithfulblendzbe.model.Organization;
import com.fb.faithfulblendzbe.repository.OrganizationRepository;
import com.fb.faithfulblendzbe.repository.doc.LessonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RepositoryConfiguration.class)
public class LessonRepositoryTest {
    @Autowired
    LessonRepository lessonRepository;
    @Autowired
    OrganizationRepository organizationRepository;

    Organization testOrg = new Organization();




    @Test
    public void testSaveAndRetrieveLesson() {
        organizationRepository.save(testOrg);
        Lesson lesson = new Lesson();
        lesson.setLessonName("Lesson");
        lesson.setOrganization(testOrg);
        assertNull(lesson.getId());
        lessonRepository.save(lesson);
        assertNotNull(lesson.getId());

        Lesson fetchedLesson = lessonRepository.findById(lesson.getId()).get();
        assertEquals(lesson.getId(), fetchedLesson.getId());
    }

    @Test
    public void testDeleteLesson() {
        organizationRepository.save(testOrg);
        Lesson lesson = new Lesson();
        lesson.setLessonName("Lesson");
        lesson.setOrganization(testOrg);
        lessonRepository.save(lesson);
        Integer id = lesson.getId();
        lessonRepository.deleteById(id);
        assertTrue(lessonRepository.findById(id).isEmpty());
    }

    @Test
    public void testSaveListAndRetrieveList() {
        organizationRepository.save(testOrg);
        lessonRepository.findAll().forEach(lesson -> lessonRepository.deleteById(lesson.getId()));

        ArrayList<Lesson> lessons = new ArrayList<>();
        IntStream.range(0,5).forEach(i -> {
            Lesson lesson = new Lesson();
            lesson.setLessonName("Lesson"+i);
            lesson.setOrganization(testOrg);
            lessons.add(lesson);
        });
        lessonRepository.saveAll(lessons);
        lessons.forEach(lesson -> {
            assertNotNull(lesson.getId());
            assertTrue(lessonRepository.findById(lesson.getId()).isPresent());
        });
    }
}

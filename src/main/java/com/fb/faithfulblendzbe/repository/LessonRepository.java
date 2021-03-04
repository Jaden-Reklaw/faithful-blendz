package com.fb.faithfulblendzbe.repository;

import com.fb.faithfulblendzbe.domain.Lesson;
import com.fb.faithfulblendzbe.domain.VolunteerEvent;
import org.springframework.data.repository.CrudRepository;

public interface LessonRepository extends CrudRepository<Lesson, Integer> {

    Lesson findLessonByName(String name);
}

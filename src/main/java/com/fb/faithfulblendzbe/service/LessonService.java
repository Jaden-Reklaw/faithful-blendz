package com.fb.faithfulblendzbe.service;

import com.fb.faithfulblendzbe.domain.Lesson;
import com.fb.faithfulblendzbe.domain.VolunteerEvent;

import java.util.List;

public interface LessonService {

    Lesson saveLesson(Lesson lesson);

    Lesson findLessonById(Integer id);

    Iterable<Lesson> findAllLessons();

    void deleteLesson(Integer id);

    Lesson findLessonByName(String name);
}

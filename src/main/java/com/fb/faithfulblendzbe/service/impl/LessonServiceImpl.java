package com.fb.faithfulblendzbe.service.impl;

import com.fb.faithfulblendzbe.domain.Lesson;
import com.fb.faithfulblendzbe.repository.LessonRepository;
import com.fb.faithfulblendzbe.service.LessonService;

import java.util.List;

public class LessonServiceImpl implements LessonService {

    private LessonRepository lessonRepository;

    public LessonServiceImpl(LessonRepository lessonRepository){ this.lessonRepository = lessonRepository; }

    @Override
    public Lesson saveLesson(Lesson lesson) {
        return lessonRepository.save(lesson);
    }

    @Override
    public Lesson findLessonById(Integer id) {
        return lessonRepository.findById( id ).orElse( null );
    }

    @Override
    public Iterable<Lesson> findAllLessons() {
        return lessonRepository.findAll();
    }

    @Override
    public void deleteLesson(Integer id) {
        lessonRepository.deleteById( id );
    }

    @Override
    public Lesson findLessonByName(String name) {
        return lessonRepository.findLessonByName( name );
    }
}

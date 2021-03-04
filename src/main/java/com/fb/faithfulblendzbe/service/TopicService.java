package com.fb.faithfulblendzbe.service;

import com.fb.faithfulblendzbe.domain.Topic;
import com.fb.faithfulblendzbe.domain.VolunteerEvent;

import java.util.List;

public interface TopicService {

    Topic saveTopic(Topic topic);

    Topic findTopicById(Integer id);

    Iterable<Topic> findAllTopics();

    void deleteTopic(Integer id);

    Topic findTopicByName(String name);
}

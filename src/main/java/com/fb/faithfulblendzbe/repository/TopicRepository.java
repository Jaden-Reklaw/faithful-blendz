package com.fb.faithfulblendzbe.repository;

import com.fb.faithfulblendzbe.domain.Topic;
import com.fb.faithfulblendzbe.domain.VolunteerEvent;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, Integer> {

    Topic findByTopicName(String name);
}

package com.fb.faithfulblendzbe.service.impl;

import com.fb.faithfulblendzbe.domain.Topic;
import com.fb.faithfulblendzbe.repository.TopicRepository;
import com.fb.faithfulblendzbe.service.TopicService;

import java.util.List;

public class TopicServiceImpl implements TopicService {

    private TopicRepository topicRepository;

    public TopicServiceImpl(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    @Override
    public Topic saveTopic(Topic topic) {
        return topicRepository.save(topic);
    }

    @Override
    public Topic findTopicById(Integer id) {
        return topicRepository.findById( id ).orElse( null );
    }

    @Override
    public Iterable<Topic> findAllTopics() {
        return topicRepository.findAll();
    }

    @Override
    public void deleteTopic(Integer id) {
        topicRepository.deleteById( id );
    }

    @Override
    public Topic findTopicByName(String name) {
        return topicRepository.findByTopicName( name );
    }
}

package com.fb.faithfulblendzbe.repositories;

import com.fb.faithfulblendzbe.configuration.RepositoryConfiguration;
import com.fb.faithfulblendzbe.model.Organization;
import com.fb.faithfulblendzbe.model.Topic;
import com.fb.faithfulblendzbe.repository.TopicRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RepositoryConfiguration.class)
public class TopicRepositoryTest {
    @Autowired
    TopicRepository topicRepository;


    @Test
    public void testSaveAndRetrieveTopic() {
        Topic topic = new Topic();
        topic.setTopicName("Holy Ghost");
        assertNull(topic.getId());
        topicRepository.save(topic);
        assertNotNull(topic.getId());

        Topic fetchedTopic = topicRepository.findById(topic.getId()).get();
        assertEquals(topic.getId(), fetchedTopic.getId());
    }

    @Test
    public void testDeleteTopic() {
        Topic topic = new Topic();
        topic.setTopicName("End Of Times");
        topicRepository.save(topic);
        Integer id = topic.getId();
        topicRepository.deleteById(id);
        assertTrue(topicRepository.findById(id).isEmpty());
    }

    @Test
    public void testSaveListAndRetrieveList() {
        topicRepository.findAll().forEach(t -> {
            topicRepository.deleteById(t.getId());
        });
        ArrayList<Topic> topics = new ArrayList<>();
        IntStream.range(0,5).forEach(i -> {
            Topic topic = new Topic();
            topic.setTopicName("topic" + i);
            topics.add(topic);
        });
        topicRepository.saveAll(topics);

        topicRepository.findAll().forEach(topic -> assertNotNull(topicRepository.findById(topic.getId()).get()));

    }

}

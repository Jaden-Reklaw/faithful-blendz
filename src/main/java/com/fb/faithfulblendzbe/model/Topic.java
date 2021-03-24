package com.fb.faithfulblendzbe.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "topic")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TopicId")
    private Integer id;

    @Version
    private Integer version;

    private String topicName;

    @ManyToMany
    @JoinTable(name = "lesson_topic",
            joinColumns = { @JoinColumn(name = "fk_topic")},
            inverseJoinColumns = { @JoinColumn(name = "fk_lesson")})
    private Set<Lesson> lesson = new HashSet<Lesson>();

    public Topic(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public Set<Lesson> getLesson() {
        return lesson;
    }

    public void setLesson(Set<Lesson> lesson) {
        this.lesson = lesson;
    }
}
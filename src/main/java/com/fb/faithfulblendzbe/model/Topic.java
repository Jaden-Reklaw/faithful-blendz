package com.fb.faithfulblendzbe.model;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
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
}
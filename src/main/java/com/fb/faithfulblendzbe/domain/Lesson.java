package com.fb.faithfulblendzbe.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "lesson")
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "LessonId")
    private Integer id;

    @Version
    private Integer version;

    private String lessonName;
    private String description;
    private String contentUrl;


//    @OneToMany(mappedBy = "lesson")
//    private Set<Organization> organization;

    @ManyToOne
    @JoinColumn(name = "organization_id", nullable = false)
    private Organization organization;


    public Lesson(){}
}
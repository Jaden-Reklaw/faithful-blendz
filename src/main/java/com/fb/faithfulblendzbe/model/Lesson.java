package com.fb.faithfulblendzbe.model;


import javax.persistence.*;


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

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
}
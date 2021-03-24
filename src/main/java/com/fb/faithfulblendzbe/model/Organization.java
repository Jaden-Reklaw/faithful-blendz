package com.fb.faithfulblendzbe.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "organization")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "OrganizationId")
    private Integer id;

    @Version
    private Integer version;

    private String emailId;
    private String organizationName;
    private String imageUrl;
    private String donationUrl;
    private String websiteUrl;
    private String summary;
    private String livestreamUrl;

    @OneToMany(mappedBy = "organization")
    private Set<Lesson> lesson;

    @OneToMany(mappedBy = "organization")
    private Set<VolunteerEvent> volunteerEvents;

    //OneToOne with contact table
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_id", referencedColumnName = "ContactId")
    private Contact contact;

    //Creating ManyToMany join table with sect
    @ManyToMany
    @JoinTable(name = "organization_sect",
               joinColumns = { @JoinColumn(name = "fk_organization")},
               inverseJoinColumns = { @JoinColumn(name = "fk_sect")})
    private Set<Sect> sect = new HashSet<Sect>();

    //Creating ManyToMany join table with user
    @ManyToMany
    @JoinTable(name = "favorite",
            joinColumns = @JoinColumn(name = "fk_organization"),
            inverseJoinColumns = { @JoinColumn(name = "fk_user")})
    private Set<com.fb.faithfulblendzbe.model.User> user = new HashSet<User>();

    public Organization(){}

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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDonationUrl() {
        return donationUrl;
    }

    public void setDonationUrl(String donationUrl) {
        this.donationUrl = donationUrl;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getLivestreamUrl() {
        return livestreamUrl;
    }

    public void setLivestreamUrl(String livestreamUrl) {
        this.livestreamUrl = livestreamUrl;
    }

    public Set<Lesson> getLesson() {
        return lesson;
    }

    public void setLesson(Set<Lesson> lesson) {
        this.lesson = lesson;
    }

    public Set<VolunteerEvent> getVolunteerEvents() {
        return volunteerEvents;
    }

    public void setVolunteerEvents(Set<VolunteerEvent> volunteerEvents) {
        this.volunteerEvents = volunteerEvents;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Set<Sect> getSect() {
        return sect;
    }

    public void setSect(Set<Sect> sect) {
        this.sect = sect;
    }

    public Set<User> getUser() {
        return user;
    }

    public void setUser(Set<User> user) {
        this.user = user;
    }
}
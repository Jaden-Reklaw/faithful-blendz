package com.fb.faithfulblendzbe.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
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
    private Set<User> user = new HashSet<User>();

    public Organization(){}
}
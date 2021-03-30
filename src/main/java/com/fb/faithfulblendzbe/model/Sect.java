package com.fb.faithfulblendzbe.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "sect")
public class Sect {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SectId")
    private Integer id;

    @Version
    private Integer version;
    private String sectName;

    @ManyToOne
    @JoinColumn(name = "religion_id")
    private Religion religion;

    @ManyToMany(mappedBy = "sect")
    private Set<Organization> organizations = new HashSet<Organization>();

    public Sect(){}

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

    public String getSectName() {
        return sectName;
    }

    public void setSectName(String sectName) {
        this.sectName = sectName;
    }

    public Religion getReligion() {
        return religion;
    }

    public void setReligion(Religion religion) {
        this.religion = religion;
    }

    public Set<Organization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(Set<Organization> organizations) {
        this.organizations = organizations;
    }
}

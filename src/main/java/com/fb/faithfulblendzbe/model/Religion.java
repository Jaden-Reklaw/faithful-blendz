package com.fb.faithfulblendzbe.model;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "religions")
public class Religion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ReligionId")
    private Integer id;

    @Version
    private Integer version;

    private String religionName;

    @OneToMany(mappedBy = "religion")
    private Set<Sect> sects;

    public Religion(){}

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

    public String getReligionName() {
        return religionName;
    }

    public void setReligionName(String religionName) {
        this.religionName = religionName;
    }

    public Set<Sect> getSects() {
        return sects;
    }

    public void setSects(Set<Sect> sects) {
        this.sects = sects;
    }
}
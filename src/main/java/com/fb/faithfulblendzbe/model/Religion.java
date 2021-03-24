package com.fb.faithfulblendzbe.model;

import javax.persistence.*;

@Entity
public class Religion {
    //region Properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Version
    private Integer version;

    private String religion_name;
    //endregion

    //region Constructors

    public Religion(String religion_name) {
        this.religion_name = religion_name;
    }

    public Religion() {}
    //endregion

    //region Setters and Getters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReligion_name() {
        return religion_name;
    }

    public void setReligion_name(String religion_name) {
        this.religion_name = religion_name;
    }
    //endregion

    //region custom Methods
    @Override
    public String toString() {
        return "Religion{" +
                "id=" + id +
                ", religion_name='" + religion_name + '\'' +
                '}';
    }
    //endregion
}


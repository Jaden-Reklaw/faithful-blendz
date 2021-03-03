package com.fb.faithfulblendzbe.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ContactId")
    private Integer id;

    @Version
    private Integer version;

    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String phone;

    //ONE TO ONE MAPPING WITH ORGANIZATION /
    @OneToOne(mappedBy = "contact")
    private Organization organization;

    public Contact(){}
}
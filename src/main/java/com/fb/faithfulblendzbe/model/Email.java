package com.fb.faithfulblendzbe.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "email")
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EmailId")
    private Integer id;

    @Version
    private Integer version;

    private String emailName;
    private String emailVerified;

   @OneToOne(mappedBy = "email")
    private User user;

    public Email(){}

}
package com.fb.faithfulblendzbe.domain;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "UserId")
    private Integer id;

    @Version
    private Integer version;

    private String firstName;
    private String lastName;
    private String imageUrl;
    private String provider;
    private int providerId;
    private String role;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "email_id", referencedColumnName = "EmailId")
    private Email email;

    public User(){}

}
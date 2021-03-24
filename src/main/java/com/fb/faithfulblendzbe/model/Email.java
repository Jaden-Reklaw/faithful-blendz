//package com.fb.faithfulblendzbe.model;
//
//import javax.persistence.*;
//
//
//@Entity
//@Table(name = "email")
//public class Email {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "EmailId")
//    private Integer id;
//
//    @Version
//    private Integer version;
//
//    private String emailName;
//    private String emailVerified;
//
//   @OneToOne(mappedBy = "email")
//    private User user;
//
//    public Email(){}
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public Integer getVersion() {
//        return version;
//    }
//
//    public void setVersion(Integer version) {
//        this.version = version;
//    }
//
//    public String getEmailName() {
//        return emailName;
//    }
//
//    public void setEmailName(String emailName) {
//        this.emailName = emailName;
//    }
//
//    public String getEmailVerified() {
//        return emailVerified;
//    }
//
//    public void setEmailVerified(String emailVerified) {
//        this.emailVerified = emailVerified;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//}
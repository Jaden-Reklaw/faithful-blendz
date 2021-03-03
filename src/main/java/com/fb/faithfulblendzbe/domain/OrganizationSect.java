//package com.faithfulblendz.backend.domain;
//
//import javax.persistence.*;
//
//@Entity
//public class OrganizationSect {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "OrganizationSectId")
//    private Integer id;
//
//    @Version
//    private Integer version;
//
//    @ManyToOne
//    @JoinColumn(name = "sect_id", nullable = false)
//    private Sect sect;
//}
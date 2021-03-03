package com.fb.faithfulblendzbe.domain;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
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
    @JoinColumn(name = "religion_id", nullable = false)
    private Religion religion;

    @ManyToMany(mappedBy = "sect")
    private Set<Organization> organizations = new HashSet<Organization>();

    public Sect(){}
}

package com.fb.faithfulblendzbe.domain;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
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
}
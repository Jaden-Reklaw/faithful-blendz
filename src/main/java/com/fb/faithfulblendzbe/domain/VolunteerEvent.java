package com.fb.faithfulblendzbe.domain;
import lombok.Data;

import javax.persistence.*;
import java.time.DateTimeException;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name = "volunteer_event")
public class VolunteerEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "VolunteerEventId")
    private Integer id;

    @Version
    private Integer version;

    private String eventName;
    private String eventUrl;
    private String eventDescription;

    @ManyToOne
    @JoinColumn(name = "organization_id", nullable = false)
    private Organization organization;

    private Date startDateTime;
    private Date endDateTime;

    public VolunteerEvent(){}
}
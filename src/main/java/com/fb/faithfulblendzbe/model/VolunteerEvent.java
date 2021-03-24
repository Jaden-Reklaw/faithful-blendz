package com.fb.faithfulblendzbe.model;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

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

    private String volunteerEventName;
    private String volunteerEventUrl;
    private String volunteerEventDescription;

    @ManyToOne
    @JoinColumn(name = "organization_id", nullable = false)
    private Organization organization;

    private Date startDateTime;
    private Date endDateTime;

    public VolunteerEvent(){}
}
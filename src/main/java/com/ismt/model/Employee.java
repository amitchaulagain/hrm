package com.ismt.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private String middleName;

    @Getter
    @Setter
    private String lastName;


    @Getter
    @Setter
    private Timestamp dob;


    @Getter
    @Setter
    private Timestamp citizenshipNumber;
    @Getter
    @Setter
    private int age;

    @Getter
    @Setter
    private String birthPlace;

    @Getter
    @Setter
    private String height;

    @Getter
    @Setter
    private float weight;


    @Getter
    @Setter
    @Embedded
    private PersonalContactInfo personalContactInfo;


    @Getter
    @Setter
    @Embedded
    private CompanyContactInfo companyContactInfo;

    @Getter
    @Setter
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<Attendance> attendances;


}

package com.ismt.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author Amit Chaulagain on 12/08/2020
 * @version 1.0
 * A class to represent a [[Address]]
 */
@Entity
public class Attendance {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private Timestamp clockIn;

    @Getter
    @Setter
    private Timestamp clockOut;


    @Getter
    @Setter
    private String reason;


    @Getter
    @Setter
    @JoinColumn(name = "employee_id")
    @ManyToOne
    private Employee employee;


}
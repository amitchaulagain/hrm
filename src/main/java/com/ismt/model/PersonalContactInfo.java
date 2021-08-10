package com.ismt.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Amit Chaulagain on 12/08/2020
 * @version 1.0
 * A class to represent a [[Address]]
 */
@Embeddable
public class PersonalContactInfo {

    @Getter
    @Setter
    @Column(name = "email")
    private String email;

    @Getter
    @Setter
    @Column(name = "mobile_number")
    private String mobileNumber;


    @Getter
    @Setter
    @Column(name = "landline_number")
    private String landlineNumber;

    @Getter
    @Setter
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "permanent_street")),
            @AttributeOverride(name = "town", column = @Column(name = "permanent_town")),
            @AttributeOverride(name = "province", column = @Column(name = "permanent_province")),
            @AttributeOverride(name = "postalCode", column = @Column(name = "permanent_postal_code")),
            @AttributeOverride(name = "country", column = @Column(name = "permanent_country")),

    })
    private Address permanentAddress;


    @Getter
    @Setter

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "temporary_street")),
            @AttributeOverride(name = "town", column = @Column(name = "temporary_town")),
            @AttributeOverride(name = "province", column = @Column(name = "temporary_province")),
            @AttributeOverride(name = "postalCode", column = @Column(name = "temporary_postal_code")),
            @AttributeOverride(name = "country", column = @Column(name = "temporary_country")),

    })
    private Address temporaryAddress;
}
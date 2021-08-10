package com.ismt.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Amit Chaulagain on 12/08/2020
 * @version 1.0
 * A class to represent a [[Address]]
 *
 *
 */
@Embeddable
public class CompanyContactInfo {

    @Getter
    @Setter
    @Column(name = "company_email")
    private String email;

    @Getter
    @Setter
    @Column(name = "company_fax")
    private String fax;

    @Getter
    @Setter
    @Column(name = "company_phone_number")
    private String phoneNumber;

    @Getter
    @Setter
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "company_street")),
            @AttributeOverride(name = "town", column = @Column(name = "company_town")),
            @AttributeOverride(name = "province", column = @Column(name = "company_province")),
            @AttributeOverride(name = "postalCode", column = @Column(name = "company_postal_code")),
            @AttributeOverride(name = "country", column = @Column(name = "company_country")),

    })
    private Address companyAddress;


}
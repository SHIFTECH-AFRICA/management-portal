package com.company.managementportal.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Table(name = "MANAGEMENTPORTAL_CLIENT", indexes = {
        @Index(name = "IDX_MANAGEMENTPORTAL_CLIENT_EMAIL", columnList = "EMAIL"),
        @Index(name = "IDX_MANAGEMENTPORTAL_CLIENT_PHONE_NUMBER", columnList = "PHONE_NUMBER")
})
@Entity(name = "managementportal_Client")
@NamePattern("%s|firstName")
public class Client extends StandardEntity {
    private static final long serialVersionUID = 5677102576546645851L;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @NotNull
    @Column(name = "COMPANY", nullable = false)
    private String company;

    @NotNull
    @Column(name = "PHONE_NUMBER", nullable = false, unique = true)
    private String phoneNumber;

    @NotNull
    @Column(name = "EMAIL", nullable = false, unique = true)
    @Email
    private String email;

    @NotNull
    @Column(name = "ACTIVE", nullable = false)
    private Boolean active = false;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
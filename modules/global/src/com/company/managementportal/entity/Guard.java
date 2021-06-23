package com.company.managementportal.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "MANAGEMENTPORTAL_GUARD", indexes = {
        @Index(name = "IDX_MANAGEMENTPORTAL_GUARD_FIRST_NAME", columnList = "FIRST_NAME"),
        @Index(name = "IDX_MANAGEMENTPORTAL_GUARD_PHONE_NUMBER", columnList = "PHONE_NUMBER")
})
@Entity(name = "managementportal_Guard")
@NamePattern("%s|firstName")
public class Guard extends StandardEntity {
    private static final long serialVersionUID = 5973445404755028536L;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @NotNull
    @Column(name = "POSTED_SECTION", nullable = false)
    private String postedSection;

    @NotNull
    @Column(name = "PHONE_NUMBER", nullable = false, unique = true)
    private Integer phoneNumber;

    @NotNull
    @Column(name = "ACTIVE", nullable = false)
    private Boolean active = false;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPostedSection() {
        return postedSection;
    }

    public void setPostedSection(String postedSection) {
        this.postedSection = postedSection;
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
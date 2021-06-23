package com.company.managementportal.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Table(name = "MANAGEMENTPORTAL_SUPPLIER", indexes = {
        @Index(name = "IDX_MANAGEMENTPORTAL_SUPPLIER_EMAIL", columnList = "EMAIL")
})
@Entity(name = "managementportal_Supplier")
@NamePattern("%s|name")
public class Supplier extends StandardEntity {
    private static final long serialVersionUID = -8713649191110294436L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @NotNull
    @Column(name = "EMAIL", nullable = false, unique = true)
    @Email
    private String email;

    @Column(name = "LOCATION")
    private String location;

    @NotNull
    @Column(name = "ACTIVE", nullable = false)
    private Boolean active = false;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
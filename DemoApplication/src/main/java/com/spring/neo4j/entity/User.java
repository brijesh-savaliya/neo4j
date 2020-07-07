package com.spring.neo4j.entity;

import org.neo4j.ogm.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NodeEntity(label = "user")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String contact;

    @Relationship(type = "RESIDENCE_IN", direction = Relationship.OUTGOING)
    private List<Address> addresses = new ArrayList();

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getContact() {
        return contact;
    }

    public List<Address> getAddresses() {
        return addresses;
    }
}

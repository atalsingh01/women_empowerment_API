package com.app.women.empowerment.models;

import jakarta.persistence.*;

@Entity
@Table(name = "helplines")
public class Helpline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;        // e.g. "Women Helpline"

    private String number;      // e.g. "1091"

    private String description; // What kind of help they provide

    private String available;   // e.g. "24/7"

    public Helpline() {
    }

    public Helpline(String available, String description, Long id, String name, String number) {
        this.available = available;
        this.description = description;
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
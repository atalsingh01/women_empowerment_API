package com.app.women.empowerment.models;

import jakarta.persistence.*;

@Entity
@Table(name = "government_schemes")
public class Scheme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String eligibility;

    private String benefit;

    private String ministry; // e.g. "Ministry of Women & Child Development"

    public Scheme() {
    }

    public Scheme(String benefit, String description, String eligibility, Long id, String ministry, String name) {
        this.benefit = benefit;
        this.description = description;
        this.eligibility = eligibility;
        this.id = id;
        this.ministry = ministry;
        this.name = name;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEligibility() {
        return eligibility;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMinistry() {
        return ministry;
    }

    public void setMinistry(String ministry) {
        this.ministry = ministry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
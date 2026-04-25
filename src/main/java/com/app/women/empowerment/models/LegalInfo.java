package com.app.women.empowerment.models;

import jakarta.persistence.*;

@Entity
@Table(name = "legal_info")
public class LegalInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String lawName;

    private String year;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String keyPoints;

    public LegalInfo() {
    }

    public LegalInfo(String description, Long id, String keyPoints, String lawName, String year) {
        this.description = description;
        this.id = id;
        this.keyPoints = keyPoints;
        this.lawName = lawName;
        this.year = year;
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

    public String getKeyPoints() {
        return keyPoints;
    }

    public void setKeyPoints(String keyPoints) {
        this.keyPoints = keyPoints;
    }

    public String getLawName() {
        return lawName;
    }

    public void setLawName(String lawName) {
        this.lawName = lawName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
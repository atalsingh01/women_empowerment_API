package com.app.women.empowerment.models;

import jakarta.persistence.*;

@Entity
@Table(name = "constitutional_rights")
public class Rights {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String articleNumber; // e.g. "Article 14", "Article 21"

    public Rights() {
    }

    public Rights(String articleNumber, String description, Long id, String title) {
        this.articleNumber = articleNumber;
        this.description = description;
        this.id = id;
        this.title = title;
    }

    public String getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(String articleNumber) {
        this.articleNumber = articleNumber;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
package com.spark.entity;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ideas")
public class Idea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idea_id")
    private Integer ideaId;

    @ManyToOne
    @JoinColumn(name = "student_id")   // ✅ matches DB
    private User student;

    private String title;
    private String description;
    private String category;

    @Enumerated(EnumType.STRING)
    private IdeaStatus status;

    @Column(name = "submitted_at")
    private Timestamp submittedAt;

    // Getters and Setters
}
package com.spark.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ratings")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ratingId;

    @ManyToOne
    @JoinColumn(name = "idea_id")
    private Idea idea;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Integer score;
    private String comment;

    public Integer getRatingId() { return ratingId; }
    public void setRatingId(Integer ratingId) { this.ratingId = ratingId; }

    public Idea getIdea() { return idea; }
    public void setIdea(Idea idea) { this.idea = idea; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Integer getScore() { return score; }
    public void setScore(Integer score) { this.score = score; }

    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }
}
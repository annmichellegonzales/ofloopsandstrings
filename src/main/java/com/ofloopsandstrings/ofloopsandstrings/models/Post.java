package com.ofloopsandstrings.ofloopsandstrings.models;

import javax.persistence.*;

@Entity
@Table(name = "posts")

public class Post {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String post_title;

    @Column(nullable = false)
    private String post_body;

    public Post(long id, String post_title, String post_body) {
        this.id = id;
        this.post_title = post_title;
        this.post_body = post_body;
    }

    public Post() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPost_title() {
        return post_title;
    }

    public void setPost_title(String post_title) {
        this.post_title = post_title;
    }

    public String getPost_body() {
        return post_body;
    }

    public void setPost_body(String post_body) {
        this.post_body = post_body;
    }
}

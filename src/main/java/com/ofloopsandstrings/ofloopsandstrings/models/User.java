package com.ofloopsandstrings.ofloopsandstrings.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @ManyToMany(mappedBy = "categoryList")
    @JsonBackReference
    private List<Post> categoryList;

    public User() {
    }

    public User(long id, String username, String password, List categoryList) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.categoryList = categoryList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Post> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Post> categoryList) {
        this.categoryList = categoryList;
    }
}

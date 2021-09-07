package com.ofloopsandstrings.ofloopsandstrings.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

//    @ManyToMany(mappedBy = "categories")
//    @JsonBackReference
//    private List<Post> categories;

    public Category() {
    }

    public Category(long id, String name, List<Post> categories) {
        this.id = id;
        this.name = name;
//        this.categories = categories;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<Post> getCategories() {
//        return categories;
//    }
//
//    public void setCategories(List<Post> categories) {
//        this.categories = categories;
//    }
}

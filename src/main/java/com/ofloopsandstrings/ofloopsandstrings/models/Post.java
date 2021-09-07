package com.ofloopsandstrings.ofloopsandstrings.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "posts")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String body;

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "posts_categories",
//            joinColumns = @JoinColumn(name = "post_id", referencedColumnName = "categories_id"))
//    @JsonManagedReference
//    private List<Category> categories;

    public Post() {

    }

    public Post(long id, String title, String body, List<Category> categories) {
        this.id = id;
        this.title = title;
        this.body = body;
//        this.categories = categories;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

//    public List<Category> getCategories() {
//        return categories;
//    }
//
//    public void setCategories(List<Category> categories) {
//        this.categories = categories;
//    }
}

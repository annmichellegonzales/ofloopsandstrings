package com.ofloopsandstrings.ofloopsandstrings.models;

import org.springframework.stereotype.Controller;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Controller
public class User {

    @Id
    @GeneratedValue
    private long id;


}

package com.studies.springbootmongodb.dto;

import com.studies.springbootmongodb.domain.User;

import java.io.Serializable;

public class AuthorDto implements Serializable {

    private String id;
    private String name;


    public AuthorDto() {
    }

    public AuthorDto (User author){
        id = author.getId();
        name = author.getName();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.studies.springbootmongodb.dto;

import com.studies.springbootmongodb.domain.User;

import java.io.Serializable;

public class UserDto implements Serializable {

    private String id;
    private String name;
    private String email;

    public UserDto() {
    }

    public UserDto(User user){
        id = user.getId();
        name = user.getName();
        email = user.getEmail();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

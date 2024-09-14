package com.andres.curso.springboot.webapp.springboot_web.Models.dto;

import com.andres.curso.springboot.webapp.springboot_web.Models.User;

public class UserDto {

    private String title;
    private String user;
    private String lastname;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}

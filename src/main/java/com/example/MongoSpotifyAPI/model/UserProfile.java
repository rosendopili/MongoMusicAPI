package com.example.MongoSpotifyAPI.model;

import org.springframework.data.mongodb.core.index.Indexed;

public class UserProfile {

    @Indexed(unique = true)
    private String email;

    public String getEmail(){return email;}

    public void setEmail(String email){this.email = email;}
}

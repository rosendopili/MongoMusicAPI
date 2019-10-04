package com.example.MongoSpotifyAPI.model;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;

@Document
public class User {

    private String id;

    @Indexed(unique = true)
    private String username;

    private String password;

    private UserProfile userProfile;
    //The user document will be embedding the userProfile information.

    @DBRef
    private List<Song> songs;
    //This NoSQL table will be referencing the Songs list.

    public User(){}
    //user object constructor

    public List<Song> getSongs(){ return songs;}

    public void setSongs (List<Song> songs){this.songs = songs;}

    public String getId(){ return id;}

    public void setId(String id){this.id = id;}

    public String getUsername(){return username;}

    public void setUsername(){this.username = username;}

    public String getPassword(){return password;}

    public void setPassword(String password){this.password = password;}

}

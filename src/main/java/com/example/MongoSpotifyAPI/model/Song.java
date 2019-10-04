package com.example.MongoSpotifyAPI.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Song {

    //Song parameters
    @Id
    private String id;

    private String title;

    private double length;

    private String artist;

    private String genre;

    //Song Constructor//
    public Song(){}

    //Getter Setter Methods//
    public String getId(){return id;}

    public void setId(String id){this.id = id;}

    public String getTitle(){return title;}

    public void setTitle(String title){this.title = title;}

    public double getLength(){return length;}

    public void setLength(double length){this.length = length;}

    public String getGenre(){return genre;}

    public void setGenre(String genre){this.genre = genre;}

}

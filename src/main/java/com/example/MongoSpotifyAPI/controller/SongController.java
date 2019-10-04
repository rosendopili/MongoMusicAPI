package com.example.MongoSpotifyAPI.controller;

import com.example.MongoSpotifyAPI.model.Song;
import com.example.MongoSpotifyAPI.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/songs")
public class SongController {

    @Autowired
    SongService songService;

    //200 ok for add song, no value returned in postman//
    @PostMapping("/add")
    public Song addSong(@RequestBody Song song){
        return songService.addSong(song);
    }

    //200 ok on postman for list//
    @GetMapping("/list")
    public List<Song> listSongs(){
        return songService.listSongs();
    }

    @GetMapping("/genre")
    public Song findBySongGenre(String genre){
        return songService.findBySongGenre(genre);
    }

    @GetMapping("/artist")
    public Song findBySongArtist(String artist){
        return songService.findBySongArtist(artist);
    }

    @GetMapping("/title")
    public Song findBySongTitle(String title){
        return songService.findBySongTitle(title);
    }

    //all get requests are returning 200 OK status.
}

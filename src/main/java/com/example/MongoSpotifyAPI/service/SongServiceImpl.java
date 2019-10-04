package com.example.MongoSpotifyAPI.service;

import com.example.MongoSpotifyAPI.model.Song;
import com.example.MongoSpotifyAPI.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService{

    @Autowired
    SongRepository songRepository;


    @Override
    public Song findBySongTitle(String title) {
        return songRepository.findByTitle(title);
    }

    @Override
    public List<Song> listSongs() {
        return songRepository.findAll();
    }

    @Override
    public Song findBySongGenre(String genre) {
        return songRepository.findByGenre(genre);
    }

    @Override
    public Song findBySongArtist(String artist) {
        return songRepository.findByArtist(artist);
    }

    @Override
    public Song addSong(Song song){
        return songRepository.addSong(song);
    }
}

package com.example.MongoSpotifyAPI.service;

import com.example.MongoSpotifyAPI.model.Song;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SongService {

    /**
     *
     * @param title
     * @return
     */
    public Song findBySongTitle(String title);

    /**
     *
     * @return
     */
    public List<Song> listSongs();

    /**
     *
     * @param genre
     * @return
     */
    public Song findBySongGenre(String genre);

    /**
     *
     * @param artist
     * @return
     */
    public Song findBySongArtist(String artist);

    /**
     *
     * @param song
     * @return
     */
    public Song addSong(Song song);

}

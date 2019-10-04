package com.example.MongoSpotifyAPI.repository;

import com.example.MongoSpotifyAPI.model.Song;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends MongoRepository<Song, String> {
    public Song findByTitle(String title);

    public Song findByArtist(String artist);

    public Song findByGenre(String genre);

    @Query("{'User.song' : ?0}")
    public Song addSong(Song song);
}

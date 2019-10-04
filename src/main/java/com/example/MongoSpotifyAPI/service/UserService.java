package com.example.MongoSpotifyAPI.service;

import com.example.MongoSpotifyAPI.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    /**
     *
     * @param newUser
     * @return
     */

    public User createUser(User newUser);

    /**
     *
     * @param email
     * @return
     */

    public User findUserByEmail(String email);

    /**
     *
     * @return
     */

    public List<User> listUsers();

}

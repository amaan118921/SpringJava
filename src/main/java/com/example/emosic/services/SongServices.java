package com.example.emosic.services;
import com.example.emosic.models.Song;
import com.example.emosic.repositories.SongRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SongServices {
    @Autowired
    private SongRepository repo;

    public List<Song> allSongs() {
        return repo.findAll();
    }

    public List<Song> songsByType(String type) {
        return repo.findByType(type);
    }

}

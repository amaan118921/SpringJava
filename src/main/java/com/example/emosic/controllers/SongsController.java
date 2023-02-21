package com.example.emosic.controllers;


import com.example.emosic.models.Song;
import com.example.emosic.services.SongServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/get")
@RestController
public class SongsController {

    @Autowired
    private SongServices songService;

    @GetMapping("/songs")
    public ResponseEntity<List<Song>> getAllSongs() {
        List<Song> list = songService.allSongs();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/songs/{type}") 
    public ResponseEntity<List<Song>> getSongById(@PathVariable String type) {
        return new ResponseEntity<>(songService.songsByType(type), HttpStatus.OK);
    }
}

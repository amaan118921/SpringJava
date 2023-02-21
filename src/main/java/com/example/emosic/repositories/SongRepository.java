package com.example.emosic.repositories;

import com.example.emosic.models.Song;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends MongoRepository<Song, ObjectId>  {

    @Query("{type: ?0}")
    List<Song> findByType(String type);
}


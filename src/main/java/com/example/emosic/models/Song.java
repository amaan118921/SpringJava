package com.example.emosic.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@NoArgsConstructor
@Data
@AllArgsConstructor
@Document(collection = "songs")
public class Song {
    @Id
    private ObjectId _id;
    private String songName;
    private String artistName;
    private String imgUrl;
    private String songUrl;
    private String type;
}

package com.africa.semicolon.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Data
@Document
public class Post {
    private String title;
    @Id
    private  String id;

    private LocalDateTime creationTime=LocalDateTime.now();

    private  String body;

    @DBRef
    private List<Comment> comments = new ArrayList<>();

//    public List<Comment> getComments() {
//        return comments;
//    }
//
//    public void setComments(List<Comment> comments) {
//        this.comments = comments;
//    }
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public LocalDateTime getCreationTime() {
//        return creationTime;
//    }
//
//    public void setCreationTime(LocalDateTime creationTime) {
//        this
//                .creationTime = creationTime;
//    }
//
//    public String getBody() {
//        return body;
//    }
//
//    public void setBody(String body) {
//        this.body = body;
//    }
//
//    @Override
//    public String toString() {
//        return "Post{" +
//                "title='" + title + '\'' +
//                ", id=" + id +
//                ", creationTime=" + creationTime +
//                ", body='" + body + '\'' +
//                ", comments=" + comments +
//                '}';
//    }
}

package com.africa.semicolon.services;

import com.africa.semicolon.data.models.Comment;
import com.africa.semicolon.data.models.Post;
import com.africa.semicolon.dtos.requests.CreatePostRequest;


import java.util.List;

public interface PostServices {

    void createPost(CreatePostRequest createPostRequest);


    void updatedPost(String id, String title, String body);


    void deletePost(String id);

    Post viewPost(String id);

    List<Post> viewAllPost();
    void addComment(String postId, Comment comment);
}
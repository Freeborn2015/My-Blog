 package com.africa.semicolon.controllers;


import com.africa.semicolon.data.models.Post;
import com.africa.semicolon.dtos.requests.CreatePostRequest;
import com.africa.semicolon.services.PostServices;
import com.africa.semicolon.services.PostServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {
@Autowired
    private PostServices postServices;
@PostMapping("/post")
    public String createPost(@RequestBody CreatePostRequest createPostRequest){
        postServices.createPost(createPostRequest);
        return "successful";

    }
    @GetMapping("/post/{postId}")
    public Post viewPost(@PathVariable String postId){
        return  postServices.viewPost(postId);

    }
}

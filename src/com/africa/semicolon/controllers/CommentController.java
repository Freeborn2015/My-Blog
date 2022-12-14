package com.africa.semicolon.controllers;

import com.africa.semicolon.dtos.requests.CreateCommentRequest;
import com.africa.semicolon.services.CommentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {
    @Autowired
    private CommentServices commentServices;

    @PostMapping("/comment")
    public String addComment(@RequestBody CreateCommentRequest createCommentRequest) {
        commentServices.createComment(createCommentRequest);
        return "Comment added";
    }
}

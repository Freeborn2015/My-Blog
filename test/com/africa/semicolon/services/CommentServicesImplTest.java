package com.africa.semicolon.services;

import com.africa.semicolon.dtos.requests.CreateCommentRequest;
import com.africa.semicolon.dtos.requests.CreatePostRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommentServicesImplTest {
    private  CommentServices commentServices;
    private  PostServices postServices;

    @BeforeEach
    void setUp() {
        commentServices = new CommentServicesImpl();
        postServices = new PostServicesImpl();
    }

    @Test
   public void createCommentTest() {
        CreatePostRequest createPostRequest = new CreatePostRequest();
        createPostRequest.setTitle("title");
        createPostRequest.setBody("body");
        postServices.createPost(createPostRequest);


        CreateCommentRequest createCommentRequest = new CreateCommentRequest();
        createCommentRequest.setCommenterName("Enny");
        createCommentRequest.setComment("A New Nigeria is possible");
        createCommentRequest.setPostId(1);


        commentServices.createComment(createCommentRequest);
        assertEquals(1, commentServices.viewAllComment().size());
    }
}
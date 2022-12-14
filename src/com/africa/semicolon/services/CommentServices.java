package com.africa.semicolon.services;

import com.africa.semicolon.data.models.Comment;
import com.africa.semicolon.dtos.requests.CreateCommentRequest;

import java.util.List;

public interface CommentServices {

    void  createComment(CreateCommentRequest createCommentRequest);


    void updateComment(String id, String comment, String commenterName);

    void deleteComment(String id);

    Comment viewComment(String id);

    List<Comment>viewAllComment();


    void addComment(String postId, String commenterName, String comment);


}

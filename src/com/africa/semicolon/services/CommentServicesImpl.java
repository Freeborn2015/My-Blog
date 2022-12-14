package com.africa.semicolon.services;

import com.africa.semicolon.data.models.Comment;
import com.africa.semicolon.data.repositories.CommentRepository;

import com.africa.semicolon.dtos.requests.CreateCommentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServicesImpl implements CommentServices{
    @Autowired
    private PostServices postServices;
    @Autowired
    private CommentRepository commentRepository ;

    @Override
    public void createComment(CreateCommentRequest createCommentRequest) {
        Comment comment = new Comment();
        comment.setComment(createCommentRequest.getComment());
        comment.setCommenterName(createCommentRequest.getCommenterName());
        Comment savedComment = commentRepository.save(comment);
        postServices.addComment(createCommentRequest.getPostId(), savedComment);






    }

    @Override
    public void updateComment(String id, String comment, String commenterName) {

    }

//    @Override
//    public void updateComme(CreateCommentRequest createCommentRequest) {
//
//    }

    @Override
    public void deleteComment(String id) {

    }

    @Override
    public Comment viewComment(String id) {
        return null;
    }

    @Override
    public List<Comment> viewAllComment() {
        return commentRepository.findAll();
    }

    @Override
    public void addComment(String postId, String commenterName, String comment) {

    }
}

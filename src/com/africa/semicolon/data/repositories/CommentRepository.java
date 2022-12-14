package com.africa.semicolon.data.repositories;

import com.africa.semicolon.data.models.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {


//        Comment save(Comment comment);
//
//        Comment findById(int id);
//
//        List<Comment> findAll();
//
//        Long count();
//
//        void  delete (Comment comment);
//
//        void delete(int id);
    }



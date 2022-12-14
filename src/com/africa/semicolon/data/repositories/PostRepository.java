package com.africa.semicolon.data.repositories;

import com.africa.semicolon.data.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PostRepository extends MongoRepository<Post, String>{
    Post findPostById(String id);



//    Post save(Post post);
//
//    Post findById(int id);
//
//    List<Post> findAll();
//
//    Long count();
//
//    void  delete (Post post);
//
//    void delete(int id);
}

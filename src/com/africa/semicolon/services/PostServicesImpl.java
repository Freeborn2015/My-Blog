package com.africa.semicolon.services;

import com.africa.semicolon.data.models.Comment;
import com.africa.semicolon.data.models.Post;
import com.africa.semicolon.data.repositories.PostRepository;

import com.africa.semicolon.dtos.requests.CreatePostRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostServicesImpl implements PostServices{
    @Autowired
    private PostRepository postRepository ;

    @Override
    public void createPost(CreatePostRequest createPostRequest) {
        Post post = new Post();
        post.setBody(createPostRequest.getBody());
        post.setTitle(createPostRequest.getTitle());
        postRepository.save(post);

    }

    @Override
    public void updatedPost(String id, String title, String body) {

    }

    @Override
    public void deletePost(String id) {

    }

    @Override
    public Post viewPost(String id) {
        return postRepository.findPostById(id);
    }

    @Override
    public List<Post> viewAllPost() {
        return postRepository.findAll();
    }

    @Override
    public void addComment(String id, Comment comment) {
        Post savedPost = postRepository.findPostById(id);
        savedPost.getComments().add(comment);
        postRepository.save(savedPost);

    }

//    @Override
//    public void addComment(int postId, String comment) {

//    }
}

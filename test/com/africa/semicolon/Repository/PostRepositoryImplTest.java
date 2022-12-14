package com.africa.semicolon.Repository;

import com.africa.semicolon.data.models.Post;
import com.africa.semicolon.data.repositories.PostRepository;
import com.africa.semicolon.data.repositories.PostRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostRepositoryImplTest {
    PostRepository postRepository;
    @BeforeEach
    void  setUp() {
        postRepository = new PostRepositoryImpl();
    }

    @Test
    public  void saveNewPost_countShouldBeOne_Test(){
        Post post = new Post();
        post.setBody("our body post");
        post.setTitle("our post title");
        postRepository.save(post);
        assertEquals(1L,postRepository.count());

    }

    @Test
    public void saveNewPost_findById_shouldReturnSavePostTest(){
        Post post = new Post();
        post.setBody("our body post");
        post.setTitle("our post title");
        postRepository.save(post);
        assertEquals(1L,postRepository.count());

        Post savedPost = postRepository.findById(1);
        assertEquals(post, savedPost);
        Post post2 = new Post();
        postRepository.save(post2);
        assertEquals(post2, postRepository.findById(2));

    }

    @Test
    public void savedNewPost_updatePost_countIsOneTest(){
        Post post = new Post();
        post.setBody("our body post");
        post.setTitle("our post title");
        postRepository.save(post);

        Post updatedPost = new Post();
        updatedPost.setId(1);
        updatedPost.setBody("updated body");
        updatedPost.setTitle("updated title");
        postRepository.save(updatedPost);
        assertEquals(1L, postRepository.count());
        assertEquals(post,postRepository.findById(1));
        assertEquals("updated body",post.getBody());
        assertEquals("updated title", post.getTitle());

    }

    @Test
    public  void deleteItem_countIsZeroTest(){
        Post post = new Post();
        post.setBody("our body post");
        post.setTitle("our post title");
        postRepository.save(post);

        Post post2 = new Post();
        post2.setBody("our body2 post");
        post2.setTitle("our post2 title");
        postRepository.save(post2);

        Post post3 = new Post();
        post3.setBody("our body3 post");
        post3.setTitle("our post3 title");
        postRepository.save(post3);

        Post post4= new Post();
        post4.setBody("our body4 post");
        post4.setTitle("our post4 title");
        postRepository.save(post4);

        assertEquals(4L,postRepository.count());
        postRepository.delete(1);
        assertEquals(3L, postRepository.count());
        postRepository.delete(4);
        assertEquals(2L,postRepository.count());

    }

}
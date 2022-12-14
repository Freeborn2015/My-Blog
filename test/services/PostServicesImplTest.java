package services;

import com.africa.semicolon.data.models.Comment;
import com.africa.semicolon.data.models.Post;
import com.africa.semicolon.dtos.requests.CreatePostRequest;
import com.africa.semicolon.services.PostServices;
import com.africa.semicolon.services.PostServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostServicesImplTest {
    private PostServices postServices;
    private  CreatePostRequest createPostRequest;

    @BeforeEach
    public void setUp() {
        postServices = new PostServicesImpl();
        createPostRequest = new CreatePostRequest();

    }

    @Test
    public void createPostTest() {
        //CreatePostRequest createPostRequest = new CreatePostRequest();
        createPostRequest.setBody("Welcome to my news blog");
        createPostRequest.setTitle("New Post");
        postServices.createPost(createPostRequest);
        assertEquals(1, postServices.viewAllPost().size());
    }

    @Test
    public void viewPostTest() {
        //CreatePostRequest createPostRequest = new CreatePostRequest();
        createPostRequest.setBody("Welcome to my news blog");
        createPostRequest.setTitle("New Post");
        postServices.createPost(createPostRequest);
        assertEquals(1, postServices.viewAllPost().size());

        Post post = postServices.viewPost(String.valueOf(1));
        assertEquals("New Post", post.getTitle());
        assertEquals("Welcome to my news blog", post.getBody());
//        assertNotNull(post.getCreationTime());
    }

    @Test
    public void addCommentTest() {
        //CreatePostRequest createPostRequest = new CreatePostRequest();
        createPostRequest.setBody("post body");
        createPostRequest.setTitle("post title");
        postServices.createPost(createPostRequest);
        Comment comment = new Comment();
        comment.setComment("God is good");
        postServices.addComment(String.valueOf(1),comment);

        Post savedPost = postServices.viewPost(String.valueOf(1));
        assertEquals(1, savedPost.getComments().size());
        assertEquals("God is good",savedPost.getComments().get(0).getComment());

    }
}



package com.africa.semicolon.Repository;

import com.africa.semicolon.data.models.Comment;
import com.africa.semicolon.data.repositories.CommentRepository;
import com.africa.semicolon.data.repositories.CommentRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CommentRepositoryImplTest {
    CommentRepository commentRepository;

    @BeforeEach
    void setUp() {
        commentRepository = new CommentRepositoryImpl();
    }
    @Test
    public void commentCanBeSavedTest(){
        Comment comment = new Comment();
        comment.setComment("nice post");
        comment.setCommenterName("Benny Khan");
        commentRepository.save(comment);
        assertEquals(1L,commentRepository.count());
    }
    @Test
    public void savedComment_CanBe_FindById_AndReturnSAvedComment_Test(){
        Comment comment = new Comment();
        comment.setComment("nice post");
        comment.setCommenterName("Benny Khan");
        commentRepository.save(comment);
        assertEquals(1L,commentRepository.count());

        Comment savedComment = commentRepository.findById(1);
        assertEquals(comment,savedComment);

        Comment comment2 = new Comment();
        commentRepository.save(comment2);
        assertEquals(comment2,commentRepository.findById(2));


        }
        @Test
        public void testThatSavedCommentCanBeUpdated_Test(){
            Comment comment = new Comment();
            comment.setComment("nice post");
            comment.setCommenterName("Benny Khan");
            commentRepository.save(comment);

            Comment updatedComment = new Comment();
            updatedComment.setId(1);
            updatedComment.setComment("updated comment");
            updatedComment.setCommenterName("Benny Khan");
            commentRepository.save(updatedComment);
            assertEquals(1L,commentRepository.count());
            assertEquals(comment, commentRepository.findById(1));

        }
        @Test
    public void testThatI_CanDeleteItemFromTheDb_Ttest(){
            Comment comment = new Comment();
            comment.setComment("nice post");
            comment.setCommenterName("Benny Khan");
            commentRepository.save(comment);
            assertEquals(1L,commentRepository.count());

            commentRepository.delete(1);
            assertEquals(0L, commentRepository.count());
        }

    }



package com.youngseok.book.springboot.domain.posts;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    private PostsRepository repo;

    @After
    public void cleanup(){
        repo.deleteAll();
    }

    @Test
    public void load_posts(){
        //given
        String title = "My Title";
        String content = "Post Content goes here";
        repo.save(Posts.builder()
                        .title(title)
                        .content(content)
                        .author("Youngseok")
                        .build());

        //when
        Posts firstPost = repo.findAll().stream().findFirst().get();
//        List<Posts> allPosts = repo.findAll();
//        allPosts.get(0);

        //then
        assertEquals(title, firstPost.getTitle());
        assertEquals(content, firstPost.getContent());
        assertEquals("Youngseok", firstPost.getAuthor());
        assertEquals(1, firstPost.getId().intValue());
    }
}
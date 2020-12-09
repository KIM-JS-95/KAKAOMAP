package com.kakaomap.domain.posts;

//you should downgrade gradle version to 4.10.2
//gradlew wrapper --gradle-version 4.10.2

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanup(){
        postsRepository.deleteAll();
    }
    @Test
    public void 게시글_불러오기(){
        String add = "테스트 게시글";
        String type = "타입";

        postsRepository.save(Posts.builder()
                .add(add)
                .type(type)
                .build());

        List<Posts> postsList = postsRepository.findAll();

        Posts posts = postsList.get(0);
        assertThat(posts.getAdd()).isEqualTo(add);
        assertThat(posts.getType()).isEqualTo(type);
    }

}

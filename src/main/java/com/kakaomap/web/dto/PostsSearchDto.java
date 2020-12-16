package com.kakaomap.web.dto;

import com.kakaomap.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;

@Getter
public class PostsSearchDto {

    private Long id;
    private String add;
    private String type;

    public Posts toEntity() {
        Posts build = Posts.builder()
        .add(add)
        .type(type)
       .build();

        return build;
    }

    public PostsSearchDto(Posts entity){
        this.id=entity.getId();
        this.add=entity.getAdd();
        this.type=entity.getType();
    }
}

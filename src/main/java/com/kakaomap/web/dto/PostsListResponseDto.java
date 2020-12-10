package com.kakaomap.web.dto;

import com.kakaomap.domain.posts.Posts;
import lombok.Getter;


@Getter
public class PostsListResponseDto {
private Long id;
private String add;
private String type;

public PostsListResponseDto(Posts entity){
    this.id= entity.getId();
    this.add=entity.getAdd();
    this.type=entity.getType();
}
}

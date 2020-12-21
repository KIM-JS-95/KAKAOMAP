package com.kakaomap.web.dto;

import com.kakaomap.entity.clc;
import lombok.Getter;


@Getter
public class PostsListResponseDto {
private Long id;
private String add;
private String type;


public PostsListResponseDto(clc entity){
    this.id= entity.getId();
    this.add=entity.getAdd();
    this.type=entity.getType();
}
}

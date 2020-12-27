package com.kakaomap.web.dto;

import com.kakaomap.entity.clc;
import lombok.Builder;
import lombok.Getter;

@Getter
public class PostsSearchDto {

    private Long id;
    private String add;
    private String type;


    public PostsSearchDto(clc entity){
        this.id= entity.getId();
        this.add=entity.getAdd();
        this.type=entity.getType();
    }
}

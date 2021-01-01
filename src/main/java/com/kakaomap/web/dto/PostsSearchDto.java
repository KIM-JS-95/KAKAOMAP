package com.kakaomap.web.dto;

import com.kakaomap.entity.clc;
import lombok.Builder;
import lombok.Getter;

@Getter
public class PostsSearchDto extends clc{

    private Long id;
    private String add;
    private String type;
    private String keyword;


    public PostsSearchDto(clc entity){
        this.id= entity.getId();
        this.add=entity.getAdd();
        this.type=entity.getType();
    }
}

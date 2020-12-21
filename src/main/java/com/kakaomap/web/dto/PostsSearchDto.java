package com.kakaomap.web.dto;

import com.kakaomap.entity.clc;
import lombok.Getter;

@Getter
public class PostsSearchDto {

    private Long id;
    private String add;
    private String type;

    public clc toEntity() {
        clc build = clc.builder()
                .id(id)
        .add(add)
        .type(type)
       .build();
        return build;
    }

//    @Builder
//    public PostsSearchDto(Long id, String add, String type){
//        this.id=id;
//        this.add=add;
//        this.type=type;
//    }
}

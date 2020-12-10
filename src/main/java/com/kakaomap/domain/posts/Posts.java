package com.kakaomap.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(length =500, nullable = false)
    private String add;
    private String type;

    @Builder
    public Posts(String add, String type){
     this.add=add;
     this.type=type;
    }
}
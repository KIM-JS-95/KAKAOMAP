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
    private String state;
    private String region;

    private String type;

    @Builder
    public Posts(String state, String region, String type){
     this.state=state;
     this.region=region;
     this.type=type;
    }
}
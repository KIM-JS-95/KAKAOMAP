package com.kakaomap.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class clc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String agency;
    private String station;
    private String chargerID;
    private String type;
    private String region;
    private String state;
    private String add;
    private String time;
    private String amount;
    private String keyword;

    @Builder
    public clc(Long id, String add, String type){
        this.id=id;
     this.add=add;
     this.type=type;
    }
}
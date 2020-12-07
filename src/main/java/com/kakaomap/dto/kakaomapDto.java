package com.kakaomap.dto;

import java.sql.*;
import javax.persistence.*;

@Entity
public class kakaomapDto {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
@Column(name = "name")
    private String name;
}

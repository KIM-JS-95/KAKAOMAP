package com.kakaomap.Repository;

import com.kakaomap.entity.clc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public interface PostsRepository extends JpaRepository<clc,Long> {

    @Query("SELECT b FROM clc b WHERE b.add LIKE %?1%")
    List<clc> findByAdd(String add);
}

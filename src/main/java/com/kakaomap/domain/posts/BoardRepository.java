package com.kakaomap.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Posts, Long> {
    List<Posts> findByTitleContaining (String keyword);
}

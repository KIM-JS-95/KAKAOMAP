package com.kakaomap.domain.posts;

import com.kakaomap.Repository.PostsRepository;
import com.kakaomap.entity.clc;
import com.kakaomap.web.dto.PostsListResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Service
public class PostsService {
private final PostsRepository postsRepository;

@Transactional(readOnly = true)
    public List<PostsListResponseDto> findAllDesc(){
    return postsRepository.findAll().stream().map(PostsListResponseDto::new).collect(Collectors.toList());
}

    @Transactional
    public PostsListResponseDto findById(Long id){
        clc entity = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        return new PostsListResponseDto(entity);
    }


@Transactional(readOnly = true)
public List<PostsListResponseDto> findByAdd(String keyword){
    return postsRepository.findByAdd(keyword).stream().map(PostsListResponseDto::new).collect(Collectors.toList());
    }

}

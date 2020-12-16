package com.kakaomap.domain.posts;

import com.kakaomap.web.dto.PostsListResponseDto;
import com.kakaomap.web.dto.PostsSearchDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PostsService {
private final PostsRepository postsRepository;
private final BoardRepository boardRepository;

@Transactional(readOnly = true)
    public List<PostsListResponseDto> findAllDesc(){
    return postsRepository.findAllDesc().stream().map(PostsListResponseDto::new).collect(Collectors.toList());
}

    @javax.transaction.Transactional
    public List<PostsListResponseDto> searchPosts(String keyword){
        List<Posts> boards = boardRepository.findByTitleContaining(keyword);
        List<PostsListResponseDto> boardDtoList = new ArrayList<>();

        if(boards.isEmpty()) return boardDtoList;

        for(Posts board : boards){
            boardDtoList.add(this.convertEntityToDto(board));
        }

        return boardDtoList;
    }

    private PostsSearchDto convertEntityToDto(Posts board){
        return PostsSearchDto.builder()
                .add(board.getAdd())
                .type(board.getType())
                .build();
    }

}

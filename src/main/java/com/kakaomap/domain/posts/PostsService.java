package com.kakaomap.domain.posts;

import com.kakaomap.Repository.PostsRepository;
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

//    @Transactional
//    public List<PostsSearchDto> searchPosts(String keyword){
//        List<Posts> boards=postsRepository.findByTitleContaining(keyword);
//        List<PostsSearchDto> boardDtoList =new ArrayList<>();
//        if(boards.isEmpty())
//            return boardDtoList;
//
//        for(Posts board : boards){
//            boardDtoList.add(this.convertEntityToDto(board));
//        }
//
//        return boardDtoList;
//    }
//
//    private PostsSearchDto convertEntityToDto(Posts board){
//        return PostsSearchDto.builder()
//                .id(board.getId())
//                .add(board.getAdd())
//                .type(board.getType())
//                .build();
//    }

}

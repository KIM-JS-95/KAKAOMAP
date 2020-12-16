package com.kakaomap.web;

import com.kakaomap.domain.posts.PostsService;
import com.kakaomap.web.dto.PostsSearchDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

//메인페이지
@RequiredArgsConstructor
@Controller
public class KakaoController {

    private final PostsService postsService;
    private final BoardService boardService;

    // list로 출력한 posts 변수를 index.mustache 로 넘겨줌
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("posts", postsService.findAllDesc());
        return "index";
    }

    //검색
    @GetMapping("/board/search")
    public String search(@RequestParam(value= "keyword") String keyword, Model model){
        List<PostsSearchDto> SearchDto = boardService.searchPosts(keyword);
        model.addAttribute("boardList", SearchDto);
        return "board/index.mustach";

    }

    }


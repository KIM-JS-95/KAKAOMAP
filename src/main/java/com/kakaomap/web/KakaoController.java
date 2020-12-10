package com.kakaomap.web;

import com.kakaomap.domain.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//메인페이지
@RequiredArgsConstructor
@Controller
public class KakaoController {

    private final PostsService postsService;

    // list로 출력한 posts 변수를 index.mustache 로 넘겨줌
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("posts", postsService.findAllDesc());
        return "index";
    }

    //View.mustache로 전송해볼까?
    public String View(Model model){
        model.addAttribute("posts", postsService.findAllDesc());
        return "View";
    }

    }


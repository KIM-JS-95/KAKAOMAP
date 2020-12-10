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
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("posts", postsService.findAllDesc());

        return "index";
    }
    }


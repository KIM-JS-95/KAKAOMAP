package com.kakaomap.web;

import com.kakaomap.domain.posts.PostsService;
import com.kakaomap.web.dto.PostsListResponseDto;
import com.kakaomap.web.dto.PostsSearchDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//메인페이지
@RequiredArgsConstructor
@Controller
public class KakaoController {

    private final PostsService postsService;

    // list로 출력
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("posts", postsService.findAllDesc());
        return "index";
    }


    @GetMapping("/map/{id}")
    public String postsAdd(@PathVariable Long id, Model model) {
        PostsListResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);

        return "View";
    }

    @GetMapping("/{add}")
    public String search(@PathVariable String keyword, Model model) {
        System.out.println("what?=" + keyword);
        model.addAttribute("posts", postsService.findByAdd(keyword));

        return "index";
    }



    }


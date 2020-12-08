package com.kakaomap.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    //View.mustache 파일을 불러와 화면에 표시
    public String View(){
        return "View";
    }

}

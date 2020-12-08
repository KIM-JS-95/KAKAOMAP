package com.kakaomap.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Json으로 반환되기때문에 지도 표시가 안됨
@RestController
public class IndexController {

    @GetMapping("/")
    //Mainpage.mustache 파일을 불러와 화면에 표시
    public String View(){
        return "View";
    }

}

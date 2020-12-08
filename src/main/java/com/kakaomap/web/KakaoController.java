package com.kakaomap.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class KakaoController {

    @GetMapping("/map")
        public String View(){
            return "View";
        }
    }


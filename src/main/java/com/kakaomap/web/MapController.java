package com.kakaomap.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//지도
@Controller
public class MapController {
    @GetMapping("/map")
    public String View(){
        return "View";
    }
}

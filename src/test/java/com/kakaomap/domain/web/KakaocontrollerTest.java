package com.kakaomap.domain.web;

import com.kakaomap.web.KakaoController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = KakaoController.class)
public class KakaocontrollerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void map_return() throws Exception{
        String hello = "kakao";

        mvc.perform(get("/")).andExpect(status().isOk()).andExpect(content().string(hello));
    }
}

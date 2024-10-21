package com.catspot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "hello catspot!";
    }

    @GetMapping("/test2")
    public String test2() {
        return "hello catspot!!!!!!";
    }

    @GetMapping("/test3")
    public String test3() {
        // 예외 발생
        throw new RuntimeException("테스트 예외 발생");
    }
}

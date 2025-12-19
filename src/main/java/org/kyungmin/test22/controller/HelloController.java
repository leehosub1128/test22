package org.kyungmin.test22.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String home() {
        return "배포완성-이호섭"; // ← 본인 이름
    }
}

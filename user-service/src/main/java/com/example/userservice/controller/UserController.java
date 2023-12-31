package com.example.userservice.controller;

import com.example.userservice.vo.Greeting;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class UserController {

    private final Greeting greeting;
    @GetMapping("/heath-check")
    public String status() {
        return "It's working in User Service";

    }

    @GetMapping("/welcome")
    public String welcome() {
        return greeting.getMessage();

    }
}

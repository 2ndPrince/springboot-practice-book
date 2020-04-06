package com.youngseok.book.springboot.web;

import com.youngseok.book.springboot.web.dto.HelloResponseDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/book")
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping(value = "/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount){
        return new HelloResponseDto(name, amount);
    }
}

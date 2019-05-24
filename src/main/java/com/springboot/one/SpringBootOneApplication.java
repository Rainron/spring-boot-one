package com.springboot.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("hell")
public class SpringBootOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOneApplication.class, args);
    }


    @RequestMapping(value = "/{id}/{name}",method = RequestMethod.GET)
    public String hello(@PathVariable("id")String id,@PathVariable("name")String name){

        return String.format("{\"message\":\"hello %s %s\"}",id,name);

    }
}

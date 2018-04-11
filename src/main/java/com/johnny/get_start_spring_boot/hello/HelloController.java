package com.johnny.get_start_spring_boot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @RequestMapping("/hello")
  public String sayHi(){
    return "Hello Spring Boot, I'm learning on it";
  }
}

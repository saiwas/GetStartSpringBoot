package com.johnny.get_start_spring_boot.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
  
  @RequestMapping("/topics")
  public String getAllTopics(){
    return "Here are all topics";
  }
}

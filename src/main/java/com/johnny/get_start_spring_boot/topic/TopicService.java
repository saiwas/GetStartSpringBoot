package com.johnny.get_start_spring_boot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

  private List<Topic> topics = Arrays.asList(
    new Topic("Ruby", "ruby-name", "ruby-description"),
    new Topic("Java", "java-name", "java-description"),
    new Topic("CSharp", "csharp-name", "csharp-description"),
    new Topic("Javascript", "javascript-name", "javascript-description"),
    new Topic("React", "react-name", "react-description")
  );

  public List<Topic> getAllTopics(){
    return this.topics;
  }
}
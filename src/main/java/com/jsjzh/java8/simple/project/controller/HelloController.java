package com.jsjzh.java8.simple.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {

  @RequestMapping("/world")
  @ResponseBody
  public String hello () {
    return "Hello world";
  }
}

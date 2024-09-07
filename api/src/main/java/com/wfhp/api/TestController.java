package com.wfhp.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TestController {

  @RequestMapping("/test")
  public String test() {
    return "test 4";
  }
}

package com.boot.bootpract.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControl {

	@RequestMapping("/")
    @ResponseBody
    String home() {
      return "Hello World!";
    }
	
	@RequestMapping("/hello")
	public String sayHi(){
		return "Hi";
	}

}

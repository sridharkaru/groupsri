package com.boot.bootpract.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControl {
	
	@RequestMapping("/hello")
	public String sayHi(){
		return "Hi";
	}

}

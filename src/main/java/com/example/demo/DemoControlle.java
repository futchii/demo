package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class DemoControlle {

	@RequestMapping("/")
	public String test() 
    {
		return "test";
	}

    @RequestMapping("/test")
	public String index() 
    {
		return "index";
	}
}

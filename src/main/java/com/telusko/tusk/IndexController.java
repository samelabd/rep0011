package com.telusko.tusk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String home() {
		System.out.println("main page");
		return "index.jsp";
	}
	// EEEE Focus EEEEaas
	@RequestMapping("/xyz")
	public String feedback() {
		System.out.println("feedback page");
		return "feedback1.jsp";
	}
	
	@RequestMapping("/xxx")
	public String feedback(@RequestParam("name") String name,@RequestParam("comments") String comments,
			@RequestParam("email") String email) {
		System.out.println("feedback take params");
		System.out.println("*****  "+ name+"  email : "+email+" comments  " +comments); 

		return "feedback1.jsp";
	}
}
